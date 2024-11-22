package codewars.kyu6.persistence;

class Persist {
    public static int persistence(long n) {
        int count = 0;
        while (String.valueOf(n).length() > 1) {
            n = Long.toString(n).chars().reduce(1, (a,b) -> a * (b - '0'));
            count++;
        }
        return count;
    }
}
