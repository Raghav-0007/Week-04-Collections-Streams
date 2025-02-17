package junit.basicproblems.testingcalculator;

public class Main {
    public static void main(String[] args) {

        Calculator calc=new Calculator();

        // add two numbers
        int result=calc.add(3,5);
        System.out.println(result);

        // subtract two numbers
        result= calc.subtract(5,2);
        System.out.println(result);

        // multiply two numbers
        result= calc.multiply(3,6);
        System.out.println(result);

        // divide two numbers
        try {
            result=calc.divide(6,0);
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
