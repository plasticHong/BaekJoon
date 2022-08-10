package baekjoon.arrays;

import java.util.Scanner;

class test{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int totalTestCase = Integer.parseInt(sc.next());
        double sum = 0;
        double avg = 0;

        String input;
                input = sc.nextLine();
      //  input = "5 50 50 70 80 100";
        String[] arr = input.split("\\s");
        int[] intArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
            System.out.println(intArr[i]);
        }
    }
}