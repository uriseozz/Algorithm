/*
기초수학

<문제>
10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.
10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35

<입력>
첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36) N은 10억보다 작거나 같은 자연수이다.

<출력>
첫째 줄에 10진법 수 N을 B진법으로 출력한다.

<예제입력>
60466175 36

<예제출력>
ZZZZZ

 */

import java.util.*;

public class D230517_B11005_진법변환2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        if (B>1 && B<37) {
            while (N > 0) {
                if(N%B > 9) {
                    sb.append((char) (N%B + 55)); //아스키코드 A = 65 ~ Z = 90
                } else {
                    sb.append(N%B);
                }
                N /= B;
            }
            System.out.println(sb.reverse());
        }
    }
}
