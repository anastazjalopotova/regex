package regex;

public class Regex002 {
    public static void main(String[] args) {
        regexTester tester = new regexTester("[A-Z][a-z]+");

        tester.validate("Java");//true
        tester.validate("Ja");//true
        tester.validate("java");//false
        tester.validate("javA");//false
        tester.validate("JAVa");//false
        tester.validate("J");//false
        tester.validate("aJ");//false

    }
}
