package ss12_vonglap;

import java.util.Scanner;

/**
 * 3.	In dãy số 2, -4, 6, -8, 10 … n (n là số nhập vào từ bàn phím) (*)
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào giá trị n: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i += 2) {
            if (i % 4 == 0) {
                System.out.print(-i + "   ");
            } else {
                System.out.print(i + "   ");
            }

        }
    }
}
