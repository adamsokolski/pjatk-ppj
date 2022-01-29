package wyklady.w14.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        {
            Pattern pattern = Pattern.compile("a[A-Z]c"); // A-Z
            Matcher matcher = pattern.matcher("asdaaBc");
            System.out.println(matcher.find());
        }
        {
            Pattern pattern = Pattern.compile("a[^G]c"); // not G
            Matcher matcher = pattern.matcher("asdafc");
            System.out.println(matcher.find());
        }
        {
            Pattern pattern = Pattern.compile("a\\dc"); // digit [0-9]
            Matcher matcher = pattern.matcher("asda7c");
            System.out.println(pattern + ": " + matcher.find());
        }
        {
            Pattern pattern = Pattern.compile("a[A-Z0-5]c"); // A-Z or 0-5
            String string = "asda2c";
            Matcher matcher = pattern.matcher(string);
            System.out.println("pattern: " + pattern + ", string: " + string + " -> " + matcher.find());
        }
        {
            Pattern pattern = Pattern.compile("a[A-Z&&[ABC]]c");
            String string = "asdaCc";
            Matcher matcher = pattern.matcher(string);
            System.out.println("pattern: " + pattern + ", string: " + string + " -> " + matcher.find());
        }
        {
            Pattern pattern = Pattern.compile("a\\sc"); // space, tab, new line
            String string = "asda c";
            Matcher matcher = pattern.matcher(string);
            System.out.println("pattern: " + pattern + ", string: " + string + " -> " + matcher.find());
        }
        {
            Pattern pattern = Pattern.compile("a\\wc"); // word [a-zA-z0-9]
            String string = "asdac";
            Matcher matcher = pattern.matcher(string);
            System.out.println("pattern: " + pattern + ", string: " + string + " -> " + matcher.find());
        }
        {
            Pattern pattern = Pattern.compile("a\\Wc"); // ^word
            String string = "asdac";
            Matcher matcher = pattern.matcher(string);
            System.out.println("pattern: " + pattern + ", string: " + string + " -> " + matcher.find());
        }
        {
            Pattern pattern = Pattern.compile("a.c"); // any letter
            String string = "asdagc";
            Matcher matcher = pattern.matcher(string);
            System.out.println("pattern: " + pattern + ", string: " + string + " -> " + matcher.find());
        }
        {
            Pattern pattern = Pattern.compile("a\\d\\d\\dc"); // 3 digits
            String string = "asda123c";
            Matcher matcher = pattern.matcher(string);
            System.out.println("pattern: " + pattern + ", string: " + string + " -> " + matcher.find());
        }
        {
            Pattern pattern = Pattern.compile("a\\d{3,8}c"); // 3-8 digits
            String string = "asda123c";
            Matcher matcher = pattern.matcher(string);
            System.out.println("pattern: " + pattern + ", string: " + string + " -> " + matcher.find());
        }
        {
            Pattern pattern = Pattern.compile("a\\d{3,}c"); // 3 or more digits
            String string = "asda123c";
            Matcher matcher = pattern.matcher(string);
            System.out.println("pattern: " + pattern + ", string: " + string + " -> " + matcher.find());
        }
        {
            Pattern pattern = Pattern.compile("a\\d?c"); // 0 or 1
            String string = "asda123c";
            Matcher matcher = pattern.matcher(string);
            System.out.println("pattern: " + pattern + ", string: " + string + " -> " + matcher.find());
        }
        {
            Pattern pattern = Pattern.compile("a\\d*c"); // 0 or more
            String string = "asda123c";
            Matcher matcher = pattern.matcher(string);
            System.out.println("pattern: " + pattern + ", string: " + string + " -> " + matcher.find());
        }
        {
            Pattern pattern = Pattern.compile("a\\d+c"); // 1 or more
            String string = "asda123c";
            Matcher matcher = pattern.matcher(string);
            System.out.println("pattern: " + pattern + ", string: " + string + " -> " + matcher.find());
        }

        //=======================
        {
            Pattern pattern = Pattern.compile("s\\d{4,}");
            String string = "s0534";
            Matcher matcher = pattern.matcher(string);
            System.out.println("pattern: " + pattern + ", string: " + string + " -> " + matcher.find());
        }
    }
}
