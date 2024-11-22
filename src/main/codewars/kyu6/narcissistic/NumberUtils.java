package codewars.kyu6.narcissistic;

public class NumberUtils {
    public static boolean isNarcissistic(int number) {
        return number == narcisFac(number, String.valueOf(number).length());
    }

    private static int narcisFac(int n, int pow) {
        int k = String.valueOf(n).length() - 1;
        if (k == 0) {
            return ((int) Math.pow(n, pow));
        }
        int a = n / (int) Math.pow(10, k);
        int b = n % (int) Math.pow(10, k);
        return (int) Math.pow(a, pow) + narcisFac(b, pow);
    }
}
