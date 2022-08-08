package baekjoon.arrays;

import java.util.Scanner;

public class UseSet {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
//        int[] arr = new int[]{42,84,252,420,840,126,42,84,420,126};
        int[] resultArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            resultArr[i] = arr[i]%42;

        }
        int count = 0;
        for (int i = 0; i < resultArr.length; i++) {
            for (int j = 0; j <i ; j++) {
                if(resultArr[i] == resultArr[j]) {
//                    System.out.println(resultArr[i]+"=="+resultArr[j]);
                count++;
                }

            }
        }
        if(resultArr.length-count<0){
            count = 9;
        }

        System.out.println(resultArr.length-count);

    }
}
