package wooteco_pre;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Integer> pobi = List.of(97, 98);
        List<Integer> crong = List.of(197, 198);

        int solution = solution(pobi, crong);
        System.out.println(solution);

    }


    public static int solution(List<Integer> pobi, List<Integer> crong) {


        Player playerPobi = new Player(pobi);
        Player playerCrong = new Player(crong);

        try {

            validate(playerPobi);
            validate(playerCrong);

            if(playerPobi.getMaxScore() > playerCrong.getMaxScore()) {
                return 1;
            }else if(playerPobi.getMaxScore() == playerCrong.getMaxScore()){
                return 0;
            }else{
                return 2;
            }

        }catch (IllegalArgumentException e){
            return -1;
        }

    }
    public static void validate(Player player){
        int leftPage = Integer.parseInt(player.leftPage);
        int rightPage = Integer.parseInt(player.rightPage);

        if(rightPage-leftPage != 1){
            throw new IllegalArgumentException();
        }
    }

    public static class Player {

        String leftPage;
        String rightPage;

        int leftPageSumResult = 0;
        int leftPageMultiplyResult = 1;

        int rightPageSumResult = 0;
        int rightPageMultiplyResult = 1;

        Player(List<Integer> list) {
            this.leftPage = list.get(0) + "";
            this.rightPage = list.get(list.size()-1) + "";
        }


        public int getMaxScore() {

            int leftPageResult;
            int rightPageResult;

            for (int i = 0; i < this.leftPage.length(); i++) {

                char c = leftPage.charAt(i);
                leftPageSumResult += Character.getNumericValue(c);
                leftPageMultiplyResult *= Character.getNumericValue(c);
            }
            leftPageResult = Math.max(leftPageSumResult,leftPageMultiplyResult);

            for (int i = 0; i < this.rightPage.length(); i++) {

                char c = rightPage.charAt(i);
                rightPageSumResult += Character.getNumericValue(c);
                rightPageMultiplyResult *= Character.getNumericValue(c);
            }
            rightPageResult = Math.max(rightPageSumResult,rightPageMultiplyResult);

            return  Math.max(leftPageResult,rightPageResult);
        }

    }

}
