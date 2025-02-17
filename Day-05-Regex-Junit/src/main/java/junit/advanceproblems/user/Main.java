package junit.advanceproblems.user;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter username (or type 'exit' to quit): ");
            String username = scanner.nextLine();
            if (username.equalsIgnoreCase("exit")) break;

            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            try {
                String result = UserRegistration.registerUser(username, email, password);
                System.out.println("✅ " + result);
            } catch (IllegalArgumentException e) {
                System.out.println("❌ " + e.getMessage());
            }
        }

        scanner.close();
        System.out.println("Program exited.");
    }
}
