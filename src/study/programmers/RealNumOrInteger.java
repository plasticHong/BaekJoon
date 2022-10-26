package study.programmers;

import java.io.FilterOutputStream;
import java.util.*;

public class RealNumOrInteger {
    public static void main(String[] args) {

        double sqrt = Math.sqrt(144);
        if(sqrt-(int)sqrt==0){
            System.out.println(1);
        }else {
            System.out.println(2);
        }

    }
}
