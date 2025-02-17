package regex.extractionproblems.extractemailaddresses;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex="[a-zA-Z\\d_.-]+@[a-zA-Z\\d-]+\\.[a-zA-Z]{2,}";
        Pattern pattern=Pattern.compile(regex);

        String text="Contact us at support@example.com and info@company.org";

        Matcher matcher=pattern.matcher(text);

        // extracting emails from text
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
