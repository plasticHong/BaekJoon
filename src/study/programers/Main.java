package study.programers;

public class Main {
    public static void main(String[] args) {
        int d1 = 1; //2
        int n1 = 4; //4

        int d2 = 6;
        int n2 = 8;

        int gcm = n1 > n2 ? n1 % n2 : n2 % n1;

        if (gcm == 0) {
            gcm = Math.min(n1, n2);
            System.out.println(gcm);
        }
        int lcm = n1 * n2 / gcm;
        System.out.println("lcm : "+lcm);
        System.out.println("분자에 곱할 수 : "+lcm / n1);
        final int forD1 = lcm/n1;
        final int forD2 = lcm/n2;
        n1 = n1 * lcm / n1;
        d1 = d1 * forD1;
        System.out.println("d1:"+d1);
        System.out.println("n1:"+n1);
        n2 = n2 * lcm / n2;
        d2 = d2 *forD2;
        System.out.println(d2);
        System.out.println(n2);

        int son = d1+d2;
        int mother = lcm;

        int gcmForResult = son > mother ? son % mother : son % mother;

        System.out.println(son/gcmForResult);
        System.out.println(mother/gcmForResult);
    }

    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = {0,0};

        int gcf = num1>num2? num1%num2:num2%num1;


        if (gcf == 0) {
            gcf = Math.min(num1, num2);
        }

        int lcm = num1*num2/gcf;

        final int forD1 = lcm/num1;
        final int forD2 = lcm/num2;

        num1 = (lcm/num1)*num1;

        num2 = (lcm/num2)*num2;

        denum1 = denum1*forD1;
        denum2 = denum2*forD2;

        answer[0] = denum1+denum2;
        answer[1] = lcm;


        return answer;
    }

}
