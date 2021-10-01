package Files.drive;

import Files.model.Person;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ListDeserilizationDemo {

        public static void main(String[] args) throws IOException {
                FileInputStream fis = new FileInputStream("personlist.txt");
                ObjectInputStream personInputStream = new ObjectInputStream(fis);
                ArrayList<Person> personArrayList = null;
                Person person;
                System.out.println("Person details from the file are:  ");
                try{
                        while(true){
                                personArrayList = (ArrayList<Person>) personInputStream.readObject();
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




