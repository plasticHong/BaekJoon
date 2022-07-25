package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusCycle {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            String read = br.readLine();    //최초 입력값
            String str = null;              //입력값의 길이가 1일경우 0추가를 위함
            int count = 0;                  //횟수 count


            int newNum = 0;
            int origin = 0;
            int firstNum = 0;
            int secondNum = 0;
            String result = null;
            String newNumStr = null;
            int resultNumEndIdx = 0;


            if (read.length() < 2) {
                str = "0";
                str += read;
            } else {
                str = read;
            }

            origin = Integer.parseInt(str);

            firstNum = Integer.parseInt(str.substring(0, 1));
            secondNum = Integer.parseInt(str.substring(1));


            result = (firstNum + secondNum) + "";


            resultNumEndIdx = Integer.parseInt(result.substring(result.length() - 1, result.length()));

            newNumStr = secondNum + "" + resultNumEndIdx;
            newNum = Integer.parseInt(newNumStr);

            count++;
            if (origin == newNum) {
                System.out.println(count);
                return;
            }
            while (true) {
                firstNum = Integer.parseInt(newNumStr.substring(0, 1));
                secondNum = Integer.parseInt(newNumStr.substring(1));


                result = (firstNum + secondNum) + "";
                if (result.length() == 1) {
                    resultNumEndIdx = Integer.parseInt(result.substring(0));    //result 가 한 자리 수 일 때
                } else {
                    resultNumEndIdx = Integer.parseInt(result.substring(1));    //result 가 두 자리 수 일 때
                }


                newNumStr = secondNum + "" + resultNumEndIdx;
                newNum = Integer.parseInt(newNumStr);

                count++;
                if (origin == newNum) {
                    break;
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
