package ss32_mang2chieu;

public class Main {
    public static void main(String[] args) {
        // Mảng 2 chiều thực chất là mảng 1 chiều nhưng mỗi phần tử bên
        //trong mảng một chiều lại là mảng một chiều

        int[] a = new int[] {1, 2, 3};
        //System.out.println(a[1]);

        int[][] arr = {{1, 2, 3}, {4, 5}, {6, 7, 9}};
        //System.out.println(arr[1][1]);

        for (int i = 0; i < arr.length; i++) { // i hàng
            for (int j = 0; j < arr[i].length; j++) {// j cột
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        int n = 10;
        String [][] hinh = new String[n][n];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    hinh[i - 1][j - 1] = " *";
                } else {
                    hinh[i - 1][j - 1] = "  ";
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print( hinh[i][j]);
            }
            System.out.println();
        }

    }
}
