package cwiczenia.c13.regex.ex3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String text = "Bob Rossss adsf Bob Ros Bobb Rosssss Bob Tom Rosss";
        String patternString = "(Bob+) (Ros+)";

        Pattern pattern = Pattern.compile(patternString);

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("\"" + matcher.group(2) + "\"" );
        }
    }
}
