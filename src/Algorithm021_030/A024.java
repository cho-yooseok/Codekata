package Algorithm021_030;

//  https://school.programmers.co.kr/learn/courses/30/lessons/12919

public class A024 {
    /*
    배열에서 "kim" 의 위치를 찾아 결과 문자열을 반환하는 함수
    @param seoul "kim"이 포함된 문자열 배열
    @return "김서방은 x에 있다" 형태의 문자열 (x는 "kim"의 인덱스)
     */
    public String solution(String[] seoul) {
        // "Kim"의 위치(인덱스)를 저장할 변수
        // "Kim"의 위치(인덱스)를 저장할 변수를 0으로 초기화 합니다
        int kimIndex = 0;

        //배열의 처음부터 끝까지 하나씩 확인
        for (int i = 0; i < seoul.length; i++) {
            //현재 확인 중인 요소가 "Kim"인지 검사
            if (seoul[i].equals("Kim")) {
                //"Kim"을 찾았다면 해당 위치(인덱스)를 저장
                kimIndex = i;
                //이미 찾았으므로 더 이상 검색할 필요 없음
                break;
            }
        }
        //결과 문자열 생성 및 반환
        // "김서방은" + 인덱스 + "에 있다"
        return "김서방은 " + kimIndex + "에 있다";
    }
    /*
    메인함수 : 테스트 케이스 실행
     */
    public static void main(String[] args) {
        //A024 객체 생성
        A024 sol = new A024();

        // 테스트 케이스 준비
        String[] seoul1 = {"Jane", "Kim"};
        String[] seoul2 = {"Queen", "Tod", "Kim", "John"};

        // 테스트 케이스 실행 및 결과 출력
        System.out.println("테스트 케이스 1 결과: " + sol.solution(seoul1));
        System.out.println("테스트 케이스 2 결과: " + sol.solution(seoul2));
    }
}



/*
배열과 인덱스의 개념
프로그래밍에서 배열은
 같은 타입의 여러 데이터를
  하나의 변수에 저장하는 자료구조 입니다

 배열의 각 위치는 인덱스(index) 라고 부르며, 0부터 시작합니다

 */