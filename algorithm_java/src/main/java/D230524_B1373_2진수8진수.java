/*
기초수학

<문제>
2진수가 주어졌을 때, 8진수로 변환하는 프로그램을 작성하시오.

<입력>
첫째 줄에 2진수가 주어진다. 주어지는 수의 길이는 1,000,000을 넘지 않는다.

<출력>
첫째 줄에 주어진 수를 8진수로 변환하여 출력한다.

<예제입력>
11001100

<예제출력>
314

 */

import java.util.*;

public class D230524_B1373_2진수8진수 {

    public static void main(String[] arg) {
        Scanner cs = new Scanner(System.in);
        String num = cs.next();
        StringBuilder ans = new StringBuilder();

        // 2진수(11001100) -> 8진수(314) 바꾸기
        // 11001100 -> 뒤에서 부터 3개씩 나누고, 앞자라가 부족하다면 제일 앞에 0 붙이기(011/001/100)
        // 각각의 수를 10진수로 만들기(011 -> 3, 001 -> 1, 100 -> 4) -> 그대로 더하기(314)

        if(num.length()%3 != 0) {
            int a = 3 - num.length() % 3; // 2진수를 3자리씩 나눴을 때 안떨어진다면
            num = "0".repeat(a) + num; // "0"을 a만큼(부족한 자리만큼) 반복 붙이기
        }

        for(int i=0; i<num.length(); i += 3) {

            int temp = Character.getNumericValue(num.charAt(i)) * 4 // 011에섯 각자 자리에 맞게 곱해서 10진수로 만들어줌)
                    + Character.getNumericValue(num.charAt(i+1)) * 2
                    + Character.getNumericValue(num.charAt(i+2)) * 1;
            ans.append(temp);  // 그자리 그대로 붙여줌
        }
        System.out.println(ans);
    }
}
