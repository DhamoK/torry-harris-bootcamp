package Files.drive;

import Files.model.Employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {

        Employee e1 = new Employee(1003,"KUMAR","DBA",52000);
        Employee e2 = new Employee(1001,"SARAVANA","QA",45000);
        Employee e3 = new Employee(1003,"KUMARAESAN","SALES",52000);

        FileOutputStream fos = new FileOutputStream("employees.txt");
        ObjectOutputStream employeeOutputStream = new ObjectOutputStream(fos);

        employeeOutputStream.writeObject(e1);
        employeeOutputStream.writeObject(e2);
        employeeOutputStream.writeObject(e3);
        employeeOutputStream.flush();
        employeeOutputStream.close();
        fos.close();

    }
}
