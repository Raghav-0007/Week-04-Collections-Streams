package reflection.basiclevel.invokeprivatemethod;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        // create object for the class
        Calculator calc=new Calculator();
        // access the data of class
        try {
            Class<?> cl = Class.forName("reflection.basiclevel.invokeprivatemethod.Calculator");
            Method method=cl.getDeclaredMethod("multiply", int.class, int.class);
            method.setAccessible(true);
            int result=(int)method.invoke(calc, 4,5);
            System.out.println(result);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
