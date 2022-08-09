package baekjoon.arrays;

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] scores = new int[N];
        double M = scores[0];
        double[] newScores = new double[scores.length];
        double sum = 0;
        double op = 100;


        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
            if (scores[i] > M) {
                M = scores[i];
            }
        }


        for (int i = 0; i <scores.length ; i++) {
           newScores[i] = (scores[i]*op)/M*op;

           sum += newScores[i];
        }

        double result = (sum/ newScores.length/op);
        System.out.printf("%f",result );


    }
}
