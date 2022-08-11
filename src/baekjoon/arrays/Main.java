package baekjoon.arrays;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int X = Integer.parseInt(sc.nextLine());
        int N = Integer.parseInt(sc.nextLine());
        String line = sc.nextLine();
        String[] arr = line.split(" ");
        int price = Integer.parseInt(arr[0]);
        int amount = Integer.parseInt(arr[1]);
        System.out.println(X+" "+N+" "+price+" "+amount);

    }
}
