package baekjoon.arrays;


import java.util.Arrays;
import java.util.Scanner;

public class Max_min_OtherCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[sc.nextInt()];

        for(int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        Arrays.sort(num);

        System.out.println(num[0] + " " + num[num.length - 1]);
    }
}