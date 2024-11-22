package codewars.kyu6.narcissistic;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class NumberUtilsTest {

    @Test
    void exampleTests() {
        assertTrue(NumberUtils.isNarcissistic(153), "153 is narcissistic");
        assertTrue(NumberUtils.isNarcissistic(1634), "1634 is narcissistic");
        assertFalse(NumberUtils.isNarcissistic(112), "112 is not narcissistic");
    }

}