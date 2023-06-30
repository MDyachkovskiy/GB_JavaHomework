package gb.com.javahomework;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CheckArrayForOneAndFourTest {

    @Test
    public void testCheckArrayNormalCase() {
        assertTrue(Main.checkArrayForOneAndFour(new int[]{1, 1, 1, 4, 4, 1, 4, 4}));
    }

    @Test
    public void testCheckArrayOnlyOnes() {
        assertFalse(Main.checkArrayForOneAndFour(new int[]{1, 1, 1, 1, 1, 1}));
    }

    @Test
    public void testCheckArrayOnlyFours() {
        assertFalse(Main.checkArrayForOneAndFour(new int[]{4, 4, 4, 4}));
    }

    @Test
    public void testCheckArrayExtraNumber() {
        assertFalse(Main.checkArrayForOneAndFour(new int[]{1, 4, 4, 1, 1, 4, 3}));
    }

    @Test
    public void checkArrayEmpty() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> Main.checkArrayForOneAndFour(new int[]{}));
        assertEquals("Массив не должен быть пустым", exception.getMessage());
    }

    @Test
    public void checkArrayNull() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> Main.checkArrayForOneAndFour(null));
        assertEquals("Массив не должен быть пустым", exception.getMessage());
    }
}
