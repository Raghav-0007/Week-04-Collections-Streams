package customexception;

import java.util.Scanner;

public class Main {

    public static void validateAge(int age) throws CustomException{
        if(age<18){
            throw new  CustomException("InvalidAgeException");
        }
        System.out.println("your age is valid");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter your age");
            int age=sc.nextInt();
            validateAge(age);
        }catch (CustomException e){
            System.out.println(e.getMessage());
        }
    }
}
