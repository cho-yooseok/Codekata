package Algorithm031_040;

// https://school.programmers.co.kr/learn/courses/30/lessons/70128

//  내적

public class A032 {
    public int solution(int[] a, int[] b) {
        int result = 0;

        // 배열의 각 요소를 곱하고 합상
        for (int i = 0; i < a.length; i++) {
            result += a[i] * b[i];
        }

        return result;
    }

    public static void main(String[] args) {
        A032 solution = new A032();

        // 테스트 케이스
        int[] a1 = {1, 2, 3, 4};
        int[] b1 = {-3, -1, 0, 2};
        System.out.println("테스트 케이스 결과: " + solution.solution(a1, b1)); // 3 출력

    }
}
