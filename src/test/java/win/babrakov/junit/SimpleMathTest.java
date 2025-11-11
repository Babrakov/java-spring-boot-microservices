package win.babrakov.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleMathTest {

    private final SimpleMath simpleMath = new SimpleMath();

    @Test
    void testCalculateSumThreeMembersArray() {
        int result = simpleMath.calculateSum(new int[]{1, 2, 3});

        assertEquals(6, result);
    }

    @Test
    void testCalculateSumForEmptyArray() {
        int result = simpleMath.calculateSum(new int[] {});

        assertEquals(0, result);
    }

}