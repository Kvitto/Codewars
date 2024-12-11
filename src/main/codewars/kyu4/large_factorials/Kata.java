package codewars.kyu4.large_factorials;

import java.math.BigInteger;

public class Kata {
    public static String Factorial(int i) {
        return String.valueOf(calcFac(BigInteger.valueOf(i)));
    }

    private static BigInteger calcFac(BigInteger i) {
        if (i.equals(BigInteger.ONE)) return BigInteger.ONE;
        return i.multiply(calcFac(i.subtract(BigInteger.ONE)));
    }

}
