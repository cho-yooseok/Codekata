package Algorithm031_040;


// https://school.programmers.co.kr/learn/courses/30/lessons/12940

// 최대공약수와 최소공배수


import java.math.BigInteger;
import java.util.Arrays;

public class A039 {
    public int[] solution(int n, int m) {
        // BigInteger의 gcd() 메서드로 최대공약수 계산
        int gcd = BigInteger.valueOf(n).gcd(BigInteger.valueOf(m)).intValue();

        // 최소공배수 = (n * m) / GCD
        int lcm = (n * m) / gcd;

        return new int[] {gcd, lcm};
    }

    // 테스트 실행코드
    public static void main(String[] args) {
        A039 sol = new A039();
        System.out.println(Arrays.toString(sol.solution(3,12)));  // [3, 12]
        System.out.println(Arrays.toString(sol.solution(2,5))); // [1, 10]
    }
}


/*
import java.math.BigInteger;
import java.util.Arrays;

class Solution {
    public int[] solution(int n, int m) {
        // BigInteger로 변환하여 GCD 계산
        int gcd = BigInteger.valueOf(n).gcd(BigInteger.valueOf(m).intValue();

        // LCM = (n * m) / GCD
        int lcm = (n * m) / gcd;

        return new int[] {gcd, lcm};
    }
}

최대공약수 (GCD)
BigInteger.gcd() 메서드로 쉽게 계산

최소공배수 (LCM)
공식 (n * m) / GCD 를 사용합니다

결과 반환
new int[] {gcd, lcm}로 배열 생성해 바로 반환




 */