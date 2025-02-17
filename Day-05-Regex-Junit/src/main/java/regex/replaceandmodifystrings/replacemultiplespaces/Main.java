package regex.replaceandmodifystrings.replacemultiplespaces;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "\\s+";
        Pattern pattern = Pattern.compile(regex);

        String text = "This   is  an    example          with     multiple   spaces.";

        Matcher matcher = pattern.matcher(text);

        // replace multiple spaces with single space
        String newText=matcher.replaceAll(" ");
        System.out.println(newText);
    }
}
