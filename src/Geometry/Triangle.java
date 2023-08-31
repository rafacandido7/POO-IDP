package Geometry;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public void getSides(double a, double b, double c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    private boolean verifyTriangle() {
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

    private double getPerimetrer() {
        return this.sideA + this.sideB + this.sideC;
    }

    // Herão's Formula
    private double getSurfaceArea() {
        double semiPerimetrer = this.getPerimetrer()/2;
        return this.verifyTriangle() ? Math.sqrt(semiPerimetrer*(semiPerimetrer - this.sideA)*(semiPerimetrer - this.sideB)*(semiPerimetrer - this.sideC)) : 0;
    }

    public void getTriangleInfos() {
        if (this.verifyTriangle()) {
            System.out.println("----------------------------------");

            String triangle = "Triângulo com os lados %f %f %f".formatted(this.sideA, this.sideB, this.sideC);
            System.out.println(triangle);

            String showPerimetrer = "Perimetro do triângulo: %f".formatted(this.getPerimetrer());
            System.out.println(showPerimetrer);

            String showSurfaceArea = "Área do triângulo: %f".formatted(this.getSurfaceArea());
            System.out.println(showSurfaceArea);

            System.out.println("----------------------------------");
        }
    }
}
