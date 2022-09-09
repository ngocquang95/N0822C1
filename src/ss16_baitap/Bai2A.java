package ss16_baitap;

public class Bai2A {
    public static void main(String[] args) {
//        int n = 123456; // số nhập vào
//
//        StringBuilder stringBuilder = new StringBuilder(n + "");
//
//        String dao = stringBuilder.reverse().toString();
//
//        int x = Integer.parseInt(dao);
//
//        System.out.println(x);
//
//        int k = 5;
//        int can = (int) Math.sqrt(k);
//
//        System.out.println(can * can == k);

//        StringBuilder stringBuilder = new StringBuilder("Lộc");
//        String dao = stringBuilder.reverse().toString();
//        System.out.println(dao);

        int a = 1000;
        int b = 4;

        int min = a < b ? a : b;
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
                break;
            }
        }

    }

    // 6 4 => 2

}
