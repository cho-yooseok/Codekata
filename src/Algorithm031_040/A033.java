package Algorithm031_040;

public class A033 {
    public int solution(int left, int right) {
        int answer = 0;

        // left 부터 right 까지 순회
        for (int num = left; num <= right; num++) {
            // 약수의 개수 계산
            int divisorCount = countDivisors(num);

            // 약수의 개수가 짝수면 더하고, 홀수면 빼기
            if (divisorCount % 2 == 0) {
                answer += num;
            } else {
                answer -= num;
            }
        }

        return answer;
    }

    // 약수의 개수를 계산하는 메서드
    private int countDivisors(int num) {
        int count = 0;

        // 1부터 num까지 순회하며 약수 계산
        for(int i = 1; i <= num; i ++) {
            if (num % i == 0) {
                count ++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        A033 solution = new A033();

        // 첫 번째 테스트 케이스
        System.out.println("left = 13, right = 17: " + solution.solution(13, 17)); // 43 출력

        // 두 번째 테스트 케이스
        System.out.println("left = 24, right = 27: " + solution.solution(24, 27)); // 52 출력
    }
}

/*
1. solution 메서드
left 부터 right 까지 모든 수를 순회합니다
각 수의 약수 개수를 countDivisors 메서드로 계산합니다
약수의 개수가 짝수면 더하고, 홀수면 뺍니다

2. countDivisors 메서드
주어진 숫자의 약수 개수를 계산합니다
1부터 해당 숫자까지 나누어 떨어지는 수의 개수를 셉니다
 */
