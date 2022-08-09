package baekjoon.arrays;

import java.util.Scanner;

class test{
    public static void main(String[] args){
        char a = '\0';
        int temp = 0;
        int sum = 0;
        String str = "";
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = 0;

        try{
            while((a = (char)System.in.read()) == 'O' || a == 'X' || a == '\n' || a == '\r'){
                if(a == 'O'){
                    temp++;
                    sum += temp;
                }else{
                    temp = 0;
                }
                if(a == '\n'|| a =='\r'){
                    str += (sum + "\n");
                    sum = 0;
                    temp = 0;
                    j++;
                }
                if(j>=i){
                    break;
                }
            }


        }catch(Exception e){
            return;
        }
        System.out.print(str.length());
    }
}