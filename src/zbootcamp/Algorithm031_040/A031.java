package Algorithm031_040;

// https://school.programmers.co.kr/learn/courses/30/lessons/12922

public class A031 {
    public String solution(int n) {
        String result = ""; // 빈 문자열 생성

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) { // 짝수 번째
                result += "수"; // "수" 추가
            } else { // 홀수 번째
                result += "박"; // "박" 추가
            }
        }
        return result; // 결과 반환
    }

    public static void main(String[] args) {
    A031 solution = new A031();

    // 테스트 케이스
    System.out.println("n=3" + solution.solution(3)); // "수박수" 출력
    System.out.println("n=4" + solution.solution(4)); // "수박수박" 출력
    System.out.println("n=5" + solution.solution(5)); // "수박수박수" 출력
    }
}
