package ss21_string_stringbuilder_stringbuffer;

public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {
        // 10 luồng cùng truy cập vào phương thức test => Dễ gây ra lỗi
//        test();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello");

    }
    // synchronized - đồng bộ
    public synchronized static void test() {
        // dài 1000 dòng
    }
}
