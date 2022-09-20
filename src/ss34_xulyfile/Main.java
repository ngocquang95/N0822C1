package ss34_xulyfile;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // .txt hoặc .csv
        Scanner scanner = new Scanner(Paths.get("src/ss34_xulyfile/data/input.txt"));

        String[] strings = new String[5];
        for (int i = 1; i <=5; i++) {
            strings[i - 1] = scanner.nextLine();
        }

        System.out.println(strings[2]);

        scanner.close();
    }
}
