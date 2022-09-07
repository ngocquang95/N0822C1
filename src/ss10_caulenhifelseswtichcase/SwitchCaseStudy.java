package ss10_caulenhifelseswtichcase;

public class SwitchCaseStudy {
    public static void main(String[] args) {
        char type = 'A';

        switch (type){
            case 'A':
                System.out.println("Xếp loại tốt");
                break;
            case 'B':
                System.out.println("Xếp loại Khá");
                break;
            default:
                System.out.println("Bình thường");
        }
    }
}
