package codewars.kyu6.find_outlier;

public class FindOutlier {
    static int find(int[] integers) {
        int odd = -1;
        for(int i = 0; i < 3; i++) {
            if(Math.abs(integers[i]) % 2 == 1) {odd++;}
        }
        odd = odd > 0 ? 1 : 0;
        for (int integer : integers) {
            if (Math.abs(integer) % 2 != odd) {
                return integer;
            }
        }
        return 0;
    }
}
