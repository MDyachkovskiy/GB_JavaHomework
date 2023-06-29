package gb.com.javahomework;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class AfterFourMethodTest {

    @Test
    public void testAfterFourNormalCaseOne() {
        assertArrayEquals(new int[]{1, 7},
                Main.afterFourArray(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}));
    }

    @Test
    public void testAfterFourNormalCaseTwo() {
        assertArrayEquals(new int[]{7, 7},
                Main.afterFourArray(new int[]{1, 4, 2, 3, 4, 7, 7}));
    }

    @Test
    public void testAfterFourArrayFourAtEnd() {
        assertArrayEquals(new int[]{},
                Main.afterFourArray(new int[]{4, 1, 2, 3, 4}));
    }

    @Test
    public void testAfterFourArrayNoFour() {
        Exception exception = assertThrows(RuntimeException.class,
                () -> Main.afterFourArray(new int[]{1, 2, 3, 5, 6, 7}));
        assertEquals("Массив обязательно должен содержать цифру 4", exception.getMessage());
    }

    @Test
    public void testAfterFourArrayEmpty() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> Main.afterFourArray(new int[]{}));
        assertEquals("Массив не должен быть пустым", exception.getMessage());
    }

    @Test
    public void testAfterFourArrayNull() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> Main.afterFourArray(null));
        assertEquals("Массив не должен быть пустым", exception.getMessage());
    }
}
