package wooteco_pre;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 진료순서_정하기 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        Integer[] integers = parseInegerArr(arr);
        Integer[] sortedIntegers = parseInegerArr(arr); //뒤집어야함

        Arrays.sort(sortedIntegers);

        // 2. 원본 배열을 List로 변환
        List<Integer> list = Arrays.asList(sortedIntegers);

        // 3. Collections.reverse() 메소드를 사용하여 list를 거꾸로 변환
        Collections.reverse(list);

        // 4. 리스트를 배열로 변환
         sortedIntegers = list.toArray(sortedIntegers);


        for (int i = 0; i < integers.length; i++) {

            integers[i] = List.of(sortedIntegers).indexOf(integers[i])+1;

        }


        for (int a :
                integers) {
            System.out.print(a+", ");
        }

    }

    private static Integer[] parseInegerArr(int[] arr) {
        Integer[] integers = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            integers[i] = arr[i];
            }
        return integers;
    }


}
