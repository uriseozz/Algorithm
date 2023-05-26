
import java.util.*;

public class D230526_B1929_소수구하기 {

    public static boolean[] prime;
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        prime = new boolean[N + 1];
        get_prime();

        for(int i = M; i <= N; i++) {
            // false = 소수
            if(!prime[i]) System.out.println(i);
        }
    }
    // 해당 알고리즘을 쓰지 않으면 시간초과뜸..
    // 에라토스테네스의 체 알고리즘 : https://propercoding.tistory.com/182
    public static void get_prime() {
        // true = 소수아님 , false = 소수
        prime[0] = prime[1] = true;

        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]) continue;
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
