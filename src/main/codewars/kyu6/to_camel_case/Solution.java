package codewars.kyu6.to_camel_case;

import java.lang.StringBuilder;

public class Solution{

    static String toCamelCase(String s){
        String[] strings = s.split("[-\\_]");
        StringBuilder camelCase = new StringBuilder();
        camelCase.append(strings[0]);
        for (int i = 1; i < strings.length; i++) {
            camelCase.append(strings[i].substring(0, 1).toUpperCase()).append(strings[i].substring(1).toLowerCase());
        }
        return String.valueOf(camelCase);
    }
}
