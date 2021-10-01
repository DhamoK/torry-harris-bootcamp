package Files.drive;

import Files.model.Person;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeserializationPersonDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("person.txt");
        ObjectInputStream personInputStream = new ObjectInputStream(fis);
        ArrayList<Person> personArrayList = new ArrayList<>();
        Person person;
        System.out.println("Person details from the file are:  ");
        try{
            while(true){
                person = (Person) personInputStream.readObject();
                personArrayList.add(person);
            }

            }
        catch (EOFException |ClassNotFoundException t){

            }
        personArrayList.sort(null);
        for(Person p:personArrayList){
            System.out.println(p);
        }
    }
}


