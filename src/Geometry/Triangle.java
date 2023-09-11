package Geometry;

import java.util.Scanner;

public class Triangle {
    private final Scanner scanner = new Scanner(System.in);
    private double sideA;
    private double sideB;
    private double sideC;
    private final double perimetrer;
    private final double surfaceArea;


    public Triangle() {
        this.sideA = this.getSideA();
        this.sideB = this.getSideB();
        this.sideC = this.getSideC();
        this.perimetrer = this.setPerimetrer();
        this.surfaceArea = this.setSurfaceArea();
    }

    private double getSideA() {
        System.out.println("Digite o primeiro lado do base triangulo:");
        return scanner.nextDouble();
    }

    private double getSideB() {
        System.out.println("Digite o segundo lado do base triangulo:");
        return scanner.nextDouble();
    }

    private double getSideC() {
        System.out.println("Digite o terceiro lado do base triangulo:");
        return scanner.nextDouble();
    }

    public boolean verifyTriangle() {
        boolean firstRequirement = this.sideA + this.sideB > this.sideC;
        boolean secondRequirement = this.sideA + this.sideC > this.sideB;
        boolean thirdRequirement = this.sideB + this.sideC > this.sideA;

        boolean isTriangle = firstRequirement && secondRequirement && thirdRequirement;

        if (!isTriangle) {
            System.out.println("----------------------------------");

            String errorMessage = "Não existe triângulo com os lados %f %f %f".formatted(this.sideA, this.sideB, this.sideC);
            System.out.println(errorMessage);

            System.out.println("----------------------------------");
        }

        return isTriangle;
    }

    private double setPerimetrer() {
        return this.sideA + this.sideB + this.sideC;
    }
    public double getPerimetrer() {
        if (this.verifyTriangle()) {
            return this.perimetrer;
        }
        return 0;
    }

    // Herão's Formula
    private double setSurfaceArea() {
        double semiPerimetrer = this.getPerimetrer()/2;
        if (this.verifyTriangle()) {
            return Math.sqrt(semiPerimetrer*(semiPerimetrer - this.sideA)*(semiPerimetrer - this.sideB)*(semiPerimetrer - this.sideC));
        }
        return 0;
    }
    public double getSurfaceArea() {
        return this.surfaceArea;
    }

}
