package Geometry;

import java.util.Scanner;

public class Rectangle {
    private final Scanner scanner = new Scanner(System.in);
    private final double width;
    private final double height;
    private final double perimetrer;
    private final double surfaceArea;

    public Rectangle() {
        this.width = this.setWidth();
        this.height = this.setHeight();
        this.perimetrer = setPerimetrer();
        this.surfaceArea = setSurfaceArea();
    }

    private double setWidth() {
        System.out.println("Digite o tamanho da base do retangulo:");
        return scanner.nextDouble();
    }
    private double setHeight() {
        System.out.println("Digite o tamanho da altura do retangulo:");
        return scanner.nextDouble();
    }
    private double setPerimetrer() {
        return 2*(this.width + this.height);
    }

    public double getPerimetrer() {
        return this.perimetrer;
    }

    private double setSurfaceArea() {
        return this.height * this.width;
    }

    public double getSurfaceArea() {
        return this.surfaceArea;
    }
}
