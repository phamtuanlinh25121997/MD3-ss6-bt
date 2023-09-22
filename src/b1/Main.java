package b1;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo các đối tượng Circle
        Circle circle1 = new Circle(5.0, "Red");
        Circle circle2 = new Circle(3.5, "Blue");

        // Hiển thị thông tin của các hình tròn
        System.out.println("Hình tròn 1:");
        circle1.displayData();

        System.out.println("\nHình tròn 2:");
        circle2.displayData();
    }
}
