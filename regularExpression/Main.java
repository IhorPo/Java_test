package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // Example 1
        Pattern p = Pattern.compile("[a-zA-Z]+\\s*[a-zA-Z]+");
        Matcher m = p.matcher("Hello World");
        boolean b = m.matches();
        System.out.println(b);


        // Example 3
        Pattern p2 = Pattern.compile("\\w+@\\w+\\.\\w+");
        Matcher m2 = p2.matcher("some email@adres.com and some lmao@adress.com");
        while(m2.find()) {

            System.out.println(m2.group());
        }

        // Example 4
        Pattern p3 = Pattern.compile("(\\+)(\\d+)");
        Matcher m3 = p3.matcher("My phone is +380723335569");
        m3.find();
        System.out.println("Number from string: "+m3.group());

        // Example 5
        Pattern p4 = Pattern.compile("\\+\\d{3}\\(\\d{2}\\)(\\d{2}\\-){2}\\d{3}");
        Matcher m4 = p4.matcher("+380(95)12-32-443");
        boolean b4 = m4.matches();
        System.out.println(b4);
    }
}
