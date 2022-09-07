package ss8_nhapdulieutubanphim;

import java.util.Scanner;

public class NhapDuLieuTuBanPhim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào tên của bạn: ");
        String name = scanner.nextLine();
        System.out.println("Tên của bạn là: " + name);

        System.out.print("Nhập vào x: ");
        int x = scanner.nextInt();
        System.out.println("Giá trị của x: " + x);


    }
}
