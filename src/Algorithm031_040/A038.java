package Algorithm031_040;

// 직사각형 별찍기

// https://school.programmers.co.kr/learn/courses/30/lessons/12969

import java.util.Scanner;

public class A038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("가로 길이 n을 입력하세요:");
        int n = sc.nextInt();

        System.out.print("세로 길이 m을 입력하세요:");
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}

/*
import java.util.Scanner;

public class A038 {
    public static void main(String[] args) {
        // Scanner 객체 생성 - 사용자로부터 입력을 받기 위함
        Scanner sc = new Scanner(System.in);

        // 가로 길이 n 입력 받기
        int n = sc.nextInt();

        // 세로 길이 m 입력받기
        int m = sc.nextInt();

        // 세로 길이 만큼 반복 (m줄 만들기)
        for (int i = 0; i < m; i++) {
            // 가로 길이 만큼 반복 (한 줄에 n개의 별 출력)
            for (int j = 0; j < n; j++) {
                // 별(*) 문자 출력 (줄바꿈 없이)
                System.out.print("*");
            }
            // 한 줄이 끝나면 줄바꿈
            System.out.println();
        }

        // Scanner 자원 해제 (메모리 누수 방지)
        sc.close();
    }
}






 */


/*
 import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i  = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}


가로의 길이가  n, 세로 길이가 m  인 직사각형을 별(*)문자로 출력하는 문제입니다

Scanner를 사용하여 표준입력으로부터 두 정수 n과 m을 입력 받습니다
바깥쪽 for루프는 세로길이m을 처리합니다 (행)
안쪽 for루프는 가로길이n을 처리합니ㅏ다 (열)

안쪽 루프에서는 별(*) 문자를 출력하고, 바깥쪽 루프가 한번 끝날때마다 줄바꿈을 합니다

예를 들어 n=5, m=3 을 입력하면 다음과 같이 출력됩니다


*/
