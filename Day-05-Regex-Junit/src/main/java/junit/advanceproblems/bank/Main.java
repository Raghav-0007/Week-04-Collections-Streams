package junit.advanceproblems.bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100.0);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCurrent Balance: $" + account.getBalance());
            System.out.print("Enter operation (deposit, withdraw, exit): ");
            String operation = scanner.next().toLowerCase();

            if (operation.equals("exit")) break;

            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();

            try {
                if (operation.equals("deposit")) {
                    account.deposit(amount);
                } else if (operation.equals("withdraw")) {
                    account.withdraw(amount);
                } else {
                    System.out.println("Invalid operation.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}

