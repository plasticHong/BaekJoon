package wooteco_pre;

public class BaseBall {
    public static void main(String[] args) {

        String num = "425";

        String userAnswer = "542";

        int ball = 0;
        int strike = 0;

        for (int i = 0; i < num.length(); i++) {

            char target = num.charAt(i);

            if (target == userAnswer.charAt(i)) {
                strike++;
            }
        }

        System.out.println(strike);




    }
}
