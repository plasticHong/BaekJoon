package study.programmers;

public class 팩토리얼 {
    public static void main(String[] args) {
        int answer = 0;
        int n = 7;
        for(int i = 1;i<=10;i++){
            int pacto = getFactorial(i);
            System.out.println(i+"! = "+pacto);
            if(pacto>=n){
                answer = i;
//                break;
            }
        }

        System.out.println(answer);
    }

     public static int getFactorial(int t){

        int pacto = 1;

        for(int i = 1; i <=t;i++){
            pacto = pacto*i;
        }

        return pacto;
    }}
