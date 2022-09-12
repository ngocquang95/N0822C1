package ss21_string_stringbuilder_stringbuffer;

public class EqualsStudy {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1.equals(str2));

        StringBuilder stringBuilder1 = new StringBuilder("hello");
        StringBuilder stringBuilder2 = new StringBuilder("hello");

        System.out.println(stringBuilder1 == stringBuilder2); // false
        System.out.println(stringBuilder1.toString().equals(stringBuilder2.toString())); // true
    }
}
