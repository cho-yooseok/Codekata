package Algorithm021_030;

// https://school.programmers.co.kr/learn/courses/30/lessons/12948

// 핸드폰 번호 가리기

/*
class Solution {
    public String solution(String phone_number) {
        // 전화번호의 길이
        int length = phone_number.length();

        // 마지막 4자리를 제외한 앞부분을 *로 대체
        String maskedPart = phone_number.substring(0, length -4).replaceAll(".","*");

        // 마지막 4자리 추출
        String lastFourDigits = phone_number.substring(length -4);

        // 마스킹된 부분과 마지막 4자리 결합
        return maskedPart + lastFourDigits;
    }

    // 코드 로직 분석
    substring() 메서드를 사용해 문자열을 자릅니다
    replaceAll() 메서드로 앞부분의 숫자를 *로 대체합니다

    코드 동작 과정
    전체전화번호 길이를 구한다
    마지막 4자리를 제외한 앞부분을 *로 대체한다
    마지막 4자리는 그대로 유지한다
    두 부분을 결합해 최종 문자열을 만든다

    주요 메서드 설명
    substring(0, length -4)
    마지막 4자리를 제외한 앞부분 추출

    replaceAll(".","*")
    모든 문자를 *로 대체
    . 은 모든 문자와 일치하는 정규표현식

 */
public class A027 {
    public String solution(String phone_number) {
        // 전화번호의 길이
        int length = phone_number.length();

        // 마지막 4자리를 제외한 앞부분을 *로 대체
        String maskedPart = phone_number.substring(0, length - 4).replaceAll(".", "*");

        // 마지막 4자리 추출
        String lastFourDigits = phone_number.substring(length - 4);

        // 마스킹된 부분과 마지막 4자리 결합
        return maskedPart + lastFourDigits;
    }

    // 메인 메서드 - 프로그램 실행 및 테스트를 위한 메서드
    public static void main(String[] args) {
        A027 solution = new A027();

        // 테스트 케이스 1
        String phoneNumber1 = "01033334444";
        String result1 = solution.solution(phoneNumber1);
        System.out.println("테스트 케이스 1:");
        System.out.println("원본 번호: " + phoneNumber1);
        System.out.println("마스킹된 번호: " + result1);

        // 테스트 케이스 2
        String phoneNumber2 = "027778888";
        String result2 = solution.solution(phoneNumber2);
        System.out.println("\n테스트 케이스 2:");
        System.out.println("원본 번호: " + phoneNumber2);
        System.out.println("마스킹된 번호: " + result2);
    }
}