package study.programmers;

public class 문자열_밀기 {
    public static void main(String[] args) {


        String A = "apple";
//        String B = "ohell";
        String B = "apple";
        String answer = A;
        int cnt=0;
        String extracted = A;
        boolean run = true;


        if(A.equals(B)){
            System.out.println(0);
        }

        while (run){

            cnt ++;
            extracted = shift(extracted);
            if(extracted.equals(B)){
                run = false;
            }

            if(cnt>A.length()){
                System.out.println("불가능");
                return;
            }
        }
        System.out.println(extracted);
        System.out.println(cnt);



    }

    private static String shift(String A) {
        String answer = A;
        char c = A.charAt(answer.length() - 1);
        answer = c+"";

        for (int i = 0; i < A.length()-1; i++) {
            char c1 = A.charAt(i);
            answer +=c1;
        }


        return answer;
    }
}
