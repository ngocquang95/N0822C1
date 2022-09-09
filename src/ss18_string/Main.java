package ss18_string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String str1 = scanner.nextLine();
//        char c = scanner.nextLine().charAt(0);

//        System.out.println(str1.charAt(0));
//        String str = "nguyễn ngọc quang";
//        String name = str.replace('n', 'x');
//
//        System.out.println(name);

        int a = 3;
        double b = 2;
        // "1 + 2 = 3"
        String str = a + " + " + b + " = " + (a + b);
        String str2 = String.format("%d + %f = %f", a, b, a + b);
        /*
        Đặc tả
        %d: Số nguyên
        %s: String
        %c: char
        %f: số thực
         */
        System.out.println(str);
        System.out.println(str2);


        //d: là biến
        //2: là giá trị
        int d = 2;

        //name: biến đối tượng, biến tham chiếu
        //"Hello": đối tượng
        String name = "Hello";
    }
}
