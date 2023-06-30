package gb.com.javahomework;

import java.util.Arrays;

public class Main {

    public static final String EMPTY_TEXT_ERROR = "Массив не должен быть пустым";

    public static int[] afterFourArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException(EMPTY_TEXT_ERROR);

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

    public static boolean checkArrayForOneAndFour(int[] arr){
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException(EMPTY_TEXT_ERROR);
        }

        boolean hasOne = false;
        boolean hasFour = false;

        for (int i : arr) {
            if (i == 1) {
                hasOne = true;
            } else if (i == 4) {
                hasFour = true;
            } else {
                return false;
            }
        }
        return hasOne && hasFour;
    }
}
