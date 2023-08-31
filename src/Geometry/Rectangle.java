package Geometry;

public class Rectangle {
    private double width;
    private double height;

    public void setSides(double width, double height) {
        this.width = width;
        this.height = height;
    }
    private double getPerimetrer() {
        return 2*(this.width + this.height);
    }

    private double getSurfaceArea() {
        return this.height * this.width;
    }

    public void getRectangleInfos() {
        System.out.println("----------------------------------");

        String showSide = "Lados do retangulo: %f %f".formatted(this.width, this.height);
        System.out.println(showSide);

        String perimetrer = "Perímetro do retangulo: %f".formatted(this.getPerimetrer());
        System.out.println(perimetrer);

        String surfaceArea = "Área do retangulo: %f".formatted(this.getSurfaceArea());
        System.out.println(surfaceArea);

        System.out.println("----------------------------------");
    }
}
