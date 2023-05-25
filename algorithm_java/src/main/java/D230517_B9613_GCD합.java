/*
기초수학

<문제>
양의 정수 n개가 주어졌을 때, 가능한 모든 쌍의 GCD의 합을 구하는 프로그램을 작성하시오.

<입력>
첫째 줄에 테스트 케이스의 개수 t (1 ≤ t ≤ 100)이 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있다. 각 테스트 케이스는 수의 개수 n (1 < n ≤ 100)가 주어지고, 다음에는 n개의 수가 주어진다. 입력으로 주어지는 수는 1,000,000을 넘지 않는다.

<출력>
각 테스트 케이스마다 가능한 모든 쌍의 GCD의 합을 출력한다.

<예제입력>
3
4 10 20 30 40
3 7 5 12
3 125 15 25

<예제출력>
70
3
35
 */

import java.util.*;

public class D230517_B9613_GCD합 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        for (int i=0; i<num1; i++) {
            int num2 = sc.nextInt();
            int []arr = new int[num2];
            long sum = 0;

            for (int n=0; n<num2; n++) {
                arr[n] = sc.nextInt();
            }

            for (int j=0; j<num2; j++) {
                for (int r = j; r < num2; r++) {
                    if(j != r) {
                        sum += gcd(arr[j], arr[r]);
                    }
                }
            }
            System.out.println(sum);
        }
    }

    // 유클리드 호제법
    public static int gcd(int a, int b) {
        if (a<b) {
            int temp = a;
            a = b;
            b = temp;
        }

        while (b!=0){
            int r = a%b;
            a = b;
            b = r;
        }

        return a;
    }
}
