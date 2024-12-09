package codewars;

public class FreeEx01 {
    public static void main(String[] args) {
        //int[] arr = new int[]{2, 3, 6, 4};
        //int[] arr = new int[]{7, 3, 2, 1};
        int[] arr = new int[]{2, 3, 6, 9};
        boolean result = true;
        int flag = 0;
        int prev = arr[0];
        for (int j : arr) {
            if (j == prev) continue;
            int curFlag = prev - j;
            if (flag == 0) {
                flag = curFlag;
                prev = j;
            } else if ((flag < 0 && curFlag < 0) || (flag > 0 && curFlag > 0)) {
                prev = j;
            } else {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
