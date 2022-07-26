package baekjoon.arrays;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Max_Min {
    public static void main(String[] args) {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];

            String[] strArr;
            String str = br.readLine();
            strArr = str.split(" ");
            int min = Integer.parseInt(strArr[0]);
            int max = Integer.parseInt(strArr[0]);

            for (int i = 0; i < arr.length; i++) {
                arr[i]= Integer.parseInt(strArr[i]);
                if(arr[i]>max){
                    max = arr[i]; }

                if(arr[i]<min){
                    min = arr[i];
                }
            }
            System.out.println(min+" "+max);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
