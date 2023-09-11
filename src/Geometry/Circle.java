package Geometry;

import java.util.Scanner;

public class Circle {
    private final Scanner scanner = new Scanner(System.in);
    private final double radious;
    private final double circumference;
    private final double surfaceArea;

    public Circle() {
        this.radious = setRadious();
        this.circumference = setCircumference();
        this.surfaceArea = setSurfaceArea();
    }

    private double setRadious() {
        System.out.println("Digite o tamanho do raio:");
        return scanner.nextDouble();
    }
    private double setCircumference() {
        return 2*Math.PI*this.radious;
    }
    public double getCircumference() {
        return this.circumference;
    }
    private double setSurfaceArea() {
        return Math.PI*Math.pow(this.radious, 2);
    }
    public double getSurfaceArea() {
        return this.surfaceArea;
    }

}
