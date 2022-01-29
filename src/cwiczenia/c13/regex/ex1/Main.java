package cwiczenia.c13.regex.ex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Ala ma Kota a kto ma Ale";
        String patternString = ".*K|kota.*";
        
        Pattern pattern = Pattern.compile(patternString);

        Matcher matcher = pattern.matcher(text);
        boolean matches = matcher.matches();

        System.out.println("matches = " + matches);
    }
}
