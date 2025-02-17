package junit.advanceproblems.conversion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter temperature (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                double temp = Double.parseDouble(input);
                System.out.println(temp + "°C = " + TemperatureConverter.celsiusToFahrenheit(temp) + "°F");
                System.out.println(temp + "°F = " + TemperatureConverter.fahrenheitToCelsius(temp) + "°C");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }

        scanner.close();
        System.out.println("Program exited.");
    }
}
