package regex.advanceproblems.extractprogramminglanguage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex="(JavaScript|Java|Python|Go|C\\+\\+|C#|Ruby|Swift|Kotlin|PHP|Perl|Rust|TypeScript)";
        Pattern pattern=Pattern.compile(regex);

        String text="I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        Matcher matcher=pattern.matcher(text);

        // extracting capitalized words from text
        while (matcher.find()){
            String language = matcher.group();
            System.out.print(language+", ");
        }
    }
}
