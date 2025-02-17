package regex.advanceproblems.validatessn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex="\\b\\d{3}-\\d{2}-\\d{4}\\b";
        Pattern pattern=Pattern.compile(regex);

        String ssn="123-45-6789";

        Matcher matcher=pattern.matcher(ssn);

        // check if ssn is valid or not
        if(matcher.matches()){
            System.out.println(ssn+" is valid");
        }else {
            System.out.println(ssn+" is invalid");
        }
    }
}
