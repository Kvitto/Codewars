package codewars.kyu5.tik_tak_toy;

public class Solution {
    static final int FIRST_WIN_SUM = 3;
    static final int SECOND_WIN_SUM = 6;
    static boolean isFree;
    static int status;

    public static int isSolved(int[][] board) {
        isFree = false;
        status = -2;
        for (int i = 0; i < board.length; i++) {
            if (scan(getLine(board, i, i + 1, 0, board[0].length, false)) > 0) return status;
        }
        for (int i = 0; i < board.length; i++) {
            if (scan(getLine(board, 0, board.length, i, i + 1, false)) > 0) return status;
        }
        if (scan(getLine(board, 0, board.length, 0, board.length, true)) > 0) return status;
        if (scan(getLine(board, 0, board.length, board.length, 0, true)) > 0) return status;
        return isFree ? -1 : 0;
    }

    public static int scan(int[] line) {
        int sum = 0;
        for (int i : line) {
            if (i == 0) {
                isFree = true;
                return 0;
            }
            sum += i;
        }
        if (sum == FIRST_WIN_SUM) return status = 1;
        if (sum == SECOND_WIN_SUM) return status = 2;
        return 0;
    }

    public static int[] getLine(int[][] board, int xFrom, int xTo, int yFrom, int yTo, boolean diag) {
        int[] result = new int[board.length];
        int k = 0;
        for (int i = xFrom; i < xTo; i++) {
            if (!diag) {
                for (int j = yFrom; j < yTo; j++) {
                    result[k++] = board[i][j];
                }
            } else if (yTo - yFrom > 0) {
                result[k++] = board[i][i];
            } else {
                result[k++] = board[i][board.length - i - 1];
            }
        }
        return result;
    }
}
