package regex.advanceproblems.validateipaddress;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex="\\b((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\b";
        Pattern pattern=Pattern.compile(regex);

        String ipAddress="127.0.0.1";

        Matcher matcher=pattern.matcher(ipAddress);

        // check if IP address is valid or not
        if(matcher.matches()){
            System.out.println("Valid IP address");
        }else {
            System.out.println("Invalid IP address");
        }
    }
}
