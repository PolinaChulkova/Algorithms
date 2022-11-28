package vector;
//Создайте класс, который описывает вектор (в трёхмерном пространстве). У него должны быть:
//
//конструктор с параметрами в виде списка координат x, y, z,
//метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt(),
//метод, вычисляющий скалярное произведение,
//метод, вычисляющий векторное произведение с другим вектором,
//метод, вычисляющий угол между векторами (или косинус угла),
//методы для суммы и разности,
//статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.

// Если метод возвращает вектор, то он должен возвращать новый объект, а не менять базовый.
// То есть, нужно реализовать шаблон "Неизменяемый объект"

public final class MyVector {
    private double x;
    private double y;
    private double z;

    public MyVector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double vectorLength() {
        double x2 = Math.pow(this.x, 2);
        double y2 = Math.pow(this.y, 2);
        double z2 = Math.pow(this.z, 2);
        return Math.sqrt(x2 + y2 + z2);
    }

    public static double scalar(MyVector v1, MyVector v2) {
        return v1.getX() * v2.getX() + v1.getY() * v2.getY() + v1.getZ() * v2.getZ();
    }

    public static double cos(MyVector v1, MyVector v2) {
        return scalar(v1, v2)/
                Math.abs(v1.vectorLength()) * Math.abs(v2.vectorLength());
    }

    public static MyVector sum(MyVector v1, MyVector v2) {
        return new MyVector(v1.getX() + v2.getX(),
                v1.getY() + v2.getY(),
                v1.getZ() + v2.getZ());
    }

    public static MyVector diff(MyVector v1, MyVector v2) {
        return new MyVector(v1.getX() - v2.getX(),
                v1.getY() - v2.getY(),
                v1.getZ() - v2.getZ());
    }

    public static MyVector[] randomVectorArray(int numberOfVectors) {
        MyVector[] vectors = new MyVector[numberOfVectors];
        for (int i = 0; i < vectors.length; i++) {
            MyVector vector = new MyVector(Math.random() * 10,
                    Math.random() * 10,
                    Math.random() * 10);
            vectors[i] = vector;
        }

        return vectors;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
