package Algorithm031_040;

public class A037 {
    // 두 행렬을 더하는 메서드
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 행렬의 행(row) 개수 저장
        int rows = arr1.length;
        // 행렬의 열(column) 개수 저장
        int cols = arr1[0].length;

        // 결과를 저장할 새로운 행렬 생성 (arr1과 arr2의 크기와 동일)
        int[][] result = new int[rows][cols];

        // 행렬의 모든 요소를 순회하며 덧셈 수행
        for (int i = 0; i < rows; i++) { // 각 행을 반복
            for (int j = 0; j < cols; j++) { // 각 열을 반복
                // 같은 위치의 요소를 더해서 결과 행렬에 저장
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        // 덧셈이 완료된 결과 행렬 반환
        return result;
    }

    // 실행을 위한 메인 메서드
    public static void main(String[] args) {
        A037 matrixAdder = new A037();

        // 예제 입력 1
        int[][] arr1 = { {1,2}, {2,3} };
        int[][] arr2 = { {3,4}, {5,6} };

        // 결과 계산
        int[][] result = matrixAdder.solution(arr1, arr2);

        // 결과 출력
        System.out.println("[결과 행렬]");
        for (int i = 0; i < result.length; i ++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}


/*
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 행렬의 행(row) 개수 저장
        int rows = arr1.length;
        // 행렬의 열(column) 개수 저장
        int cols = arr1[0].length;

        // 결과를 저장할 새로운 행렬 생성 (arr1과 arr2의 크기와 동일)
        int[][] result = new int[rows][cols];

        // 행렬의 모든 요소를 순회하며 덧셈 수행
        for (int i = 0; i < rows; i++) { // 각 행을 반복
            for (int j = 0; j < cols; j++) { // 각 열을 반복
                // 같은 위치의 요소를 더해서 결과 행렬에 저장
                result[i][j] = arr[i][j] + arr2[i][j];
            }
        }

        // 덧셈이 완료된 결과 행렬 반환
        return result;
    }
}

rows 와 cols 변수를 사용하여 행렬의 크기를 저장한다
result 배열을 같은 크기로 생성한다
중첩된 for 루프를 사용하여 각 요소를 더하고 result에 저장한다
계산된 result를 반환한다

row와 cols의 의미
row (행) -> 가로 방향
cols (열) -> 세로 방향
로행가
콜열세

int[][] arr1 = {
    {1,2},
    {2,3}
};

       0     1     2     열
0
1
행


arr.length  행(row)의 수 = 2
arr[0]. length 열(column)의 수 = 3


 */