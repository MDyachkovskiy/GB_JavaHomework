package gb.com.javahomework;

import java.util.Arrays;

public class Main {

    public static int[] afterFourArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");

        }

        int lastFourIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                lastFourIndex = i;
            }
        }

        if (lastFourIndex == -1) {
            throw new RuntimeException("Массив обязательно должен содержать цифру 4");
        }

        return Arrays.copyOfRange(arr, lastFourIndex + 1, arr.length);
    }
}
