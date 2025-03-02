package reflection.basiclevel.acessprivatefields;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Person person=new Person();
        try{
            Class<?> cl=Class.forName("reflection.basiclevel.acessprivatefields.Person");

            // access field of person class
            Field field=cl.getDeclaredField("age");
            field.setAccessible(true);

            // get age of person
            System.out.println(field.get(person));

            // set and get, age of person
            field.set(person, 30);
            System.out.println(field.get(person));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
