package ss21_string_stringbuilder_stringbuffer;

public class StringAndStringBuilder {
    public static void main(String[] args) {
        // Cách chuyển đổi trừ string sang StringBuilder
        String str = "abcdef";
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(str);
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse(); // đảo chuỗi

        //Các chuyển từ StringBuilder sang String
        String temp = stringBuilder.toString();



        System.out.println(stringBuilder);

    }
}
