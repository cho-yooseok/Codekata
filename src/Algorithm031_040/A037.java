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



/*
1. terminal

2.
git init
initialize 초기화하다

3.
git add .
전부다 올리기

4.
git status
상태를 알려주는 명령어 (필수는 아니다)

5.
git commit -m "first commit"

6.
git remote add origin git@github주소~

7.
git remote -v
연결고리 확인
선택사항 (어느 주소에 연결되었는지 확인한다)



깃을 처음 설치했다면
폴더   쉬프트우클릭 -> powershell 창 열기

사용자 등록을 해야한다
git config --global user.email "홍길동@naver.com"
git config --global user.name "홍길동"
차례로 입력

뉴터미널
git init   (깃이 여러분의 작업폴더 감시를 시작한다)

깃을 이용하여 백업하는 방법
git add 파일명


git branch 브랜치명
깃 브랜치 생성


git switch 브랜치명
브랜치로 이동

+ git status
git add .
git commit -m "파일 만들었음"

..


깃 스위치한후
확인해 볼것

실험용
실험용
실험용
실험용


새로운 리포지토리를 만들어주자
repository name*
이 아래칸에 리포지토리이름 만들어주기
group-project is available

public

팀원 초대하기
invite collaborators

초록버튼
Add people

팀원들을 초대한다

pending invite (보류중인 초대   아직 초대에 응하지 않음)
(이메일을 통해 수락할 수 있다.)

프로젝트 초기세팅


 */