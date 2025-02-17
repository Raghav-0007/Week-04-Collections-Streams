package regex.basicproblems.validatelicenseplatenumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // regex pattern for plate number
        String regex="[A-Z]{2}\\d{4}";
        Pattern pattern=Pattern.compile(regex);

        // taking input from user
        System.out.println("Enter your plate number");
        String number=sc.nextLine();
        Matcher matcher=pattern.matcher(number);

        // check if the plate number is valid or not
        if(matcher.matches()){
            System.out.println("Valid plate number");
        }else {
            System.out.println("Invalid plate number");
        }

    }
}
