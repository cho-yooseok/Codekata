package Algorithm021_030;

public class A022 {
    //두 정수 사이의 모든 정수 합을 계산하는 함수
    public long solution (int a, int b) {
        //함수(메서드) 선언
        //solution  :   함수(메서드)의 이름
        //(int a, int b)는 함수의 매개변수
        //int a 와 int b 는 이 함수가 호출될때 입력으로 받을 두 개의 정수를 의미

        // 1단계  :   a와 b의 크기 비교
        // a와 b의 대소관계가 정해져 있지 않으므로
        //항상 작은 값을 시작점, 큰 값을 끝점으로 설정합니다
        long start = Math.min(a,b);     // a와 b중 작은 값
        long end = Math.max(a,b);       // a와 b중 큰 값

        //2단계   :   두 정수 사이의 합 계산
        //방법 1 : 반복문을 사용하여 하나씩 더하기

        long sum = 0;
        for (long i = start; i <= end; i++) {
            sum += i;   // start 부터 end 까지 모든 정수를 더합니다
        }
        return sum;
    }


    public static void main(String[] args){
        //A022 클래스의 인스턴스(객체) 생성
        A022 solution = new A022();
        //solution은 A022클래스의 인스턴스(객체)이며, 이 객체를 통해
        //solution 메서드를 호출할 수 있다.


        //테스트 케이스 실행 및 결과 출력
        System.out.println("3과 5 사이의 정수 합 : " + solution.solution(3,5));
        System.out.println("5과 3 사이의 정수 합 : " + solution.solution(5,3));
        System.out.println("3과 3 사이의 정수 합 : " + solution.solution(3,3));
        System.out.println("-2과 2 사이의 정수 합 : " + solution.solution(-2,2));
        System.out.println("1과 10 사이의 정수 합 : " + solution.solution(1,10));
    }
}
