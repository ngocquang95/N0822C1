package ss12_vonglap;

import java.util.Scanner;

/**
 * 2.	In dãy số 1, 3, 5, 7, 9 … n (n là số nhập vào từ bàn phím)
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào giá trị n: ");
        int n = scanner.nextInt();

        //1 / 2 = 0 dư 1
        // 2 / 2 = 1 dư 0
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 != 0) { // Số lẽ thì true
//                System.out.print(i + "   ");
//            }
//        }

        for (int i = 1; i <= n; i = i + 2) {
            System.out.print(i + "   ");
        }

        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + "   ");
        }
    }
}
