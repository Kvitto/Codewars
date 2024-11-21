package codewars.kyu6.find_outlier;

public class FindOutlier {
    static int find(int[] integers) {
        int even = -1;
        for (int i = 0; i < integers.length; ){
            int a = integers[i] % 2;
            int b = integers[i + 1] % 2;
            int c = integers[i + 2] % 2;
            if (a == b && a == c) {
                if (even == -1) {even = integers[i] % 2;}
                i = i + 6 < integers.length ? i + 3 : i + 1;
            } else if (a == b) {
                if (even != -1 && integers[i + 2] % 2 == even) {
                    return integers[i];
                }
                return integers[i + 2];
            } else if (b == c) {
                if (even != -1 && integers[i] % 2 == even) {
                    return integers[i + 1];
                }
                return integers[i];
            } else {
                if (even != -1 && integers[i + 1] % 2 == even) {
                    return integers[i];
                }
                return integers[i + 1];
            }
        }
        return 0;
    }
}
