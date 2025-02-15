package exceptionpropagationinmethods;

public class Main {

    // method 1
    public static void method1() throws ArithmeticException{
        throw new ArithmeticException("Handled exception in main");
    }

    // method2
    public static void method2(){
        method1();
    }

    public static void main(String[] args) {

       // handle error
        try {
            method2();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}
