package wooteco_pre;

import java.util.Scanner;

public class BaseBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctAnswer = "425";


        boolean run = true;
        while (run) {
            run = runGame(correctAnswer);
            System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            String next = sc.next();

            if (next.equals("1")) {
                run = true;
            } else if (next.equals("2")) {
                System.out.println("종료합니다.");
                run = false;
            } else {
                System.out.println("잘못된 값을 입력하셨습니다.");
               throw new IllegalArgumentException();
            }

        }





    }

    private static boolean runGame(String correctAnswer) {
        int ballCount;
        int strikeCount;
        Scanner sc = new Scanner(System.in);

        boolean run = true;
        System.out.println("숫자 야구 게임을 시작합니다.");
        while (run) {
            System.out.print("숫자를 입력해주세요 : ");
            String userAnswer = sc.next();

//            입력값 검증
            validate(userAnswer);

//            계산
            strikeCount = getStrikeCount(correctAnswer, userAnswer);
            ballCount = getBallCount(correctAnswer, userAnswer);


//            결과 출력
            if (ballCount!=0){
                System.out.print(ballCount + "볼 ");
            }
            if (strikeCount!=0){
                System.out.println(strikeCount + "스트라이크 ");
            }



            if (strikeCount == 3) {
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                run = false;
            }

        }

        return true;
    }

    private static void validate(String userAnswer) {

        int length = userAnswer.length();

        if(length != 3){
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < length; i++) {
            char c = userAnswer.charAt(i);
            int numericValue = Character.getNumericValue(c);

            if(numericValue<1||9<numericValue){
                throw new IllegalArgumentException();
            }

        }

        char first = userAnswer.charAt(0);
        char second = userAnswer.charAt(1);
        char third = userAnswer.charAt(2);

        if(first==second||second==third||first==third){
            throw new IllegalArgumentException();
        }

    }


    private static int getBallCount(String correctAnswer, String userAnswer) {

        int ballCount = 0;

        for (int i = 0; i < correctAnswer.length(); i++) {

            char c = userAnswer.charAt(i);
            int findIndex = correctAnswer.indexOf(c);

            if (findIndex != i && findIndex >= 0) {
                ballCount++;
            }

        }
        return ballCount;
    }

    private static int getStrikeCount(String correctAnswer, String userAnswer) {

        int strikeCount = 0;

        for (int i = 0; i < correctAnswer.length(); i++) {

            char target = correctAnswer.charAt(i);

            if (target == userAnswer.charAt(i)) {
                strikeCount++;
            }
        }

        return strikeCount;
    }


}
