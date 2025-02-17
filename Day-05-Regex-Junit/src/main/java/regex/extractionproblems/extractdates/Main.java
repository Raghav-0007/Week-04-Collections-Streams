package regex.extractionproblems.extractdates;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "\\d{2}/\\d{2}/\\d{4}";
        Pattern pattern = Pattern.compile(regex);

        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        Matcher matcher = pattern.matcher(text);

        // extracting dates from text
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
