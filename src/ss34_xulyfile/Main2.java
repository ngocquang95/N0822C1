package ss34_xulyfile;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException {
        // .txt hoặc .csv
        Scanner scanner = new Scanner(Paths.get("src/ss34_xulyfile/data/input.txt"));


        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }

//        for (int i = 1; i <=5; i++) {
//            System.out.println(scanner.nextLine());
//        }
        scanner.close();
    }
}
