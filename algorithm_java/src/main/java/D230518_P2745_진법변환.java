/*
기초수학

<문제>
B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35

<입력>
첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)
B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.

<출력>
첫째 줄에 B진법 수 N을 10진법으로 출력한다.

<예제입력>
ZZZZZ 36

<예제출력>
60466175

 */

import java.util.*;

public class D230518_P2745_진법변환 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        int B = sc.nextInt();
        int tmp = 1; // 제곱
        int ans = 0;

        for (int i = N.length()-1; i >= 0; i--) { // 역으로 계산
            char c = N.charAt(i);

            if('A'<= c && c <= 'Z') { // A -> 65
                ans += (c-'A'+10)*tmp;
            }else {
                ans += (c-'0')*tmp;
            }
            tmp *= B;
        }

        System.out.println(ans);
    }
}
