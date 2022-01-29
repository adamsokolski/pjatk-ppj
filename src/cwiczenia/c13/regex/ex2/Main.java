package cwiczenia.c13.regex.ex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String text = "Ala ma Kota a kto ma Ale";
        String patternString = "a+";

        Pattern pattern = Pattern.compile(patternString);

        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("found: " + count + ": " + matcher.start());
        }
    }
}
