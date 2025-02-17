package regex.advanceproblems.extractcurrencyvalues;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex="\\$?\\d+.\\d+";
        Pattern pattern=Pattern.compile(regex);

        String text="The price is $45.99, and the discount is 10.50.";

        Matcher matcher=pattern.matcher(text);

        // extracting currency values from text
        while (matcher.find()){
            String language = matcher.group();
            System.out.print(language+", ");
        }
    }
}
