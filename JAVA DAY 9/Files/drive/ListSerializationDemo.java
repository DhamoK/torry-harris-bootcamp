package Files.drive;

import Files.model.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ListSerializationDemo {
        public static void main(String[] args) throws IOException {

            Person e1 = new Person(1003,"KUMAR","TN","SE");
            Person e2 = new Person(1001,"SARAVANA","KA","ACTOR");
            Person e3 = new Person(1002,"KUMARAESAN","MP","ENGINEER");
            ArrayList<Person> person = new ArrayList<>();
            person.add(e1);
            person.add(e2);
            person.add(e3);

            FileOutputStream fos = new FileOutputStream("personlist.txt");
            ObjectOutputStream personOutputStream = new ObjectOutputStream(fos);

            personOutputStream.writeObject(person);

            personOutputStream.flush();
            personOutputStream.close();
            fos.close();

        }
    }

