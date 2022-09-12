package ss18_string;

public class Bai11 {
    public static void main(String[] args) {
        String str1 = "ABA";
        String str2 = "ABC";

        // < 0 => str1 < str2
        // = 0 => str1 = str2
        // > 0 => str1 > str2
        System.out.println(str1.compareTo(str2));
    }
}
