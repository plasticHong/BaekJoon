package baekjoon.arrays;


import java.util.Scanner;

public class Max_Min_NoArray {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int cnt = sc.nextInt();
            int b = sc.nextInt();
            int max =b ;
            int min =b ;

            for(int i=0;i<cnt-1;i++) {
                int a = sc.nextInt();
                if(a>max) {
                    max = a;
                }
                if(a<min) {
                    min = a;
                }
            }
            System.out.println(min + " " + max );
        }



}
