import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {33, 90, 68, 46, 75, 12, 6, 32};

        boolean isSorted = false;
        int temp = 0;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }

        }
        Arrays.stream(array).forEach(i -> System.out.print(i + ", "));

    }
}
