package b1;

public class Circle {
    private double radius;
    private String color;

    // Constructor không tham số
    public Circle() {
        this.radius = 0.0;
        this.color = "unknown";
    }

    // Constructor có tham số
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter cho bán kính
    public double getRadius() {
        return radius;
    }

    // Setter cho bán kính
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter cho màu sắc
    public String getColor() {
        return color;
    }

    // Setter cho màu sắc
    public void setColor(String color) {
        this.color = color;
    }

    // Phương thức tính chu vi
    public double chuVi() {
        return 2 * Math.PI * radius;
    }

    // Phương thức tính diện tích
    public double dienTich() {
        return Math.PI * radius * radius;
    }

    // Phương thức cho phép người dùng nhập thông tin
    public void inputData(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Phương thức hiển thị thông tin
    public void displayData() {
        System.out.println("Bán kính: " + radius);
        System.out.println("Màu sắc: " + color);
        System.out.println("Chu vi: " + chuVi());
        System.out.println("Diện tích: " + dienTich());
    }
}
