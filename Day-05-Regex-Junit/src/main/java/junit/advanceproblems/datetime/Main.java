package junit.advanceproblems.datetime;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a date in yyyy-MM-dd format (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String formattedDate = DateFormatter.formatDate(input);
            System.out.println("Formatted Date: " + formattedDate);
        }

        scanner.close();
        System.out.println("Program exited.");
    }
}
