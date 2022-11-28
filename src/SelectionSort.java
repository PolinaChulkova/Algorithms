import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {30, 45, 21, 44, 98, 12, 49, 12};
        for (int i = 0; i < array.length; i++) {
            array[i] = min(array, i);
        }

        System.out.println(Arrays.toString(array));
    }

    static int min(int[] array, int startIndex) {
        int min = array[startIndex];
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < min) {
                int temp = array[i];
                array[i] = min;
                min = temp;
            }
        }
        return min;
    }
}
