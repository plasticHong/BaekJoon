package study.stringHash;

public class Main {
    public static void main(String[] args) {

        String ab = "ab";
        String ba = "ba";
        String abc = "abc";
        String abcd = "abcd";
        String abcde = "abcde";

        int a = 'a';
        int A = 'A';
        int z = 'z';
        int Z = 'Z';
        int b = 'b';

        System.out.println("a : "+a);
        System.out.println("A : "+A);
        System.out.println("z : "+z);
        System.out.println("Z : "+Z);


        System.out.println(ab.hashCode());
        System.out.println(ba.hashCode());
        System.out.println(abc.hashCode());
        System.out.println(abcd.hashCode());
        System.out.println(abcde.hashCode());


    }
}
