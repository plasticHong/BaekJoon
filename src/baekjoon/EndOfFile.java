package baekjoon;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EndOfFile {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            int A = 0;
            int B = 0;
            String read = null;

            while (true) {
                read = br.readLine();
                if (read != null) {
                    String[] strarr = read.split(" ");
                    A = Integer.parseInt(strarr[0]);
                    B = Integer.parseInt(strarr[1]);
                    System.out.println(A + B);
                } else {
                    break;
                }
            }
            br.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
