package baekjoon.arrays;

import java.io.IOException;
import java.util.Scanner;

public class OXOXTset {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;
        int sum = 0;

        boolean run = true;

        String str = null;
        try {
            str = String.valueOf(System.in.read());


            while (run){
                str.split("\n");

            }




            for (int j = 0; j < str.length(); j++) {

            if (str.charAt(j) == 'O' || str.charAt(j) == 'o') {
                count++;
                sum += count;
            } else if (str.charAt(j) == 'X' || str.charAt(j) == 'x') {
                count=0;
            }

        }
            System.out.println();
        System.out.println(sum);
        sum = 0;
        count = 0;
    } catch (IOException e) {
        throw new RuntimeException(e);
    }


    }
}