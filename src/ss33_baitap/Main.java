package ss33_baitap;

public class Main {
    public static int[] timGiaTriLonNhat(int[][] arr) {
        int[] max = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            max[i] = timGiaTriLonNhat(arr[i]);
        }

        return max;
    }
    public static int timGiaTriLonNhat(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
