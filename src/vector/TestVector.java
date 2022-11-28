package vector;

import java.util.Arrays;

public class TestVector {
    public static void main(String[] args) {
        MyVector[] vectors = MyVector.randomVectorArray(3);
        System.out.println(Arrays.toString(vectors));

        MyVector vector = new MyVector(1, 2, 3);
        MyVector vector1 = new MyVector(3, 4, 5);
        System.out.println("Длина вектора 1 " + vector.vectorLength());
        System.out.println("Скаляр " + MyVector.scalar(vector1, vector));
        System.out.println("Косинус между векторами " + MyVector.cos(vector1, vector));
        System.out.println("Сумма векторов " + MyVector.sum(vector1, vector));
        System.out.println("Разность векторов " + MyVector.diff(vector1, vector));
    }
}
