package study.programmers;

public class 공놀이 {
    public static void main(String[] args) {
        int answer = 0;
        int k = 6;
        final int RULE_NUM = 2;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int shooter = 0;
        int idx =0;
        System.out.println("arr.length: "+arr.length);
        boolean b =( k - 1) * 2 > arr.length;

        if(b){  //아웃오브 인덱스
            int[] arr2 = new int[arr.length*((k-1)*2% arr.length+1)];
            System.out.println(arr2.length);
            for (int i = 0; i < arr2.length; i++) {
                if(i>arr.length){
                }
                arr2[i] = arr[i];
            }
//            return;
        }
        while (answer < k) {
            idx = answer * RULE_NUM;

            shooter = arr[idx];

            System.out.println("던진 사람 idx: "+idx);
            answer++;

        }
        System.out.println(shooter+" idx : "+idx);

    }
}
