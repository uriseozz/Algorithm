/*
사칙연산, 배열, 수학

<문제>
중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다. 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.

<제한사항>
array의 길이는 홀수입니다.
0 < array의 길이 < 100
-1,000 < array의 원소 < 1,000

<출력>
9, -1, 0을 오름차순 정렬하면 -1, 0, 9이고 가장 중앙에 위치하는 값은 0입니다.

<예제입력>
[9, -1, 0]

<예제출력>
0

 */

public class D230525_P120811_중앙값구하기 {
    public static void main(String[] arg) {

        int[] array = {9,-1,0};
        solution(array);
    }

    public static int solution(int[] array) {

        // array 정렬 -> Arrays.sort(array);
        int temp = 0;
        int newArray[] = new int[array.length];
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        // 중앙값 출력 -> newArray[newArray.length/2];
        int center = (newArray.length+1)/2;
        int answer = newArray[center-1];
        return answer;
    }
}
