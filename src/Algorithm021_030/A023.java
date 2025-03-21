package Algorithm021_030;

// https://school.programmers.co.kr/learn/courses/30/lessons/12943

public class A023 {
    public int solution(int num) {
        //입력값이 int 범위를 벗어날 수 있으므로 long타입 사용
        long n = num;
        /*
        콜라츠 추측을 검증하는 함수
        1. 입력된 수가 짝수라면 2로 나눕니다
        2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다
        3. 결과로 나온 수에 같은 작업을 1이 될때까지 반복합니다

        @param num 검증할 정수 (1이상 8,000,000 미만)
        @return 작업을 반복한 횟수 (주어진 수가 1인)
         */

        //반복 횟수
        int count = 0;

        //주어진 수가 1인 경우 0반환
        if (n == 1) {
            return 0;
        }

        //n이 1이 될때 까지 반복
        while (n != 1) {
            //반복 횟수가 500을 초과하면 -1 반환
            if(count >= 500) {
                return -1;
            }

            //짝수인 경우 : 2로 나눔
            if (n % 2 == 0) {
                n /= 2;
            }
            //홀수인 경우 : 3을 곱하고 1을 더함
            else {
                n = n * 3 + 1;
            }

            //반복 횟수 증가
            count ++;
        }

        //최종적으로 1에 도달했을 때 반복 횟수 반환
        return count;
    }

    /*
    메인함수 : 테스트 케이스를 실행하고 결과를 출력
     */
    public static void main(String[] args) {
        A023 sol = new A023();

        //테스트할 숫자 배열
        int[] testCases = {6,16,626331};

        // 각 테스트 케이스에 대해 반복
        for (int num : testCases) {
            int result = sol.solution(num);
            System.out.println ("입력값 : " + num + ", 결과 :" + result);
        }
    }
}
