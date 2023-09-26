package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        Pattern pattern = Pattern.compile(".*\\d{4}-\\d{2}-\\d{2}.*");
        Matcher matcher = pattern.matcher(userInput);
        if (matcher.matches()) {
            System.out.println("Jest data w tekście");
        } else {
            System.out.println("W tekscie nie ma daty");
        }

    }
}
