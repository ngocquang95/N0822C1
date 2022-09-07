package ss16_baitap;

public class Bai1A {
    public static void main(String[] args) {
       System.out.println(chuyenDoi('a'));
    }

    static char chuyenDoi(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char) (c + 32);
        }

        if (c >= 'a' && c <= 'x') {
            return (char) (c - 32);
        }

        return c;
    }
}
