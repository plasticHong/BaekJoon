package baekjoon.lambdaEX;

public class LambdaTest {

    public static void main(String[] args) {

        MyFunctionalInterface lambda;

        lambda = () -> System.out.println("lambda!");

        lambda.method();


        MyFunctionalInterface2 lambda2;

        lambda2 = (x) -> System.out.println("lambda2 : " + (x + 10));

        lambda2.method(10);

        lambda2 = (x) -> System.out.println("lambda2 : " + (x * x));

        lambda2.method(10);


        //매개변수가 2개 있고 return문이 있는 람다

        MyNumber lambda3;

        lambda3 = (x, y) -> {
            return x + y;
        };

        System.out.println("lambda3 : " + lambda3.method(10, 10));


        lambda3 = (x, y) -> x + y; //return, {} 생략 가능
        System.out.println("lambda3 : " + lambda3.method(10, 10));

        StringConcat lambda4 = (s1, s2) -> s1 + " " + s2;
        System.out.println(lambda4.conCat("hello","world"));

    }

}
