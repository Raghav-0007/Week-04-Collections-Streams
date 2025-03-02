package reflection.basiclevel.dynamicallycreateobjects;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {

        // create object using reflection
        try {
            Class<?> cl = Class.forName("reflection.basiclevel.dynamicallycreateobjects.Student");
            Constructor<?> constructor= cl.getDeclaredConstructor();
            constructor.setAccessible(true);
            Student student=(Student) constructor.newInstance();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
