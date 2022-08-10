package baekjoon.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AVG_of_Class {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalTestCase = Integer.parseInt(sc.nextLine()); //TestCase 입력받음
        double sum = 0;
        double avg = 0;
        double count = 0;

        for (int i = 0; i < totalTestCase; i++) {

            String input = sc.nextLine();   //학생 수와 점수를 받음
            String[] arr = input.split("\\s");  //공백으로 잘라서 배열에 대입
            int[] intArr = new int[arr.length];      //계산을 위한 int 배열 선언

            for (int j = 0; j < arr.length; j++) {    //배열 형변환
                intArr[j] = Integer.parseInt(arr[j]);
            }

            int[] arr1 = Arrays.copyOfRange(intArr, 1, intArr.length); //학생 수와 점수 분리를 위해 배열 복사

            for (int j = 0; j < arr1.length; j++) { //평균 계산
                sum += arr1[j];
            }
            avg = sum / arr1.length;

            for (int j = 0; j < arr1.length ; j++) {  //평균을 넘는 학생 수 계산
                if(arr1[j]>avg){
                    count++;
                }
            }

            System.out.printf("%.3f%%\n", count/ ((double)arr1.length)*100); //출력

            count = 0;
            sum = 0;
        }


    }
}
