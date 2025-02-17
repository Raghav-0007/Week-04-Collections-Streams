package regex.extractionproblems.extractcapitalizedwords;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex="[A-Z]\\S*";
        Pattern pattern=Pattern.compile(regex);

        String text="The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        Matcher matcher=pattern.matcher(text);

        // extracting capitalized words from text
        while (matcher.find()){
            String word = matcher.group();
            System.out.print(word+", ");
        }

    }
}
