package Algorithm021_030;

// https://school.programmers.co.kr/learn/courses/30/lessons/12935

// 제일 작은 수 제거하기

/*
문제 요구 사항
주어진 정수 배열에서 가장 작은 수를 제거
배열의 길이가 1이면 [-1] 반환
배열의 모든 원소는 서로 다른 값을 가짐

알고리즘 동작 방식
배열의 길이가 1이면 즉시 [-1]반환
배열을 순회하며 가장 작은 수의 인덱스 찾기
새로운 배열을 생성하여 가장 작은 수를 제외한 나머지 원소 복사

int[] : 반환타입
정수 배열을 반환한다는 의미
배열의 원소들이 정수라는 뜻

(int[] arr)    :  메서드의 매개변수
int[] 는 정수 배열 타입
arr은 매개변수의 이름
이 메서드를 호출할 때 정수 배열을 입력받음

예를 들어
int[] myArray = {4,3,2,1};
int[] result = solution(myArray);

public int[] solution      :   정수배열을 반환하는 메서드

public int[] solution(int[] arr)      이 메서드는   (정수배열 arr)    을   매개변수로 입력받아서 실행된다

public int[] solution(int[] arr) {
    // 메서드 내용
    return new int[]{1,2,3};  // 정수 배열 반환
}


우리가 만드는 이 함수는 마치 ' 가장 작은 숫자를 골라내는 로봇' 과 같다

public int[] solution(int[] arr) {
    // 1. 만약 배열에 숫자가 하나밖에 없다면? -> [-1] 반환
    if (arr.length == 1) {
        return new int[]{-1};
    }

    // 2. 가장 작은 숫자의 위치 찾기
    배열에서 가장 작은 숫자의 위치(인덱스)를 찾는 부분이다
    int minIndex = 0; // 처음에는 첫 번째 숫자가 가장 작다고 가정한다
    for (int i = 1; i < arr.length; i++) { // 배열의 두 번째 숫자부터 비교 시작
        if (arr[i] < arr[minIndex]) { // 현재 숫자가 지금까지 찾은 가장 작은 숫자보다 작다면
            minIndex = i; // 그 숫자의 위치(인덱스)를 기억해요
        }
    }

    예를 들어 [4,3,2,1] 배열이 있다고 해보자
    1. 처음에는 minIndex는 0 (4의 위치)
    2. 첫 번째 비교 : 3과 4 비교 -> 3이 더 작음
    -> minIndex 는 1로 변경


    복사하기 게임 처럼 생각해보라
    // 새 배열에 숫자 담기
    for (int i = 0, j = 0; i < arr.length; i++) {
        if (i != minIndex) { // 가장 작은 숫자의 위치가 아니라면
            answer[j++] = arr[i]; // 새 배열에 숫자 복사


   for (int i = 0, j = 0; i < arr.length; i++)
   i = 0 : 첫 번째 숫자부터 시작하겠다
   j = 0 : 새 배열에 숫자를 넣을 때 사용할 인덱스
   i < arr.length : 배열의 모든 숫자를 다 확인할 때 까지 반복
   i++ : 매번 반복할 때마다 i를 1씩 증가시킴

   마치 배열을 순서대로 훑어보는 것과 같다


 if (i != minIndex)
 는 "현재 위치가 가장 작은 숫자의 위치와 다르다면" 이라는 뜻

answer[j++] = arr[i]; 는 "새 배열의 j번째 위치에 arr의 i번째 숫자를 넣고
j를 다음 위치로 이동시켜라

예를 들어 [4,3,2,1] 배열에서
j는 새 배열의 현재 위치
arr[i] 는 원래 배열의 현재 숫자
j++ 는 "이 위치에 넣고 나서 다음 위치로 가!" 라는 의미




 */

public class A029 {
    public int[] solution(int[] arr) {
        // 배열에 숫자가 딱 한개라면 [-1] 반환
        if (arr.length == 1) {
            return new int[]{-1};
        }

        // 가장 작은 숫자의 위치 찾기
        // 처음엔 첫 번째 숫자가 가장 작다고 가정
        int smallestIndex = 0;

        // 배열의 모든 숫자 확인하면서 가장 작은 숫자 찾기
        for (int i = 0; i < arr.length; i++) {
            // 만약 현재 숫자가 지금까지 찾은 가장 작은 숫자보다 작다면
            // 가장 작은 숫자의 위치 변경
            if (arr[i] < arr[smallestIndex]) {
                smallestIndex = i;
            }
        }

        // 가장 작은 숫자 제외한 새 배열 만들기
        // 원래 배열보다 1개 적은 크기의 배열 생성
        int[] result = new int[arr.length - 1];

        // 가장 작은 숫자 빼고 나머지 숫자들 새 배열에 복사
        // 새 배열의 현재 위치를 추적할 변수
        int resultIndex = 0;

        // 원래 배열의 모든 숫자 확인
        for (int i = 0; i < arr.length; i++) {
            // 현재 위치가 가장 작은 숫자 위치와 다르다면
            if (i != smallestIndex) {
                // 현재 숫자를 새 배열에 넣기
                result[resultIndex] = arr[i];
                // 새 배열의 다음 위치로 이동
                resultIndex++;
            }
        }

        // 가장 작은 숫자 제외한 새 배열 반환
        return result;

    }

    // 코드 테스트를 위한 메인 메서드
    public static void main(String[] args) {
        A029 solution = new A029();

        // 테스트 케이스 1 : 여러 숫자가 있는 배열
        int[] test1 = {4, 3, 2, 1};
        int[] result1 = solution.solution(test1);
        System.out.print("테스트 1 결과: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}

//  System.out.print(num + " ");   에서 " "   따옴표는 숫자들 사이에 공백을 주기 위해서

/*
for (int num : result2) 의미 :
    result2 배열의 모든 숫자를 순서대로 반복
    각 숫자를 num이라는 변수에 순서대로 담아서 처리
    배열의 첫 번째 숫자부터 마지막 숫자까지 자동으로 반복


    result[resultindex] = arr[i];
    을 활용한 쉬운 예시

class A029 {
    public static void main(String[] args) {
        // 음료수 배열 생성 (초기재고)
        String[] drinks = {"콜라" , "사이다", "환타", "제로", "우롱차"};

       // 품절된 음료 위치 찾기
       int soldOutIndex = 2; // 환타 품절

       // 새 재고 배열 만들기
       String[] newDrinks = new String[drinks.length -1];

           // 품절 음료 제외하고 재고 배열에 담기
           int newIndex = 0;
           for (int i =0; i < drinks.length; i++) {
            if (i != soldOutIndex) {
                newDrinks[newIndex] = drinks[i];
                newIndex++
            }
        }

        // 새 재고 출력
        System.out.println("새로운 자판기 재고:");
        for (String drink : newDrinks) {
            System.out.println(drinks);
        }
    }
}

 */