package Algorithm031_040;

// 3진법 뒤집기

// https://school.programmers.co.kr/learn/courses/30/lessons/68935

/*
문제는 주어진 자연수n을 3진법으로 변환하고, 그것을 앞뒤로 뒤집은 후 다시
10진법으로 변환하는것

1. 주어진 숫자 n을 3진법으로 변환한다
2. 3진법으로 표현된 문자열을 뒤집는다
3. 뒤집어진 3진법 문자열을 다시 10진법으로 변환한다

예를 들어
n=45 일때
45를 3진법으로 변환하면 1200

0*1 + 0*3 + 2*삼의제곱9 + 1*삼의세제곱27

18+ 27 = 45

이를 뒤집으면 0021

0021을 10진법으로 변환하면

1*1 + 2* 3 = 7

class Solution {
    public int solution (int n) {
    // 10진법 -> 3진법으로 변환
    String ternary = "";
    while (n > 0) {
        ternary = (n%3) + ternary;
        n /= 3;
    }

    // 3진법 문자열 뒤집기
    StringBuilder reversed = new StringBuilder(ternary);
    reversed = reversed.reverse();

    // 뒤집은 3진법 -> 10진법으로 변환
    int answer = 0;
    for (int i = 0; i < reversed.length(); i++) {
        // 각 자리의 숫자를 추출하고 3^자릿수를 곱해서 더함
        int digit = reversed.charAt(i) - '0';
        answer += digit * Math.pow(3, reversed.length() - 1 - i);
    }

    return answer;
  }
}



 */
class A040 {
    public int solution(int n) {
        // 10진법 -> 3진법으로 변환
        String ternary = "";
        int num = n;
        while (num > 0) {
            ternary = (num % 3) + ternary;
            num /= 3;
        }

        // 3진법 문자열 뒤집기
        StringBuilder reversed = new StringBuilder(ternary);
        reversed = reversed.reverse();

        // 뒤집은 3진법 -> 10진법으로 변환
        int answer = 0;
        for (int i = 0; i < reversed.length(); i++) {
            // 각 자리의 숫자를 추출하고 3^자릿수를 곱해서 더함
            int digit = reversed.charAt(i) - '0';
            answer += digit * Math.pow(3, reversed.length() - 1 - i);
        }

        return answer;
    }

    // 테스트를 위한 메인 메서드
    public static void main(String[] args) {
        A040 sol = new A040();

        // 테스트 케이스 1: n=45
        int result1 = sol.solution(45);
        System.out.println("입력값: 45, 결과: " + result1); // 예상 결과: 7

        // 테스트 케이스 2: n=125
        int result2 = sol.solution(125);
        System.out.println("입력값: 125, 결과: " + result2); // 예상 결과: 229

        // 추가 테스트 케이스: n=100,000,000 (최대 입력값)
        int result3 = sol.solution(100000000);
        System.out.println("입력값: 100000000, 결과: " + result3);
    }
}
