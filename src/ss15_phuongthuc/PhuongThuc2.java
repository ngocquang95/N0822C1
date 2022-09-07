package ss15_phuongthuc;

import java.util.Scanner;

public class PhuongThuc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = nhapSoNguyenDuong("a");
        int b = nhapSoNguyenDuong("b");
        int c = nhapSoNguyenDuong("c");

        //Ctrl + D => nhân bản phần copy

        long giaThuaA = tinhGiaiThua(a);
        long giaThuaB = tinhGiaiThua(b);
        long giaThuaC = tinhGiaiThua(c);

        long S = giaThuaA + giaThuaB + giaThuaC;

        System.out.printf("%d! + %d! + %d! = %d", a, b, c, S);
    }

    private static long tinhGiaiThua(int n) {
        long giaThuaN = 1;
        for (int i = 2; i <= n; i++) {
            giaThuaN *= i;
        }
        return giaThuaN;
    }

    static int nhapSoNguyenDuong(String target) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.printf("Nhập vào giá trị %s: ", target);
            n = scanner.nextInt();

            if (n < 0) {
                System.out.printf("Giá trị của bạn nhập vào không hợp lệ (%s >= 0), Xin hãy nhập lại!!!", target);
            }
        } while (n < 0);

        return n;
    }
}
