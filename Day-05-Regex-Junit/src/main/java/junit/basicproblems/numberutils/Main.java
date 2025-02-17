package junit.basicproblems.numberutils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberUtils numberUtils = new NumberUtils();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (numberUtils.isEven(num)) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }

        scanner.close();
    }
}
