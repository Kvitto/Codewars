package codewars.kyu6.find_outlier;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindOutlierTest {

    @Test
    public void find() {
        assertEquals(3, FindOutlier.find(new int[] {2, 6, 8, 10, 3, 3, 2, 6, 8, 200, 700, 1, 84, 10, 4, 1, 17, 6, 8, 10, 6, 12, 24, 36, 36}));
        assertEquals(206847684, FindOutlier.find(new int[] {206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781}));
        assertEquals(0, FindOutlier.find(new int[] {Integer.MAX_VALUE, 0, 1}));
    }
}