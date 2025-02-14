package serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        // create object of the class
        Employee employee1=new Employee("102","abc","cs", 28000 );
        Employee employee2=new Employee("105","xyz","ai", 29000 );

        String file="src/main/java/serialization/file.txt";

        try {
            // create output stream
            FileOutputStream outputStream=new FileOutputStream(file);
            ObjectOutputStream output=new ObjectOutputStream(outputStream);

            // save object
            output.writeObject(employee1);
            output.writeObject(employee2);
            output.close();

            // create input stream
            FileInputStream inputStream=new FileInputStream(file);
            ObjectInputStream input=new ObjectInputStream(inputStream);

            // get object
            Employee obj1=(Employee) input.readObject();
            Employee obj2=(Employee) input.readObject();
            obj1.getEmployeeDetails();
            obj2.getEmployeeDetails();
            input.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
