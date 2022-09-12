package ss21_string_stringbuilder_stringbuffer;

public class Main {
    public static void main(String[] args) {
        String str = "Hello"; // str biến đối tượng
        str = str + "world"; //"Helloworld"
        str = str + "abc"; //"Helloworldabc"
        str = str + "def"; //"Helloworldabcdef"

        StringBuilder stringBuilder = new StringBuilder(); //0xABC
        stringBuilder.append("Hello");
        stringBuilder.append("world");
        stringBuilder.append("abc");
        stringBuilder.append("def");

        System.out.println(stringBuilder);


//        String temp = "";
//        StringBuilder stringBuilder1 = new StringBuilder();
//        for (int i = 0; i < 10; i++) {
//            temp += i;
//            stringBuilder1.append(i);
//        }
    }
}
