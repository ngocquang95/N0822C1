package ss12_vonglap;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        // Vòng do-while => lặp ít nhất một lần
//        int i = 1;
//        do {
//            System.out.println("Hello");
//            i = i + 1;
//        } while (false);

        //Phải nhập vào số nguyên dương n

        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào giá trị n: ");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Giá trị của bạn nhập vào không hợp lệ (n >= 0), Xin hãy nhập lại!!!");
            }
        } while (n < 0);

        System.out.println("Giá trị của n là: " + n);
    }
}
