package baekjoon.arrays;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        String abc = A * B * C + "";
        String[] arr = abc.split("");
        int[] cntarr = new int[10];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < 10; j++) {

                if (arr[i].equals(j + "")) {
                    cntarr[j]++;
                }

            }
        }
        for (int i = 0; i < cntarr.length; i++) {
            System.out.println(cntarr[i]);

        }


    }
}
