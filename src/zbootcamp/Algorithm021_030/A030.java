package Algorithm021_030;

// https://school.programmers.co.kr/learn/courses/30/lessons/12903

// 가운데 글자 가져오기


/*
작동 원리
1. 문자열의 길이를 구함
2. 길이가 홀수인 경우
 정확한 가운데 인덱스를 계산해 해당 문자를 반환합니다
 length / 2 는 가운데 인덱스를 찾아 줍니다
3. 길이가 짝수인 경우 :
가운데 두 글자를 반환합니다
length / 2 - 1 부터 length / 2 + 1 까지의 부분 문자열을 추출합니다

예시
"abcde" -> "c" (홀수길이)
"qwer" -> "we" (짝수 길이)


class Solution {
    public String solution(String s) {
    // 문자열의 길이를 구함
    int length = s.length();

    // 문자열 길이가 홀수인 경우
    if (length % 2 == 1) {
        // 가운데 인덱스의 문자 반환
        return s.substring(length / 2, length / 2 +1);
    }
    // 문자열 길이가 짝수인 경우
    else {
        // 가운데 두 글자 반환
        return s.substring(length / 2 - 1, length / 2 + 1);
        }
    }
}

s.substring(length / 2, length / 2 + 1) 는 문자열에서 특정 부분을 추출하는 메서드

length / 2 는 문자열의 가운데 인덱스를 찾습니다
첫 번째 파라미터 length / 2는 시작 인덱스입니다
두 번째 파라미터 length / 2 + 1는 끝 인덱스입니다

예를 들어 "abcde" 라는 문자열이 있다고 가정해보겠습니다

문자열 길이는 5
length / 2 는 2

따라서 s.substring(2, 3) 은 "c" 를 반환합니다

substring() 메서드의 특징 :
첫 번째 인덱스는 포함됩니다
두 번째 인덱스는 제외됩니다

즉, substring(시작인덱스, 끝인덱스) 는 시작인덱스부터 끝인덱스 바로 전까지의 부분 문자열을 추출합니다




 */
public class A030 {
    public String solution(String s) {
        // 문자열의 길이를 구함
        int length = s.length();

        // 문자열 길이가 홀수인 경우
        if (length % 2 ==1) {
            // 가운데 인덱스의 문자 반환
            return s.substring(length / 2, length / 2 + 1 );
        }
        // 문자열 길이가 짝수인 경우
        else {
            // 가운데 두 글자 반환
            return s.substring(length / 2 - 1, length / 2 + 1);
        }
    }

    public static void main(String[] args) {
        A030 solution = new A030();

        // 테스트 케이스
        String[] testCases = {"abced", "qwer"};

        for (String testCase : testCases) {
            System.out.println("입력: " + testCase);
            System.out.println("출력: " + solution.solution(testCase));
            System.out.println();
        }
    }
}
