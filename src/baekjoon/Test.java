package baekjoon;

public class Test {
    static int randomNumber(int min, int max) {
        return (int) (Math.floor(Math.random() * (max - min + 1)) + min);
    }

    public static void main(String[] args) {

        final int STAR_COUNT = 100;
        String result = "";
        for(int i = 0; i < STAR_COUNT; i++){
            result += randomNumber(-50, 50)+"vw " +randomNumber(-50, 50)+"vh "+ randomNumber(0, 3)+"px " +randomNumber(0, 3)+"px #fff,";
        }
        System.out.println(result.substring(0, result.length() - 1)+"\n");
    }
}
