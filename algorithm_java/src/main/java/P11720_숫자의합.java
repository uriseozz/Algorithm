import java.util.*;
/**
 * 배열과 리스트
 * 1. 배열
 * 메모리의 연속 공간에 값이 채워져 있는 형태의 자료구조
 * 인텍스를 통해 참조, 선언한 자료형의 값만 저장
 * 인텍스를 통하여 값에 바로 접근 가능
 * 새로운 값을 삽입하거나 특정 인텍스에 있는 값을 삭제하기 어려움 -> 값의 삽입/삭제 시 해당 인텍스 주변 값 이동
 * 배열의 크기는 선언할 때 지정, 한 번 선언하면 크기를 늘리거나 줄일 수 없음
 * 구조가 간단하여 코딩테스트에서 많이 사용
 *
 * 2. 리스트(ArrayList/LinkedList)
 * 값과 포인터를 묶는 노드라는 것을 포인터로 연결한 자료구조
 * 인덱스가 없어 값에 접근 시 Head 포인터부터 순서대로 접근 -> 값에 접근 속도가 느림
 * 포인터로 연결되어 있어 데이터의 삽입/삭제 연산 속도가 빠름
 * 크기를 지정하지 않아도 됨 -> 크기가 변하기 쉬운 데이터 다룰 때 사용
 * 포인터를 저장할 공간이 필요하므로 배열보다 구조 복잡
 */

// 백준 11720 숫자의 합 구하기
public class P11720_숫자의합 {
    public static void main(String[] args) {

        // num1 -> 숫자의 길이, num2 -> 숫자, 자리수별 숫자 더하기 / num1 = 5, num2 = 12345, 값 15
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        String num2 = sc.next();

        // sNum을 char[]형 변수 cNum에 변환하여 저장
        char[] cNum = num2.toCharArray();

        int sum = 0;

        for(int i=0; i<num1; i++) {
            sum += cNum[i]-48; // 아스키코드 문자'1' - 48 = 숫자'1' 또는 문자'1' - 문자'0' = 숫자'1'
        }

        System.out.println(sum);
    }
}
