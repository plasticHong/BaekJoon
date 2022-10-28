package wooteco_pre;

public class P3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        int number = 14;
        int answer = 0;
        for (int i = 0; i < number ; i++) {
            sb.append(i+1);
        }

        for (int i = 0; i <sb.length() ; i++) {
            if(sb.charAt(i)=='3'||sb.charAt(i)=='6'||sb.charAt(i)=='9'){
                answer++;
            }
        }

        System.out.println(answer);

    }
}
