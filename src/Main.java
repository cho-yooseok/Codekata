class Solution {
    public int solution(int num1, int num2) {
        return num1 - num2;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(10,4)); //6
        System.out.println(sol.solution(7,15)); //-8
    }
}
