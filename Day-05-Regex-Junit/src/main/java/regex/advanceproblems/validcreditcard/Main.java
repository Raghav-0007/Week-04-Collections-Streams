package regex.advanceproblems.validcreditcard;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex="4\\d{15}";
        Pattern pattern=Pattern.compile(regex);

        String cardNumber="4989684933749245";

        Matcher matcher=pattern.matcher(cardNumber);

        // check if credit card number is valid or not
        if(matcher.matches()){
            System.out.println("Valid credit card number");
        }else {
            System.out.println("Invalid credit card number");
        }
    }
}
