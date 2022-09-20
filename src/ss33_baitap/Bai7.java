package ss33_baitap;

public class Bai7 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1; j++) {
                if (i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    if ((i + j) % 2 == 0) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
