package codewars.kyu6.to_camel_case;

import java.util.regex.Pattern;

class Solution{

    static String toCamelCase(String s){
        return Pattern.compile("[-|_](.)").matcher(s).replaceAll(r -> r.group(1).toUpperCase());
    }
}
