// A035 부족한 금액 계산하기

// https://school.programmers.co.kr/learn/courses/30/lessons/82612

/*
class Solution {
    public long solution(int price, int money, int count) {
        // 총 필요한 금액 계산
        long totalCost = 0;
        for (int i = 1; i <= count; i++) {
            totalCost += (long)price * i;
            }

            // 부족한 금액 계산
            long shortage = totalCost -money;

            // 부족하지 않으면 0 반환, 부족하면 부족한 금액 반환
            return Math.max(0, shortage);
            }
        }


 */

public class A035 {
    public static void main(String[] args) {
        // 예시 입력값 : price=3, money=20, count=4
        int price = 3;
        int money = 20;
        int count = 4;

        long result = solution(price, money, count);
        System.out.println("부족한 금액:" + result);

        // 추가 테스트 케이스
        System.out.println("테스트 케이스 2: " + solution(5, 50, 7));
        System.out.println("테스트 케이스 3: " + solution(1, 1000, 50));
    }

    public static long solution(int price, int money, int count) {
        // 총 필요한 금액 계산 (반복문 활용)
        long totalCost = 0;
        for (int i = 1; i <= count; i++) {
            totalCost += (long)price * i;
        }
        // 현재 과정 출력
        System.out.println("이용료: " + price);
        System.out.println("가진 금액: " + money);
        System.out.println("이용 횟수: " + count);
        System.out.println("총 필요한 금액: " + totalCost);

        // 부족한 금액 계산
        long shortage = totalCost - money;

        // 부족하지 않으면 0 반환, 부족하면 부족한 금액 반환
        return Math.max(0, shortage);
    }
}