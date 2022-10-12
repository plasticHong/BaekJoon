package study.builderPattern;

public class Main {
    public static void main(String[] args) {

        Wee wee = new Wee.WeeBuilder("위수영","남").build();

        System.out.println(wee.toString());

        Wee wee2 = new Wee.WeeBuilder("원숭이","수컷")
                .Girlfriend("부연화")
                .job(48)
                .build();

        System.out.println(wee2.toString());
    }
}
