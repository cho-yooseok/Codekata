package Algorithm021_030;

//  https://school.programmers.co.kr/learn/courses/30/lessons/12910


import java.util.ArrayList;  // 가변 크기 배열을 사용하기 위한 ArrayList 임포트
import java.util.Arrays;     // 배열 정렬을 위한 Arrays 클래스 임포트

public class A025 {
    /**
     * 배열에서 특정 숫자로 나누어 떨어지는 값만 골라 오름차순으로 정렬한 배열을 반환하는 함수
     *
     * @param arr     검사할 정수 배열    즉 숫자들이 담긴 상자
     * @param divisor 나누는 수
     * @return        함수가 끝났을 때 돌려주는 결과물 , 즉 나누어 떨어지는 값들을 오름차순으로 정렬한 배열 (없으면 [-1] 반환)
     */
    public int[] solution(int[] arr, int divisor) {
        // ArrayList는 크기가 자동으로 조절되는 배열로, 나누어 떨어지는 숫자를 임시로 저장
        ArrayList<Integer> result = new ArrayList<>();

        // 배열의 모든 원소를 하나씩 확인
        for (int i = 0; i < arr.length; i++) {
            // 현재 숫자가 divisor로 나누어 떨어지는지 확인
            // (나머지 연산자 %를 사용하여 나누었을 때 나머지가 0인지 검사)
            if (arr[i] % divisor == 0) {
                // 나누어 떨어진다면 결과 목록에 추가
                result.add(arr[i]);
                // arr[i]는 "상자 안의 i번째 숫자"를 의미
                //나눗셈의 나머지가 0이라면(즉 , 나누어 떨어진다면 )
                // 그 숫자를  result 상자에 넣는다
            }
        }

        // 나누어 떨어지는 숫자가 하나도 없는 경우
        if (result.isEmpty()) {
            // -1만 담긴 배열 반환
            //  [-1]  이라는 새 상자를 만들어서 돌려줌
            return new int[]{-1};
        }

        // ArrayList를 일반 배열로 변환
        int[] answer = new int[result.size()];
        //"result 상자의 크기와 같은 새로운 일반 상자를 만들어줘" 라는 뜻
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
            ///"result 상자의 i 번째 숫자를 꺼내서 answer 상자의 i번째 칸에 넣어줘"
        }

        // 배열을 오름차순으로 정렬
        Arrays.sort(answer);

        // 정렬된 배열 반환
        return answer;
    }

    /**
     * 메인 함수: 테스트 케이스를 실행하고 결과 출력
     */
    public static void main(String[] args) {
        // A025 객체 생성
        A025 sol = new A025();

        // 테스트 케이스 준비
        int[] arr1 = {5, 9, 7, 10};
        int divisor1 = 5;

        int[] arr2 = {2, 36, 1, 3};
        int divisor2 = 1;

        int[] arr3 = {3, 2, 6};
        int divisor3 = 10;

        // 테스트 케이스 실행
        int[] result1 = sol.solution(arr1, divisor1);
        int[] result2 = sol.solution(arr2, divisor2);
        int[] result3 = sol.solution(arr3, divisor3);
        //sol프로그램의 solution기능을 arr1과 divisor1 로 실행하고
        // 그 결과는 result1 이라는 상자에 담아줘      라는 뜻



        // 결과 출력 (배열을 문자열로 변환하여 출력)
        System.out.println("테스트 케이스 1 결과: " + Arrays.toString(result1));
        System.out.println("테스트 케이스 2 결과: " + Arrays.toString(result2));
        System.out.println("테스트 케이스 3 결과: " + Arrays.toString(result3));
        // Arrays.toString(result1) 은  "result1 상자 안의 숫자들을 보기 좋게
        //문자열로 바꿔줘  라는 뜻   예를 들어  [5,10]  과 같은 형태로 바꾸어줌
    }
}