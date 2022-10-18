package study.array;

public class Main {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2},
                {5, 2},
                {1, 2}
        };

        int[] arr2 = {1,2};

        int[][][] arr3 = {
                {
                    {1,2},{3,4}
                },
                {
                        {1,2},{4},{5,6,7}
                }
        };

        System.out.println(arr.length);
        System.out.println(arr.getClass());
        System.out.println(arr2.getClass());
        System.out.println(arr3.getClass());
        System.out.println(arr3.length);
        System.out.println(arr3[0][1][1]);


    }
}
