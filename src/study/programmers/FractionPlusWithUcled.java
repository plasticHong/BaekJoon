package study.programmers;

public class FractionPlusWithUcled {
    public static void main(String[] args) {
//        int d1 = 9; //2
//        int n1 = 2; //4
//

        int[] arr = {1, 2, 3};

        int[] arr2 = new int[arr.length];
//        int d2 = 1;
//        int n2 = 3;
//
        int n1 = 10;
        int n2 = 6;
        int gcm = n1 > n2 ? n1 % n2 : n2 % n1;

        System.out.println(gcm);
//
//        if (gcm == 0) {
//            gcm = Math.min(n1, n2);
//            System.out.println(gcm);
//        }
        int lcm = n1 * n2 / gcm;
        System.out.println(lcm);
//        System.out.println("lcm : "+lcm);
//        System.out.println("분자에 곱할 수 : "+lcm / n1);
//        final int forD1 = lcm/n1;
//        final int forD2 = lcm/n2;
//        n1 = n1 * lcm / n1;
//        d1 = d1 * forD1;
//        System.out.println("d1:"+d1);
//        System.out.println("n1:"+n1);
//        n2 = n2 * lcm / n2;
//        d2 = d2 *forD2;
//        System.out.println("d2: "+d2);
//        System.out.println("n2: "+n2);
//
//        int son = d1+d2;
//        int mother = lcm;
//
//        System.out.println("son: "+son);
//        System.out.println("mother: "+mother);
//
//        int gcmForResult = son > mother ? son % mother : son % mother;
//        if (gcmForResult == 0) {
//            gcmForResult = Math.min(son, mother);
//            System.out.println(gcmForResult);
//        }
//        System.out.println("gcmForResult : "+gcmForResult);
//
//        int gcd = gcd(son, mother);
//        System.out.println("gcd"+gcd);
//
//        System.out.println(son/gcmForResult);
//        System.out.println(mother/gcmForResult);
//
//        int[] solution = solution(9, 2, 1, 3);
//        System.out.println(solution);
//
//    }
//
//
//   static int gcd(int a, int b){
//        int tmp, n;
//
////a에 큰 값을 위치시키기 위한 조건문입니다.
//        if(a<b){
//            tmp = a;
//            a = b;
//            b = tmp;
//        }
//
////유클리드 알고리즘 부분입니다.
////b가 0이 될때까지(a%b), 반복문을 돌게되고, b가 0인 순간의 a를 GCD로 판단하고 리턴합니다.
//        while(b!=0){
//            n = a%b;
//            a = b;
//            b = n;
//        }
//        return a;
//    }
//
//
//    public static int[] solution(int denum1, int num1, int denum2, int num2) {
//        int[] answer = {0,0};
//
//        int gcf = num1>num2? num1%num2:num2%num1;
//
//
//        if (gcf == 0) {
//            gcf = Math.min(num1, num2);
//        }
//
//        int lcm = num1*num2/gcf;
//
//        final int forD1 = lcm/num1;
//        final int forD2 = lcm/num2;
//
//        num1 = (lcm/num1)*num1;
//
//        num2 = (lcm/num2)*num2;
//
//        denum1 = denum1*forD1;
//        denum2 = denum2*forD2;
//
//        int gcd = gcd(lcm, denum1 + denum2);
//
//        answer[0] = (denum1+denum2)/gcd;
//        answer[1] = lcm/gcd;
//
//        System.out.println(answer[0]);
//        System.out.println(answer[1]);
//
//
//        return answer;
//    }
    }
}
