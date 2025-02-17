package junit.basicproblems.stringutils;

public class Main {
    public static void main(String[] args) {
        StringUtils utils = new StringUtils();

        // Testing reverse method
        System.out.println("Reverse of 'hello': " + utils.reverse("hello"));

        // Testing isPalindrome method
        System.out.println("'madam' is palindrome? " + utils.isPalindrome("madam"));
        System.out.println("'hello' is palindrome? " + utils.isPalindrome("hello"));

        // Testing toUpperCase method
        System.out.println("Uppercase of 'java': " + utils.toUpperCase("java"));
    }
}
