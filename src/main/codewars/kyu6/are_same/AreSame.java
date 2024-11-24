package codewars.kyu6.are_same;

import java.util.Arrays;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) return false;
        a = Arrays.stream(a).map(Math::abs).sorted().toArray();
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++) {
            if (a[i] != Math.sqrt(b[i])) return false;
        }
        return true;
    }
}
