import java.util.Random;
import java.util.Scanner;

class Rectangle {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double Perimeter() {
        return 2 * (sideA + sideB);
    }

    public double Area() {
        return sideA * sideB;
    }

    public double Diagonal() {
        return Math.sqrt(sideA * sideA + sideB * sideB);
    }

    public void Info() {
        System.out.printf("Side a is " + sideA + " cm, side b is " + sideB +" cm, perimeter is " + Perimeter() + " cm, area is " + Area() + " and diagonal is " + Diagonal() + " cm.");

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input side a: ");
        double x1 = scanner.nextDouble();
        Random random = new Random();
        double x2 = 1 + (random.nextDouble() * 10);

        Rectangle data = new Rectangle(x1, x2);
        data.Info();
    }
}
