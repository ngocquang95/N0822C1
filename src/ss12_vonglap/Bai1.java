package ss12_vonglap;

import java.util.Scanner;

/**
 * 1.	In dãy số 1, 2, 3, 4, 5 … n (n là số nhập vào từ bàn phím)
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào giá trị n: ");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Giá trị của bạn nhập vào không hợp lệ (n >= 0), Xin hãy nhập lại!!!");
            }
        } while (n < 0);

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "   ");
        }
        // n = 3
        // Bước 1: int i = 1 => 1 <= 3 => 1
        // Bước 2: int i = 2 => 2 <= 3 => 1  2
        // Bước 3: int i = 3 => 3 <= 3 => 1  2    3
        // Bước 4: int i = 4 => 4 <= 3 => Kết thức vòng lặp

        for (int i = 0; i <= n - 1; i++) {
            System.out.print(i + 1 + "   ");
        }

        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + "   ");
        }
    }
}
