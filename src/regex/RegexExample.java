package regex;
/*
Prredefiniowane klsay:
\\d - jakakolwiek cyfra = [0-9]
\\D - JAKIKOLWIEK ZNAK KTORY NIE K=JEST CYFRA
\\w - znak uzywany w slowach (word) = [a-zA-Z0-9_]
\\W - jakikolwiek znak ktory nie jest uzywany w slowach
\\s - tzw biale znaki, czyli znak spacju, tabulacji i tp. (spacja, enter, tab..) [\t\n\r\f\xOB
 */

import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String yearPattern = "\\d{4}";
        regexTester tester = new regexTester(yearPattern);
        tester.validate("1984");
        tester.validate("2023");
        tester.validate("2023123");
        tester.validate("202");
        tester.validate("2");

        regexTester t = new regexTester("\\d\\w\\d");
        t.validate("1_6");
        t.validate("0X4");
        t.validate("a7b");
        t.validate("0 3");

    }
}
