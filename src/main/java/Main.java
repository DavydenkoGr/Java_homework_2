public class Main {
    public static void main(String[] args){
        Vector vector_1 = new Vector(1, 2, 3);
        Vector vector_2 = new Vector(3, 2, 1);
        Vector vector_sum = vector_1.sum(vector_2);
        Vector vector_diff = vector_1.diff(vector_2);
        Vector vector_comp = vector_1.vectorComp(vector_2);
        System.out.println("Координаты вектора 1: " + vector_1.x + " " + vector_1.y + " " + vector_1.z);
        System.out.println("Координаты вектора 2: " + vector_2.x + " " + vector_2.y + " " + vector_2.z);
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
