package Geometry;

public class Main {
    public static void main(String[] args) {
        // Circle:
        System.out.println("Círculo:");

        Circle myCircle = new Circle();
        myCircle.setRadious(3);
        myCircle.getCircleInfos();

        // Triangle:
        System.out.println("Triângulo:");
            // Valid triangle:
            Triangle myValidTriangle = new Triangle();
            myValidTriangle.getSides(3, 4, 5);
            myValidTriangle.getTriangleInfos();

            // Invalid triangle:
            Triangle myInvalidTriangle = new Triangle();
            myValidTriangle.getSides(1, 4, 2);
            myValidTriangle.getTriangleInfos();


        // Square:
        System.out.println("Quadrado:");

        Square mySquare = new Square();
        mySquare.setSide(3);
        mySquare.getSquareInfos();

        //Rectangle:
        System.out.println("Retangulo:");

        Rectangle myRectangle = new Rectangle();
        myRectangle.setSides(3, 4);
        myRectangle.getRectangleInfos();
    }
}
