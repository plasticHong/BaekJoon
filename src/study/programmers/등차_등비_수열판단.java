package study.programmers;

public class 등차_등비_수열판단 {
    public static void main(String[] args) {

        int[] common = {1, 3, 5, 7};

        int answer = 0;
        int value = 0;
        for (int i = 0; i < common.length - 2; i++) {

            int first = common[i];
            int second = common[i + 1];
            int third = common[i + 2];

            if ((second - first) == (third - second)) {
                value = third - second;
                answer = common[common.length - 1] + value;
            } else if ((second / first) == (third / second)) {
                answer = common[common.length - 1] * (third / second);
            }

        }
        System.out.println(common[common.length - 1] + value);
        System.out.println(value);
        System.out.println(answer);

    }
}
