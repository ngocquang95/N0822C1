package ss27_mang1chieu;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        // Tạo ra mảng lưu trữ 10 số nguyên kiểu int
        int[] arr1 = new int[10]; //Tạo ra 10 ô nhớ => giá trị mặc đinh = 0
//        int arr2[] = new int[10];
        //System.out.println(arr1[0]); // Truy xuất thông qua chỉ số index
        // index: 0 -> length - 1

        int[] arr3 = new int[] {1, 2, 3, 4, 5};
        int[] arr4 = {1, 2, 3, 4, 5}; // Khi khai báo và khởi tạo trên cùng 1 dòng thì có thể viết tắt

//        int[] arr5;
//        arr5  =  {1, 2, 3, 4, 5};

        int[] arr6 = {1, 2, 3, 4, 5};
        /*
        1. Tất cả các kiểu dữ liệu ở trong mảng phải cùng kiểu dữ liệu
        2. Vùng nhớ liên tục nhau
        3. Không thể co dãn vùng nhớ
        4. Truy xuất phần tử thông qua chỉ số index
         */

        arr3[2] = 1000;
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + "\t");
        }
    }
}
