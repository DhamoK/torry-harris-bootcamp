package Files.drive;

import Files.model.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationPersonDemo {
    public static void main(String[] args) throws IOException {

        Person e1 = new Person(1003,"KUMAR","TN","SE");
        Person e2 = new Person(1001,"SARAVANA","KA","ACTOR");
        Person e3 = new Person(1002,"KUMARAESAN","MP","ENGINEER");

        FileOutputStream fos = new FileOutputStream("person.txt");
        ObjectOutputStream personOutputStream = new ObjectOutputStream(fos);

        personOutputStream.writeObject(e1);
        personOutputStream.writeObject(e2);
        personOutputStream.writeObject(e3);
        personOutputStream.flush();
        personOutputStream.close();
        fos.close();

    }
}