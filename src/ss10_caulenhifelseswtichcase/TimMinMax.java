package ss10_caulenhifelseswtichcase;

import java.util.Scanner;

public class TimMinMax {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;

        int max = a > b ? a : b;
        int min = a < b ? a : b;
//        if (a < b) {
//            max = b;
//            min = a;
//        } else {
//            max = a;
//            min = b;
//        }
        System.out.println("Giá trị max: " + max);
        System.out.println("Giá trị min: " + min);

        int x  = 1;
        int y = 2;

        int temp = x;
        x = y;
        y = temp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        Scanner scanner = new Scanner(System.in);

        //"A"
        char c = scanner.nextLine().charAt(0);

        if (c >= 'A' && c <= 'Z') {
            c += 32;
        }

        System.out.println(c);

        int month = 2;
//
//        switch (month) {
//
//        }

        if (month == 1 || month == 3 || month == 5) {
            System.out.println("Tháng có 31 ngày");
        }

    }
}
