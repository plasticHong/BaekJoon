package baekjoon.arrays;

import java.util.Scanner;

public class OXOX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;
        int sum = 0;

        String str = "";
        for (int i = 0; i < N; i++) {

            str = sc.next();

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == 'O' || str.charAt(j) == 'o') {
                    count++;
                    sum += count;
                } else if (str.charAt(j) == 'X' || str.charAt(j) == 'x') {
                    count=0;
                }

            }
            System.out.println(sum);
            sum = 0;
            count = 0;
        }

    }
}