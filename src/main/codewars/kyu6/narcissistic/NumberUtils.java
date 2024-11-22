package codewars.kyu6.narcissistic;

import java.util.Arrays;

public class NumberUtils {
    public static boolean isNarcissistic(int number) {
        int length = String.valueOf(number).length();
        return number == Arrays.stream(String.valueOf(number).split(""))
                .mapToInt(Integer::parseInt)
                .mapToDouble(m -> Math.pow(m, length))
                .sum();
    }
}
