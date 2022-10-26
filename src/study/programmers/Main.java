package study.programmers;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String before = "hlole";
        String after = "hello";


        char[] chars = before.toCharArray();
        char[] chars2 = after.toCharArray();
        Arrays.sort(chars);
        before = String.valueOf(chars);
        Arrays.sort(chars2);
        after = String.valueOf(chars2);

        boolean equals = after.equals(before);

        System.out.println(equals);

        for (char c:chars
             ) {
            System.out.print(c+",");
        }
        System.out.println();
        for (char c:chars2
        ) {
            System.out.print(c+",");
        }

    }
}
