package study.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongToString {
    public static void main(String[] args) {

        Long l = 123528L;

        String str = l+"";

        List<Integer > integers = new ArrayList<>();


        for(int i = 0 ; i<str.length();i++){
            integers.add(Character.getNumericValue(str.charAt(i)));
        }

        Collections.sort(integers);
        Collections.reverse(integers);
        for (int a :
                integers) {
            System.out.println(a);
        }

    }
}
