public class MinimumElementToArray {
    public static void main(String[] args) {
        int[] array = {1, 6, 78, 0, 89, 5};

        int minValue = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
                minIndex = i;
            }
        }

        System.out.println("Минимальное значение: " + minValue);
        System.out.println("Индекс этого значения: " + minIndex);
    }
}
