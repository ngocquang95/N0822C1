package ss30_arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Array
        /*
        Không thể co giãn vùng nhớ
        Không có các phương thức hỗ trợ cho việc thao tác với mảng
         */

        //generic
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10); // autoboxing
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);

        //10 20 30 40 50
        //20 30 40 50

        arrayList.set(0, 100); // update - cập nhật
        arrayList.remove(0);
        System.out.println(arrayList.get(0)); // read
        /*
        CRUD
        C - Create - Thêm - add
        R - Read - Đọc - Lấy - get
        U - Update - Chỉnh sửa - set
        D - Delete - Remove - Xóa
         */

//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.print(arrayList.get(i) + "\t");
//        }

//        System.out.println(arrayList);
    }
}
