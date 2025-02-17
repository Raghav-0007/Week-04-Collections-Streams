package regex.replaceandmodifystrings.censorbadwords;

public class Main {
    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";
        String regex = "\\b(damn|stupid)\\b"; // List of bad words
        String censoredText = text.replaceAll(regex, "****");

        System.out.println(censoredText);
    }
}
