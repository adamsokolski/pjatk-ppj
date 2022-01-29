package wyklady.w14.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {

        {
            String a = "6 razy 7 to jest 42";

            Pattern pattern = Pattern.compile("[0-9]+");
            Matcher matcher = pattern.matcher(a);

            while (matcher.find()) {
                System.out.println(
                        matcher.group() + " " + matcher.start() + " " + matcher.end()
                );
            }
        }

        //==================================
        System.out.println();

        {
            String str = "2001-11-02 2012-12-01, 2022-01-31";
            Pattern pattern = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})");
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                System.out.println(
                        matcher.group(0) + "\trok: "
                        + matcher.group(1) + "\tmies: "
                        + matcher.group(2) + "\tdzien: "
                        + matcher.group(3)
                );
            }
        }

        //==================================
        System.out.println();

        {
            String str = "42, 10, 4, 78, 152";
            String[] arr = str.split("[ ,]+");
            for (String s:arr
                 ) {
                System.out.println(s);
            }
        }

        //==================================
        System.out.println();

        {
            String str = "32\ndane4dane\n5\n7input\n3\n";
            Pattern pattern = Pattern.compile("^\\d+$", Pattern.MULTILINE);
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                System.out.println(
                        matcher.group()
                );
            }

        }

        //==================================
        System.out.println();

        {
            String str = "a,b,c";
            Matcher matcher = Pattern.compile("(.*),(.*)").matcher(str); // a,b c
            if (matcher.matches()) {
                System.out.println(
                        matcher.group(1) + " " + matcher.group(2)
                );
            }


            Matcher matcher2 = Pattern.compile("(.*?),(.*?)").matcher(str); // a b,c
            if (matcher2.matches()) {
                System.out.println(
                        matcher2.group(1) + " " + matcher2.group(2)
                );
            }

        }

    }
}



