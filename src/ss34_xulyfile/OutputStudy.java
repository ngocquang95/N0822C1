package ss34_xulyfile;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class OutputStudy {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("src/ss34_xulyfile/data/output.txt");

        printWriter.println("Hello");
        printWriter.println("Hello1");
        printWriter.println("Hello2");
        printWriter.println("Hello3");

        printWriter.close();
    }
}
