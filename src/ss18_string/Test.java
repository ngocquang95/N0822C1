package ss18_string;

public class Test {
    public static void main(String[] args) {
        String str1 = "Nguyễn Ngọc Quang";
        String str2 = "Nguyễn Ngọc Quang";
        String str3 = new String("Nguyễn Ngọc Quang");

        // == là toán tử so sánh giá trị
        // Tham chiếu
        // == so sánh giá trị => giá trị là địa chỉ => so sánh địa chỉ
        System.out.println(str1 == str2); // true => true
        System.out.println(str1.equals(str2)); // true

        System.out.println(str1 == str3); // true => false
        System.out.println(str1.equals(str3)); // true
    }
}
