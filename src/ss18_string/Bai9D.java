package ss18_string;

public class Bai9D {
    public static void main(String[] args) {
        String str = "Hello World";

        int count;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            System.out.println(str.charAt(i) + " : " + count);

        }
    }
}
