package junit.advanceproblems.security;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a password to validate (or type 'exit' to quit): ");
            String password = scanner.nextLine();

            if (password.equalsIgnoreCase("exit")) {
                break;
            }

            if (PasswordValidator.isValid(password)) {
                System.out.println("✅ Password is STRONG!");
            } else {
                System.out.println("❌ Password is WEAK! Must have at least 8 characters, one uppercase letter, and one digit.");
            }
        }

        scanner.close();
        System.out.println("Program exited.");
    }
}
