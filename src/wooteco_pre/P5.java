package wooteco_pre;

import java.util.ArrayList;
import java.util.List;

public class P5 {
    public static void main(String[] args) {
        int money = 50237;
        final int[] PAY_CASES = {50000,10000,5000,1000,500,100,50,10,1};
        List<Integer> list = new ArrayList<>();

        for (int pay_case : PAY_CASES) {
            list.add(money / pay_case);
            money = money % pay_case;
        }

        for (int i:list
        ) {
            System.out.print(i+", ");
        }
    }
}
