package codewars.kyu4.large_factorials;

import java.math.BigInteger;

public class Kata {
    public static String Factorial(int n) {
        return java.util.stream.IntStream.rangeClosed(1, n)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply)
                .toString();

//        return n < 2
//                ? "1"
//                : BigInteger.valueOf(n).multiply(new BigInteger(Factorial(n-1))).toString();

    }
}
