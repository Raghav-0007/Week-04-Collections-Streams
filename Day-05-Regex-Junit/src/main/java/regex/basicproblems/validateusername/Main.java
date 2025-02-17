package regex.basicproblems.validateusername;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // regex pattern for valid username
        String regex= "^[a-zA-Z][a-zA-Z\\d]{4,14}";

        // taking input from user
        System.out.println("Enter your user name");
        String userName=sc.nextLine();

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(userName);

        // check if the username is valid or not
        if(matcher.matches()){
            System.out.println("username is available");
        }else {
            System.out.println("This username is not available, try again!");
        }

    }
}
