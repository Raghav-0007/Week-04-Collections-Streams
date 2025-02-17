package regex.extractionproblems.extractlinks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "\\S+://\\S+";
        Pattern pattern = Pattern.compile(regex);

        String text = "\"Visit https://www.google.com and http://example.org";

        Matcher matcher = pattern.matcher(text);

        // extracting links from text
        while (matcher.find()) {
            String date=matcher.group();
            System.out.println(date+", ");
        }
    }
}
