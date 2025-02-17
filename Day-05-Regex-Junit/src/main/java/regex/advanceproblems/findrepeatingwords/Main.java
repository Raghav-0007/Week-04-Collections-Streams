package regex.advanceproblems.findrepeatingwords;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex="(\\w+)\\s+\\1";
        Pattern pattern=Pattern.compile(regex);

        String text="This is is a repeated repeated word test.";

        Matcher matcher=pattern.matcher(text);

        // extracting currency values from text
        while (matcher.find()){
            String language = matcher.group(1);
            System.out.print(language+", ");
        }
    }
}
