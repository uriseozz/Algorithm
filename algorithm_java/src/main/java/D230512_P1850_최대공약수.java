/*
기초수학

<문제>
모든 자리가 1로만 이루어져있는 두 자연수 A와 B가 주어진다. 이때, A와 B의 최대 공약수를 구하는 프로그램을 작성하시오.
예를 들어, A가 111이고, B가 1111인 경우에 A와 B의 최대공약수는 1이고, A가 111이고, B가 111111인 경우에는 최대공약수가 111이다.

<입력>
첫째 줄에 두 자연수 A와 B를 이루는 1의 개수가 주어진다. 입력되는 수는 2의 63승 보다 작은 자연수이다.

<출력>
첫째 줄에 A와 B의 최대공약수를 출력한다. 정답은 천만 자리를 넘지 않는다.

<예제입력>
3 6

<예제출력>
111
 */


import java.util.*;

public class D230512_P1850_최대공약수 {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        // 2의 63승 보다 작은 자연수라 하여 Long으로 받음
        Long num1 = sc.nextLong();
        Long num2 = sc.nextLong();

        //StringBuilder로 처리, String += '1'로 처리했더니 시간초과 뜸..;
        StringBuilder sb = new StringBuilder();
        Long gcdNum = gcd(num1, num2);
        for (int i=0; i<gcdNum; i++) {
            sb.append('1');
        }

        System.out.println(sb);
    }

    // 유클리드 호제법
    public static long gcd (long a, long b) {

        // 유클리드 호제법 조건: a>b라서 a<b일 경우 바꿔줌
        if (a<b) {
            Long temp = a;
            a = b;
            b = temp;
        }

        while (b!=0) {
            Long r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}
