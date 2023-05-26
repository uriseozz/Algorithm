/*
기초수학

<문제>
양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다. 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.

<입력>
첫째 줄에 N의 진짜 약수의 개수가 주어진다. 이 개수는 50보다 작거나 같은 자연수이다. 둘째 줄에는 N의 진짜 약수가 주어진다. 1,000,000보다 작거나 같고, 2보다 크거나 같은 자연수이고, 중복되지 않는다.
<출력>
첫째 줄에 N을 출력한다. N은 항상 32비트 부호있는 정수로 표현할 수 있다.

<예제입력>
6
3 4 2 12 6 8

<예제출력>
24

 */

import java.util.*;

public class D230526_B1037_약수 {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] A = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            A[i] = sc.nextInt(); // 입력받으면서 배열에 넣기
        }
        Arrays.sort(A); // 오름차순 정렬
        System.out.println(A[0] * A[cnt-1]); // 가장 큰수와 작은수 곱해주기
    }
}
