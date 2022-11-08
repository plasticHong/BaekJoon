package study.programmers;

import java.util.ArrayList;
import java.util.List;

public class 배열_자르기 {
    public static void main(String[] args) {

        String str = "abc1Addfggg4556b";
        int n = 6;
        List<String > strings = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if(n*(i+1)>str.length()){
                String substring = str.substring(i*n);
                strings.add(substring);
                break;
            }
            String substring = str.substring(i*n,n*(i+1));
            strings.add(substring);
        }

        for (String s:strings
        ) {
            System.out.println(s);
        }


    }
}
