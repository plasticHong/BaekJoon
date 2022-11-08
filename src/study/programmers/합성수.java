package study.programmers;

import java.util.HashSet;
import java.util.Set;

public class 합성수 {
    public static void main(String[] args) {
        int n = 15;
        int answer = 0;
        Set<Integer> list = new HashSet<>();

        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
                if (cnt >= 3) {
                    answer++;
                    list.add(i);
                }
            }
        }

        System.out.println(answer);
        System.out.println(list.size());
    }

}
