package ss12_vonglap;

public class ForLoop {
    public static void main(String[] args) {
        // Vòng lặp for
        //for (giá trị khởi tạo; điều kiện để chạy tiếp; bước lặp) { Khối code }
        for (int i = 1; i <= 5; i = i + 1) {
            System.out.println("Hello");
        }
        // Bước 1: int i = 1 => "Hello"
        // Bước 2: i = 2 =>  "Hello"
        // Bước 3: i = 3 =>  "Hello"
        // Bước 4: i = 4 =>  "Hello"
        // Bước 5: i = 5 =>  "Hello"

        for (int i = 0; i <= 4; i = i + 1) {
            System.out.println("Hello");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }
}
