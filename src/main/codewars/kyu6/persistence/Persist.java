package codewars.kyu6.persistence;

import java.util.Arrays;

class Persist {
    public static int persistence(long n) {
        int count = 0;
        while (String.valueOf(n).length() > 1) {
            n = Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).reduce(1, (a,b) -> a*b);
            count++;
        }
        return count;
    }
}
