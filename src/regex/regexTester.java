package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexTester {
    private Pattern pattern;

    public regexTester(String patternAsAstring){
        this.pattern = Pattern.compile(patternAsAstring);

    }
    public void validate (String text){
        Matcher matcher = pattern.matcher(text);
        if (matcher.matches()){
            System.out.println("Prawda dla tekstu: " + text);
        }else{
            System.out.println("Falsz dla tekstu: " + text);
        }
    }
}
