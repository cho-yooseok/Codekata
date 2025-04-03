package Algorithm031_040;

// https://school.programmers.co.kr/learn/courses/30/lessons/12917

// 문자열 내림차순으로 배치하기

import java.util.Arrays;

/*
1.문제의 요구사항
주어진 문자열을 큰 것부터 작은 순으로 정렬해야한다
대문자는 소문자보다 작은것으로 간주한다

2. 해결방법 단계
문자열을 문자배열로 바꾼다
그 배열을 오름차순으로 정렬한다
정렬된 배열을 뒤집어 내림차순으로 만든다


중요
Arrays.sort()
기본적으로 ascii코드 순서로 정렬

StringBuilder().reverse()
배열을 뒤집어 내림차순 만듦

ascii 코드 순서 참고
대문자 (A-Z) : 65-90
소문자 (a-z) : 97-122
숫자(0-9) : 48-57

 */
class A034 {
    public String solution(String s) {
        // 문자열을 char 배열로 변환
        char[] charArray = s.toCharArray();

        // char 배열을 내림차순으로 정렬
        Arrays.sort(charArray);

        // 정렬된 char 배열을 역순으로 뒤집기
        StringBuilder result = new StringBuilder(new String(charArray)).reverse();

        // 문자열로 변환하여 반환
        return result.toString();
    }

    public static void main(String[] args) {
        A034 solution = new A034();

        // 테스트 케이스 1
        String s1 = "Zbcdefg";
        System.out.println("입력: " + s1);
        System.out.println("출력: " + solution.solution(s1)); // "gfedcbZ" 출력

        // 테스트 케이스 2
        String s2 = "Hello";
        System.out.println("입력: " + s2);
        System.out.println("출력: " + solution.solution(s2)); // "olleH" 출력
    }
}