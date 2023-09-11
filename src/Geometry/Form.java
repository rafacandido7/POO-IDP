package Geometry;

import java.util.Scanner;

public class Form {
    private final Scanner scanner = new Scanner(System.in);
    private void printLine () {
        System.out.println("----------------------------------\n");
    }
    public int getFunction() {
        System.out.println("Selecione a figura:");
        System.out.println("Área ----------- (1)");
        System.out.println("Perímetro ------ (2)");
        return scanner.nextInt();
    }

    public void getForm() {
        System.out.println("--------------- Geometria ---------------");
        System.out.println("Selecione a figura:");
        System.out.println("Circulo ------ (1)");
        System.out.println("Retângulo ---- (2)");
        System.out.println("Quadrado ----- (3)");
        System.out.println("Triângulo ---- (4)");
        System.out.println("Sair --------- (0)");
        int figureOption = scanner.nextInt();
        this.printLine();

        switch (figureOption) {
            case 0 -> {
                this.printLine();
                System.out.println("Encerrando o programa.....");
                this.printLine();
                System.exit(0);
            }
            case 1 -> {
                this.printLine();
                Circle myCircle = new Circle();
                int function = this.getFunction();
                switch (function) {
                    case 1 -> {
                        double circumference = myCircle.getCircumference();
                        System.out.println("Circunferência do círculo: " + circumference + " u.m");
                    }
                    case 2 -> {
                        double surfaceArea = myCircle.getSurfaceArea();
                        System.out.println("Área do círculo: " + surfaceArea + " u.a");
                    }
                }
                this.printLine();
            }
            case 2 -> {
                this.printLine();
                Rectangle myRectangle = new Rectangle();
                int function = this.getFunction();
                switch (function) {
                    case 1 -> {
                        double perimetrer = myRectangle.getPerimetrer();
                        System.out.println("Perímetro do retangulo: " + perimetrer + " u.m");
                    }
                    case 2 -> {
                        double surfaceArea = myRectangle.getSurfaceArea();
                        System.out.println("Área do retangulo: " + surfaceArea + " u.a");
                    }
                }
                this.printLine();
            }
            case 3 -> {
                this.printLine();
                Square mySquare = new Square();
                int function = this.getFunction();
                switch (function) {
                    case 1 -> {
                        double perimetrer = mySquare.getPerimetrer();
                        System.out.println("Perímetro do quadrado: " + perimetrer + " u.m");
                    }
                    case 2 -> {
                        double surfaceArea = mySquare.getSurfaceArea();
                        System.out.println("Área do quadrado: " + surfaceArea + " u.a");
                    }
                }
                this.printLine();
            }
            case 4 -> {
                this.printLine();
                Triangle myTriangle = new Triangle();
                if (myTriangle.verifyTriangle()) {
                    int function = this.getFunction();
                    switch (function) {
                        case 1 -> {
                            double perimetrer = myTriangle.getPerimetrer();
                            System.out.println("Perímetro do triangulo: " + perimetrer + " u.m");
                        }
                        case 2 -> {
                            double surfaceArea = myTriangle.getSurfaceArea();
                            System.out.println("Área do triangulo: " + surfaceArea + " u.a");
                        }
                    }
                    this.printLine();
                }
            }
        }
    }
}
