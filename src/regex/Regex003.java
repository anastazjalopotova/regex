package regex;

public class Regex003 {
    public static void main(String[] args) {
        regexTester firstNameTester = new regexTester("[A-Z][a-z]+");
        firstNameTester.validate("Urszula");
        firstNameTester.validate("Tomek");
        firstNameTester.validate("Janusz");
        firstNameTester.validate("Janusz");

        regexTester surnameTester = new regexTester("[a-zA-Z]+(['\\- ][a-zA-Z]+)*");
        surnameTester.validate("Kowalski");
        surnameTester.validate("von der Leyen");
        surnameTester.validate("von der Leyen Aasd");
        surnameTester.validate("von der Leyen-Kowalska");
        surnameTester.validate("Bachleda-Curus");
        surnameTester.validate("de Silva");
        surnameTester.validate("De Silva");
        surnameTester.validate("-Nowak");
    }

}
