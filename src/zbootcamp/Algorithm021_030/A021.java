package Algorithm021_030;

//   https://school.programmers.co.kr/learn/courses/30/lessons/12947

class Solution {
    // 하야드 수 여부를 판별하는 함수
    // 하샤드 수 : 자기 자신이 각 자릿수의 합으로 나누어 떨어지는 수
    public boolean solution(int x) {
        // 1단계 : 준비
        //입력받은 숫자 x를 임시 변수에 저장합니다
        //원본 값을 유지하기 위함입니다
        //계산 과정에서 x 값이 변하기 때문에 원래 값을 따로 보관해둡니다
        int originalNumber = x;

        //각 자릿수의 합을 저장할 변수를 선언합니다
        //처음에는 합이 0입니다
        int sum = 0;

        //2단계 : 각 자릿수의 합 계산하기
        //x의 모든 자릿수를 하나씩 추출하면서 합을 계산합니다
        //x가 0보다 클 동안 계속 반복합니다
        while (x > 0) {
            //x를 10을 나눈 나머지는 일의 자리 숫자입니다
            // 예 : 123 % 10 =3
            int digit = x % 10;

            //추출한 자릿수를 합계에 더합니다
            sum += digit;

            //x를 10으로 나누어 일의 자리를 제거하고 다음 자릿수로 이동합니다
            // 예 : 123 / 10 = 12 (소수점 이하는 버림)
            //이렇게 하면 다음 반복에서는 12의 일의 자리인 2를 추출하게 됩니다
            x /= 10;   //    x = x/10 과 같은 의미입니다
        }


        //3단계 : 하샤드 수 여부 확인
        //원본 숫자 (originalNumber) 가 자릿수의 합(sum) 으로 나누어 떨어지는지 확인합니다
        //떨어지는지 확인합니다

        //예 :   18 % 9 = 0
        //나머지가 0이면 하샤드 수입니다
        return originalNumber % sum == 0;
    }

    //프로그램의 시작점인 main함수입니다
    public static void main(String[] args) {
        //Solution 클래스의 인스턴스(객체)를 생성합니다
        Solution sol = new Solution();

        //테스트할 숫자들을 배열에 저장합니다
        int[] testCases = {10, 12, 18, 19, 21, 100, 111, 9999};


        for(int test : testCases) {
            System.out.println("숫자: " + test + " -> 하샤드 수 여부 :" + sol.solution(test));
        }

    }
}