package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream i = new FileInputStream("i.txt");
        System.out.println("File Contains : ");
        int ch;
        while((ch=i.read())!=-1){
            System.out.print((char)ch);
        }
        i.close();

        FileOutputStream j = new FileOutputStream("output.txt");
        String str = "This is an output file \n so you can scribble anything...... ";
        char[]array = str.toCharArray();
        for(char c: array){
            j.write((int)c);
        }
        j.close();

    }
}
