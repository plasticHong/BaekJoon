package wooteco_pre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P4 {

    public static void main(String[] args) {
        Map<Integer, Character> map = new HashMap();
        List<Integer> greenFrogList = new ArrayList<>();

        String ex = "I love you";
        String newStr = "";

        for (int i = 90; i >= 65; i--) {
            greenFrogList.add(i);
        }
        for (int i = 0; i < greenFrogList.size(); i++) {
            int value = greenFrogList.get(i);
            map.put(i + 65, (char) +value);
        }

        for (int i = 1; i <= ex.length(); i++) {

            int charNumber = ex.charAt(i - 1);

            if (charNumber <= 90 && charNumber >= 65) {
                newStr += map.get(charNumber);

            } else if (charNumber >= 90 && charNumber<=122) {
                int i1 = map.get(charNumber - 32) + 32;
                newStr += (char) i1;
            }else {
                newStr += ex.charAt(i-1);
            }
        }

        System.out.println(newStr);
    }
}
