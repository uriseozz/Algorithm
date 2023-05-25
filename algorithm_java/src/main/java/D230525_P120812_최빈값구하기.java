/*
사칙연산, 배열, 수학

<문제>
최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.

<제한사항>
0 < array의 길이 < 100
0 ≤ array의 원소 < 1000

<입출력 예>
- [1, 2, 3, 3, 3, 4]에서 1은 1개 2는 1개 3은 3개 4는 1개로 최빈값은 3입니다.
- [1, 1, 2, 2]에서 1은 2개 2는 2개로 최빈값이 1, 2입니다. 최빈값이 여러 개이므로 -1을 return 합니다.
- [1]에는 1만 있으므로 최빈값은 1입니다.

 */
import java.util.Arrays;

public class D230525_P120812_최빈값구하기 {

    public static void main(String[] arg) {

        int[] array = {1,2,3,3,3,4};
        solution(array);
    }

    public static int solution(int[] array) {
        int answer = 0;
        int max = 0;

        Arrays.sort(array); //배열 오름차순 정렬
        max = array[array.length - 1]; //가장 큰 수를 max로 설정

        /*각 수의 count를 위한 배열 만들어줌
        (배열 index는 0부터 시작되기 때문에 길이는 max+1)*/
        int[] count = new int[max + 1];
        for(int i = 0; i < array.length; i++) {
            count[array[i]]++; //각 수의 index에 count
        }
        max = count[0]; //가장 큰 count값을 max로 설정
        for(int i = 1; i < count.length; i++) {
            if(max < count[i]) {
                max = count[i];
                answer = i; //max값이 바뀔 때의 index (최빈값)
            }else if(max == count[i]) { //최빈값이 여러 개인 경우 -1 return
                answer = -1;
            }
        }
        return answer;
    }
}
