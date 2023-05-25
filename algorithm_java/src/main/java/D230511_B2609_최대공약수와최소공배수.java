/*
기초수학

<문제>
두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.

<입력>
첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.

<출력>
첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.

<예제입력>
24 18

<예제출력>
6
72

 */

import java.util.*;

public class D230511_B2609_최대공약수와최소공배수 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int gdx = 0;

        // 최대공약수
        for (int i=1; i<num1 && i<num2; i++) {
            if (num1%i==0 && num2%i==0) {
                gdx = i;
            }
        }
        System.out.println(gdx);

        // 최소공배수
        int lcm = (num1*num2)/gdx;
        System.out.println(lcm);


        ////////////////////////////////
        /** 유클리드 호제법: 조건 a>b */
        System.out.println(gdx(num1, num2));
        System.out.println(lcm(num1, num2));
    }

    // 최대 공약수
    public static int gdx(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) { // 유클리드 호제법
            int r = a % b; // 24%18=6, 18%6=0
            a = b; // a=18, a=6
            b = r; // b=6, b=0
        }

        return a;
    }

    // 최소 공배수
    static int lcm(int a, int b) {
        return a*b/gdx(a, b);
    }
}
