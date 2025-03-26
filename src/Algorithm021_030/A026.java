package Algorithm021_030;

// https://school.programmers.co.kr/learn/courses/30/lessons/76501

// 음양 더하기

/*
이 문제는 두 개의 배열을 받아서 실제 정수의 합을 구하는것

absolutes 배열 : 숫자들의 절댓값을 담고 있다.
signs 배열 : 각 숫자의 부호(양수/음수)를 결정한다

코드 작동 방식
1. sum 변수를 0으로 시작한다
이곳에 최종 합계가 쌓일 예정

2. for 반복문을 사용해 배열의 모든 원소를 차례로 처리한다
i는 0부터 시작해 배열의 길이만큼 반복한다

3. 부호 결정 로직
signs[i] 가 true 이면 양수로 계산 예 [4, true] -> 4 로 계산
signs[i] 가 false 이면 음수로 계산 예 [4, false] -> -4로 계산
 */


/*
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        // absolutes와 signs 배열을 순회하며 합 계산
        for (int i = 0; i < absolutes.length; i++) {
            // signs[i] 가 true이면 양수, false 이면 음수로 계산
            sum += signs[i] ? absolutes[i] : -absolutes[i]
            }

            return sum;
        }
    }



    개별 해설
    public int solution(int[] absolutes, boolean[]signs)
    int :
    이 메서드가 정수(integer)값을 반환한다는 의미
    즉, 이 메서드는 실행 후 최종적으로 정수 하나를 돌려준다

    solution :
    메서드(함수)의 이름

    (int[] absolutes, boolean[] signs)   :
    이 메서드에 전달되는 매개변수(인자)들입니다
    int[] absolutes : 정수 배열
    boolean[] signs : 논리 배열 (true/false) 배열


    자세한 주석 버전

    class Solution {
        public int solution(int[] absolutes, boolean[] signs) {
            // 최종 합계를 저장할 변수 초기화
            // 처음에는 0으로 시작해서 하나씩 더해갈 예정
            int sum = 0;

            // 배열의 길이만큼 반복하면서 각 숫자 처리
            // i는 배열의 인덱스를 나타내는 변수 (0부터 시작)
            for (int i = 0; i < absolutes.length; i++) {
                // 각 숫자의 부호를 결정하는 조건문
                if (signs[i] == true) {
                    // signs[i] 가 true 면 양수로 계산
                    // 그대로의 절댓값을 sum에 더함
                    sum += absolutes[i];
                } else {
                    // signs[i]가 false면 음수로 계산
                    // 절댓값에 -1을 곱해 음수로 만들어 sum에 더함
                        sum += -absolutes[i];
                    }
                }

                // 모든 숫자를 처리한 후 최종 합계 반환
                return sum;
            }
        }


 */
public class A026 {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for (int i = 0; i < absolutes.length; i++) {
            // signs[i] 가 true이면 양수, false이면 음수로 계산
            sum += signs[i] ? absolutes[i] : -absolutes[i];
        }
        return sum;
    }

    // 메인 메서드 - 프로그램 실행 진입점
    public static void main(String[] args) {
        // 클래스 인스턴스 생성
        A026 solution = new A026();

        // 테스트 케이스 1
        int[] absolutes1 = {4, 7, 12};
        boolean[] signs1 = {true, false, true};
        int result1 = solution.solution(absolutes1, signs1);
        System.out.println("테스트 케이스 1 결과" + result1);
    }
}

// java에서는 변수명과 메서드명을 소문자로 시작하는것이 일반적인 코딩 컨벤션

// sum += signs[i] ? absolutes[i] : -absolutes[i];

/*
위 부분은 3항 연산자를 사용한 조건 계산이다

sum += signs[i] ? absolutes[i] : -absolutes[i];

if - else 로 풀어쓰면
if(signs[i] == true) {
    sum = sum + absolutes[i]; //양수로 더함
} else {
    sum = sum + (-absolutes[i]); // 음수로 더함
}

조건 ? 조건이 참일 때의 값 : 조건이 거짓일 때의 값


번외 3항 연산자 쉬운 예시
1. 최댓값 구하기
int max = (a > b) ? a : b

2. 짝수/홀수 판별
String result = (number % 2 == 0) ? "짝수" : "홀수";

3. 성인/ 미성년자 판별
String statues = (age >= 19) ? "성인" : "미성년자";

4. 간단한 문자열 선택
String message = (score >= 60) ? "합격" : "불합격";

결과 = (조건) ? 참일때값 : 거짓일때값;
쉽게 말해 if-else를 한줄로 줄인것
 */