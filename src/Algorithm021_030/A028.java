package Algorithm021_030;

// https://school.programmers.co.kr/learn/courses/30/lessons/86051

// 없는 숫자 더하기


/*
1. 문제 접근 방법
0부터 9까지의 총합은 0+1+2+3+4+5+6+7+8+9 = 45 입니다
주어진 배열의 숫자들을 하나씩 빼면, 남은 값이 없는 숫자들의 합입니다

2.코드로직
totalSum 을 45로 초기화
배열의 모든 숫자를 totalSum에서 빼기
남은 totalSum이 찾을 수 없는 숫자들의 합

for (int num : numbers) : 배열의 모든 원소를 순회하는 향상된 for문
totalSum -= num : 각 숫자를 총합에서 빼기


 */
public class A028 {
    public int solution(int[] numbers) {
        // 0부터 9까지의 합
        int totalSum = 45;

        // numbers 배열의 모든 수를 합산
        for(int num : numbers) {
            totalSum -=num;
        }

        // 남은 값이 찾을 수 없는 숫자들의 합
        return totalSum;

    }

    // 메인 메서드 - 프로그램 실행 및 테스트를 위한 메서드
    public static void main(String[] args) {
        A028 solution = new A028();

        // 테스트 케이스 1
        int[] numbers1 = {1, 2, 3, 4, 6, 7, 8, 0};
        int result1 = solution.solution(numbers1);
        System.out.println("테스트 케이스 1:");
        System.out.println("입력 배열: " + java.util.Arrays.toString(numbers1));
        System.out.println("없는 숫자들의 합: " + result1);

        // 테스트 케이스 2
        int[] numbers2 = {5, 8, 4, 0, 6, 7, 9};
        int result2 = solution.solution(numbers2);
        System.out.println("\n테스트 케이스 2:");
        System.out.println("입력 배열: " + java.util.Arrays.toString(numbers2));
        System.out.println("없는 숫자들의 합: " + result2);
    }
}

/*
향상된 for 문 (foreach)
배열의 모든 원소를 순서대로 처리하는 반복문
for(변수타입 변수명 : 배열이름) 형태로 사용합니다


 */