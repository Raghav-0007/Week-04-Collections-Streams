package finallyblockexecution;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        try {
            // taking input from user
            System.out.println("Enter num 1");
            int a=sc.nextInt();
            System.out.println("Enter num 2");
            int b=sc.nextInt();

            int result=a/b;
            System.out.println(result);
        }catch (InputMismatchException | ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Operation completed");
        }
    }
}
