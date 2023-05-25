/*
기초수학

<문제>
두 자연수 A와 B에 대해서, A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다. 이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다. 예를 들어, 6과 15의 공배수는 30, 60, 90등이 있으며, 최소 공배수는 30이다.
두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성하시오.

<입력>
첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 둘째 줄부터 T개의 줄에 걸쳐서 A와 B가 주어진다. (1 ≤ A, B ≤ 45,000)

<출력>
첫째 줄부터 T개의 줄에 A와 B의 최소공배수를 입력받은 순서대로 한 줄에 하나씩 출력한다.

<예제입력>
3
1 45000
6 10
13 17

<예제출력>
45000
30
221
 */

import java.util.*;

public class D230512_B1934_최소공배수 {

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i=0; i<count; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int lcm = a*b/gcd(a,b);
            System.out.println(lcm);
        }
    }

    // 유클리드 호제법 연습
    public static int gcd(int a, int b) {
        if (a<b) {
            int temp = a;
            a = b;
            b = temp;
        }

        while (b!=0) {
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}
