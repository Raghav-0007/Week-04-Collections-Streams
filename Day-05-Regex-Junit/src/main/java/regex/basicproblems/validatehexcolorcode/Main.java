package regex.basicproblems.validatehexcolorcode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // create regex pattern for hex color code
        String regex="#[a-fA-F\\d]{6}";

        Pattern pattern=Pattern.compile(regex);

        // taking user input
        System.out.println("Enter color code");
        String code=sc.nextLine();

        Matcher matcher=pattern.matcher(code);

        // check if the color code is valid or not
        if(matcher.matches()){
            System.out.println("Valid color code");
        }else {
            System.out.println("Invalid color code");
        }
    }
}
