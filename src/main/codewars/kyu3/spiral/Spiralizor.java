package codewars.kyu3.spiral;

import java.util.Arrays;

public class Spiralizor {
    static int[][] qube;

    public static int[][] spiralize(int size) {
        fillZero(size);
        turnTheSpiral(0, size - 1);
        return qube;
    }

    private static void turnTheSpiral(int a, int b) {
        for (int i = a; i <= b; i++) {
            qube[a][i] = 1;
            qube[i][b] = 1;
            qube[b][a + b - i] = 1;
            qube[a + b - i][a] = 1;
        }
        a += 2;
        b -= 2;
        qube[a - 1][a - 2] = 0;
        if (b < a) return;
        qube[a][a - 1] = 1;
        turnTheSpiral(a, b);
    }

    public static void fillZero(int size) {
        qube = new int[size][size];
        for (int[] x : qube){
            Arrays.fill(x, 0);
        }
    }

}
