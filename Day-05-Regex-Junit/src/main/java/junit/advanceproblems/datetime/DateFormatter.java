package junit.advanceproblems.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {

    // Convert yyyy-MM-dd to dd-MM-yyyy
    public static String formatDate(String inputDate) {
        try {
            LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        } catch (DateTimeParseException e) {
            return "Invalid Date Format";
        }
    }
}
