package ss36_bieuthuchinhquy;

public class Main {
    public static void main(String[] args) {

        String str = "a";
        // Kiểm tra str có khớp với ký tự "a", "b", "c" hay không?

        // [] => Đại điện cho 1 ký tự duy nhất
        System.out.println("c".matches("[abc]"));
        System.out.println("cd".matches("[abc][def]"));

        //Bài toán, kiểm tra 1 ký tự có phải là ký tự thường
        System.out.println("c".matches("[a-z]"));

        System.out.println("#".matches("[A-Za-z0-9]"));

        // Ký tự đầu tiên không phải là số
        // Ký tự thứ 2 là chữ
        System.out.println("A".matches("[^0-9][a-zA-Z]"));
        System.out.println("#".matches("[^a-z]"));


        System.out.println("xy".matches("x[a-z]y*"));


        // {}
        // Nhập vào số có 3 chữ số
        System.out.println("123".matches("[0-9]{3}"));
        //Nhập vào chuổi: 2 ký tự đầu là chữ, 5 ký tự tiếp theo là số
        System.out.println("123".matches("[a-zA-Z]{2}[0-9]{5}"));

        //Nhập vào chuỗi có 2~5 số
        System.out.println("123".matches("[0-9]{2,5}"));
        //Nhập vào chuỗi có >= 5 số
        System.out.println("1234234234234324".matches("[0-9]{5,}"));

        //Màu xám:
        // gray
        // grey
        System.out.println("grey".matches("gr(a|e)y"));
    }
}
