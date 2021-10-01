package Files.drive;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderWriteDemo {
    public static void main(String[] args) throws IOException {
        File input = new File("i.txt");
        FileReader reader = new FileReader(input);
        char []array = new char[(int)input.length()];
        reader.read(array);
        String data = new String(array);
        System.out.println(data);
        reader.close();

        data = "This is Contents of output file......";

        FileWriter writer = new FileWriter("output2.txt");
        writer.write(data);
        writer.flush();
        writer.close();

    }
}
