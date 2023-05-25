/*
기초수학

<문제>
8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.

<입력>
첫째 줄에 8진수가 주어진다. 주어지는 수의 길이는 333,334을 넘지 않는다.

<출력>
첫째 줄에 주어진 수를 2진수로 변환하여 출력한다. 수가 0인 경우를 제외하고는 반드시 1로 시작해야 한다.

<예제입력>
314

<예제출력>
11001100

 */

import java.util.*;

public class D230524_B1212_8진수2진수 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        StringBuilder ans = new StringBuilder();

        // 8진수 -> 2진수 만들기
        // 각자리 수를 3자리 2진수로만들고 부족한자리에 0채우기 -> 앞자리 0 제외하기
        for(int i=0; i<num.length(); i++) {
            String a = Integer.toBinaryString(num.charAt(i)-'0'); // 8진수 각자리 숫자를 toBinaryString으로 2진수 숫자로 만들어줌

            if(a.length()==2 && i!=0) a="0"+a; // 2진수로 변환했을 때 첫번째 숫자가 아니고, 2자리 2진수면 앞에 0을 1개 채워줌
            else if(a.length()==1 && i!=0) a="00"+a; // 2진수로 변환했을 때 첫번째 숫자가 아니고, 2자리 2진수면 앞에 0을 2개 채워줌

            ans.append(a); // a에 담긴 2진수를 붙여줌
        }

        System.out.println(ans);
    }

}
