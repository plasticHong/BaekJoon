package study.programmers;

public class 콜라병 {
    public static void main(String[] args) {

        int n = 20;
        int a = 3;
        int b = 1;

        int bottle = 0;
        int answer = 0;

while (n>a){

    bottle = (n/a)*b;
    answer += bottle;
    n = bottle+(n-((n/a)*a));
    System.out.println("받은 병 합계 "+answer+"현재 가진 병 "+n+" 받은 병: "+bottle);
}


//        bottle = (n/a)*b;
//        answer += bottle;
//        n = bottle+(n-((n/a)*a));
//        System.out.println("받은 병 합계 "+answer+"현재 가진 병 "+n+" 받은 병: "+bottle);
//
//
//        bottle = (n/a)*b;
//        answer += bottle;
//        n = bottle+(n-((n/a)*a));
//        System.out.println("받은 병 합계 "+answer+"현재 가진 병 "+n+" 받은 병: "+bottle);

    }
}
