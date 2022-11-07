package study.programmers;

import java.util.ArrayList;
import java.util.List;

public class 등차수열의_합 {
    public static void main(String[] args) {
        int num = 5;
        int total = 15;
        int solution = solution(num, total);

        System.out.println(solution+" 부터 시작하는 "+num+" 개의 수열");

        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i <num; i++) {
            answer.add(solution+i);
        }

        Integer[] integers = answer.toArray(new Integer[answer.size()]);
        for (int i:integers
             ) {
            System.out.print(i+", ");
        }

    }

    private static int solution(int num, int total) {


        int start = total / num;
        for (int i = start-5; i < total; i++) {
            int sum=0;
            int e = 0;
            System.out.println("i: "+i);
            for (int j = 1; j <= num; j++) {
                e = i+j;
                sum += e;
                System.out.println("sum: "+sum);
            }
            if(sum==total){
                System.out.println(sum);
                System.out.println("지금!!"+(i+1));
                return (i+1);
            }
        }
        return 0;
    }



}
