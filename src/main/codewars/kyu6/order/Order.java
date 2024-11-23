package codewars.kyu6.order;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Order {
    public static String order(String words) {
        if (words.isEmpty()) return "";
        return String.join(" ", Arrays.stream(words.split(" "))
                .collect(Collectors.toMap(s -> Integer.parseInt(s.replaceAll("[^0-9]", "")), s -> s))
                .values());
    }
}
