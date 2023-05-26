/*
기초수학

<문제>
주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

<입력>
첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

<출력>
주어진 수들 중 소수의 개수를 출력한다.

<예제입력>
4
1 3 5 7

<예제출력>
3

 */

import java.util.*;
public class D230526_B1978_소수찾기 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;

        for(int i=0; i<N; i++) {
            int a = sc.nextInt();
            if(a != 1) {
                int num = a -1;
                while (a % num != 0) { // a를 a 이하의 숫자와 나눴을 때 나머지가 0이 아니면 num--
                    num--;
                }
                if(num == 1) { // num이 1일 때(소수) cnt++
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
