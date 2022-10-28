package wooteco_pre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P4Another {

    public static void main(String[] args) {
        String ex = "I love you";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <ex.length() ; i++) {

            if(ex.charAt(i)<='Z'&&'A'<=ex.charAt(i)){
                result.append((char) (91 - (ex.charAt(i) - 64)));
            } else if (ex.charAt(i)>='a'&&'z'>=ex.charAt(i)) {
                result.append((char) (123 - (ex.charAt(i) - 96)));
            } else {
                result.append(ex.charAt(i));
            }

        }
        System.out.println(result);
    }

}
