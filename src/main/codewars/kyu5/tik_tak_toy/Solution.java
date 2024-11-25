package codewars.kyu5.tik_tak_toy;

public class Solution {

    public static int isSolved(int[][] board) {
        int[][] x = new int[2][8];
        int r = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    r = -1;
                    continue;
                }
                int a = board[i][j] % 2;
                x[a][i]++;
                x[a][j + 3]++;
                if (i == j) x[a][6]++;
                if (i == 2 - j) x[a][7]++;
            }
        }
        for (int i = 0; i < 8; i++) {
            if (x[0][i] == 3) return 2;
            if (x[1][i] == 3) return 1;
        }
        return r;
    }
}
