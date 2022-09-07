package ss15_phuongthuc;

import java.util.Scanner;

public class PhuongThuc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        do {
            System.out.print("Nhập vào giá trị a: ");
            a = scanner.nextInt();

            if (a < 0) {
                System.out.println("Giá trị của bạn nhập vào không hợp lệ (a >= 0), Xin hãy nhập lại!!!");
            }
        } while (a < 0);

        int b;
        do {
            System.out.print("Nhập vào giá trị c: ");
            b = scanner.nextInt();

            if (b < 0) {
                System.out.println("Giá trị của bạn nhập vào không hợp lệ (c >= 0), Xin hãy nhập lại!!!");
            }
        } while (b < 0);

        int c;
        do {
            System.out.print("Nhập vào giá trị c: ");
            c = scanner.nextInt();

            if (c < 0) {
                System.out.println("Giá trị của bạn nhập vào không hợp lệ (c >= 0), Xin hãy nhập lại!!!");
            }
        } while (c < 0);

        //Ctrl + D => nhân bản phần copy

        long giaThuaA = 1;
        for (int i = 2; i <= a; i++) {
            giaThuaA *= i;
        }
        long giaThuaB = 1;
        for (int i = 2; i <= b; i++) {
            giaThuaB *= i;
        }
        long giaThuaC = 1;
        for (int i = 2; i <= c; i++) {
            giaThuaC *= i;
        }

        long S = giaThuaA + giaThuaB + giaThuaC;

        System.out.printf("%d! + %d! + %d! = %d", a, b, c, S);
    }
}
