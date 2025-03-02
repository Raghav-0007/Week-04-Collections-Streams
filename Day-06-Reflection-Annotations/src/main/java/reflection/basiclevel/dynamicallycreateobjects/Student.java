package reflection.basiclevel.dynamicallycreateobjects;

public class Student {
    private String name;

    private Student(){
        System.out.println("object created");
        name="abc";
    }
}
