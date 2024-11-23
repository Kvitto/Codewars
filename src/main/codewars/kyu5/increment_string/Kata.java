package codewars.kyu5.increment_string;

import java.math.BigInteger;
//import java.util.regex.Pattern;

public class Kata {
    public static String incrementString(String str) {
        String digits = str.replaceAll(".*\\D", "");
        if (digits.isEmpty()) return str + "1";
        String string = str.substring(0, str.length() - digits.length());
        int padding = digits.length();
        return String.format("%s%0" + padding + "d", string, new BigInteger(digits).add(BigInteger.ONE));

        // Best practice
        //String u = Pattern.compile("(\\d+)$").matcher(str).replaceAll(x -> String.format("%0" + x.group().length() +"d", new BigInteger(x.group()).add(BigInteger.ONE)));
        //return u.matches(".*(?<!\\d)")?u+1:u;
    }
}
