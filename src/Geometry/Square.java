package Geometry;

import java.util.Scanner;

public class Square {
    private final Scanner scanner = new Scanner(System.in);
    private final double side;
    private final double perimetrer;
    private final double surfaceArea;

    public Square() {
        this.side = this.setSide();
        this.perimetrer = setPerimetrer();
        this.surfaceArea = setSurfaceArea();
    }

    private double setSide() {
        System.out.println("Digite o tamanho do lado do quadrado:");
        return scanner.nextDouble();
    }
    private double setPerimetrer() {
        return 4*this.side;
    }
    public double getPerimetrer() {
        return this.perimetrer;
    }

    private double setSurfaceArea() {
        return Math.pow(this.side, 2);
    }

    public double getSurfaceArea() {
        return this.surfaceArea;
    }

}
