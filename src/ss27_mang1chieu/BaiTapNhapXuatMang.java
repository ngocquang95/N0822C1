package ss27_mang1chieu;

import java.util.Scanner;

public class BaiTapNhapXuatMang {
    public static void main(String[] args) {
        // Bước 1: Nhập vào số lượng phần tử của mảng (n > 0)
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập vào số lượng phần tử mảng: ");
            n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Giá trị của bạn nhập vào không hợp lệ (n >= 0), Xin hãy nhập lại!!!");
            }
        } while (n < 0);

        // Bước 2: new số số lượng phần tử (n phần tử) của mảng
        int[] arr = new int[n];

        // Bước 3: Nhập vào từng phần tử của mảng
        nhapMang(arr);

        // Bước 4: Xuất giá trị ở trong mảng
        xuatMang(arr);

        System.out.print("Nhập vào phần tử muốn tìm kiếm: ");
        int k = scanner.nextInt();

        int index = timKiemPhanTuKTrongMang(arr, k);
        if (index >= 0) {
            System.out.println("Chỉ số index của phần tử k: " + index);
        } else {
            System.out.println("Không tìm thấy phần tử k");
        }

        //5 => 1 2 3 4 5
        //6 => 1 2 3 4 5 10
        int x = 10; //Phải nhập dữ liệu

        //Bước 4: cho biến tham chiếu của mảng cũng cho tham chiếu đến mảng mới
        arr = themPhanTuVaoMang(arr, x);

        System.out.println("Mảng sau khi thêm phần tử x");
        xuatMang(arr);
    }

    public static int[] themPhanTuVaoMang(int[] arr, int k) {
        //Bước 1: Tạo ra mảng mới với số lượng phần tử = length hiện tại + 1
        int[] b = new int[arr.length + 1];

        //Bước 2: Đổ dữ liệu tử mảng cũ sang mảng mới
        for (int i = 0; i < arr.length; i++) {
            b[i] = arr[i];
        }

        // Bước 3: đưa phần tử muốn thêm vào mảng vào vị trí cuối mảng mới
        b[b.length - 1] = k;

        //Bước 4: Trả về mảng sau khi thêm phần tử
        return b;
    }

    public static void nhapMang(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập vào arr[%d]: ", i);
            arr[i] = scanner.nextInt();
        }
    }

    public static void xuatMang(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    // 1 2 3 4 5
    // k = 2 => index = 1
    // k = 10 => index = -1
    public static int timKiemPhanTuKTrongMang(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return -1;
    }
}
