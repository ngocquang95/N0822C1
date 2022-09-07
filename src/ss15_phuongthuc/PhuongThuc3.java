package ss15_phuongthuc;

public class PhuongThuc3 {
    public static void main(String[] args) {
        // Kiểm tra n nhập vào có phải là số nguyên tố hay không

        int n = 11;

        if (kiemTraSoNT(n)) {
            System.out.println("n là số nguyên tố");
        } else {
            System.out.println("n không phải là số nguyên tố");
        }
    }

    /**
     * Là số chỉ chia hết cho 1 và chính nó
     */
    static boolean kiemTraSoNT(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
