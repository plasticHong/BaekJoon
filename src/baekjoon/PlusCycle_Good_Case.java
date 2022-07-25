package baekjoon;

import java.util.Scanner;

public class PlusCycle_Good_Case {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        scan.close();

        int cnt = 0;
        int copy = N;

        while(true) {
            N = ((N%10)*10)+(((N/10)+(N&10))%10);//?!?!?!
            cnt ++;

            if(copy == N) {
                break;
            }
        }
        System.out.println(cnt);
    }
}