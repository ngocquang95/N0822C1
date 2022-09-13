package ss25_epkieu;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        long b = a; // ép kiểu nhầm định

        // Tường minh
        long x = 2200000000L;
        int y = (int) x;

        System.out.println(y);
    }
}
