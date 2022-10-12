package baekjoon.lambdaEX;

@FunctionalInterface
interface PrintString{
    void showString(String str);
}


public class LambdaTest2 {
    public static void main(String[] args) {

        PrintString lambdaPrint = str -> System.out.println(str);

        lambdaPrint.showString("hello");

        printString(lambdaPrint);

        PrintString printStr = returnString();
        printStr.showString("hello");
    }

    //매개변수가 함수형 인터페이스
    public static void printString(PrintString p ){
        p.showString("hello");
    }

    //매개변수가 함수형 인터페이스이고 리턴이 있는 메서드
     public static PrintString returnString(){
            return s -> System.out.println(s+ "Java");
     }



}
