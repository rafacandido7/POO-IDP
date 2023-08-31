package Geometry;

public class Circle {
    private double radious;

    public void setRadious(double radious) {
        this.radious = radious;
    }
    private double getCircumference() {
        return 2*Math.PI*this.radious;
    }

    private double getSurfaceArea() {
        return Math.PI*Math.pow(this.radious, 2);
    }

    public void getCircleInfos() {
        System.out.println("----------------------------------");

        String showRadious = "Raio do círculo: %f".formatted(this.radious);
        System.out.println(showRadious);

        String circumference = "Circunferência do círculo: %f".formatted(this.getCircumference());
        System.out.println(circumference);

        String surfaceArea = "Área do círculo: %f".formatted(this.getSurfaceArea());
        System.out.println(surfaceArea);

        System.out.println("----------------------------------");
    }
}
