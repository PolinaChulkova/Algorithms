public class DeleteNumber {
//    Дан массив целых чисел и ещё одно целое число.
//    Удалите все вхождения этого числа из массива (пропусков быть не должно).

    public static void main(String[] args) {

        int[] array = new int[] {1, 3, 4, 5, 6, 7, 5, 10, 5};
//        int random = (int)(Math.random() * 10);
        int random = 5;

        System.out.println("ЧИСЛО ДЛЯ УДАЛЕНИЯ: " + random);
        System.out.println("------------------------------------------------------------");
        System.out.println("МАССИВ ЧИСЕЛ:");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int offset = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == random)
                offset++;
            else
                array[i - offset] = array[i];
        }

        int[] newArr = new int[array.length - offset];
        for (int i = 0; i < array.length - offset; i++) {
            newArr[i] = array[i];
        }

        System.out.println("------------------------------------------------------------");
        System.out.println("МАССИВ ПОСЛЕ УДАЛЕНИЯ: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
