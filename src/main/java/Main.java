import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите координаты вектора 1: ");
        Vector vector_1 = new Vector(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        System.out.print("Введите координаты вектора 2: ");
        Vector vector_2 = new Vector(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        Vector vector_sum = vector_1.sum(vector_2);
        Vector vector_diff = vector_1.diff(vector_2);
        Vector vector_comp = vector_1.vectorComp(vector_2);
        System.out.println("Вектор суммы: " + vector_sum.x + " " + vector_sum.y + " " + vector_sum.z);
        System.out.println("Вектор разности: " + vector_diff.x + " " + vector_diff.y + " " + vector_diff.z);
        System.out.println("Векторное произведение: " + vector_comp.x + " " + vector_comp.y + " " + vector_comp.z);
        System.out.println("Скалярное произведение: " + vector_1.scalarComp(vector_2));
        System.out.println("Косинус угла между векторами: " + vector_1.cos(vector_2));
        System.out.println("Длина 1 вектора: " + vector_1.length());
        System.out.println("Вектор 1 равен Вектору 2: " + vector_1.equals(vector_2));
        System.out.println("Вектор 1 равен Вектору (1, 2, 3): " + vector_1.equals(new Vector(1, 2, 3)));
    }
}
