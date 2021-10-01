package Files.drive;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) throws IOException {


        String name;
        int n;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        n = sc.nextInt();
        int i = 0;
        String data;
        FileWriter writer = new FileWriter("name3.txt");
        while (i < n) {
            data = "MY NAME IS " + name + "\n";
            writer.write(data);
            i++;
        }
        writer.flush();
        writer.close();
    }
}
