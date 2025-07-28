package Algorithm031_040;

public class A036 {
    public boolean solution(String s) {
        // 문자열 길이가 4 또는 6인지 확인
        if (s.length() !=4 && s.length() !=6) {
            return false;
        }

        // 모든 문자가 숫자인지 확인
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }

        // 길이 조건과 숫자 조건을 모두 만족하는 경우
        return true;
    }

    public static void main(String[] args) {
        A036 a036 = new A036();

        // 테스트 케이스
        String[] testCases = {"a234", "1234", "123456", "12345a", "12", "abcdef"};

        for (String s : testCases) {
            boolean result = a036.solution(s);
            System.out.println("입력: \"" + s + "\" -> 결과 : " + result);
        }
    }
}



/*

class Solution {
    public boolean solution(String s) {
    // 문자열 길이가 4 또는 6인지 확인
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        // 모든 문자가 숫자인지 확인
        for (int i = 0; i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }

        // 길이 조건과 숫자 조건을 모두 만족하는 경우
        return true;
    }
}


해설
이 문제는 문자열 s가 정확히 길이 4 또는 6 이고, 숫자로만 구성되어 있는지 확인하는
함수를 작성하는것

작동순서
1. 먼저 문자열s의 길이가 4또는 6인지 확인합니다. 둘 다 아니면 즉시 false를 반환합니다
2. 문자열의 각 문자를 순회하며 Character.isDigit() 메소드를 사용해 숫자인지 검사합니다
3. 숫자가 아닌 문자가 하나라도 발견되면 즉시 false를 반환합니다
4. 모든 검사를 통과하면 (길이가 4 또는 6이고 모든 문자가 숫자) true를 반환합니다


Character.isDigit() 는 주어진 문자가 숫자인지 확인하는 java의 정적 메서드

예시
boolean result = Character.isDigit(char c);
c가 숫자(0~9)라면 true 반환
숫자가 아니면 false 반환


for (int i = 0; i < s.length(); i++) {
    if(!Character.isDigit(s.charAt(i))) {
        return false;
    }
}

위 코드는 문자열 s 가 숫자로만 이루어져 있는지 확인하는 역할
한 글자씩 검사해서 숫자가 아닌 문자가 하나라도 있으면 false 반환

for (int i = 0; i < s.length(); i++) {
s 문자열의 길이만큼 i를 0부터 증가시키면서 반복
즉, 문자열 s의 모든 문자를 하나씩 확인

if (!Character.isDigit(s.charAt(i))) {
s.charAt(i) : s에서 i번째 문자 가져오기
Character.isDigit(...) : 그 문자가 숫자인지 확인
!(Not 연산자) : 숫자가 아니라면 true

return false;
숫자가 아닌 문자가 나옴녀 바로 false 반환하고 종료

\"     백슬래시와 큰 따옴표 : 문자열 내에서 큰 따옴표 자체를 표현할 때 사용
*/