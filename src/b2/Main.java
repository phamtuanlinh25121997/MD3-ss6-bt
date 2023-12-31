package b2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập giá trị cho a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập giá trị cho b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập giá trị cho c: ");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double discriminant = equation.getDiscriminant();

        if (discriminant > 0) {
            double root1 = equation.getRoot1();
            double root2 = equation.getRoot2();
            System.out.println("Nghiệm 1: " + root1);
            System.out.println("Nghiệm 2: " + root2);
        } else if (discriminant == 0) {
            double root = equation.getRoot1(); // Hoặc getRoot2() vì 2 nghiệm bằng nhau
            System.out.println("Nghiệm duy nhất: " + root);
        } else {
            System.out.println("Phương trình không có nghiệm thực.");
        }

        scanner.close();
    }
}
