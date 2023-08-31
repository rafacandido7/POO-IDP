package Geometry;

public class Square {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }
    private double getPerimetrer() {
        return 4*this.side;
    }

    private double getSurfaceArea() {
        return Math.pow(this.side, 2);
    }

    public void getSquareInfos() {
        System.out.println("----------------------------------");

        String showSide = "Lado do quadrado: %f".formatted(this.side);
        System.out.println(showSide);

        String perimetrer = "Perímetro do quadrado: %f".formatted(this.getPerimetrer());
        System.out.println(perimetrer);

        String surfaceArea = "Área do quadrado: %f".formatted(this.getSurfaceArea());
        System.out.println(surfaceArea);

        System.out.println("----------------------------------");
    }
}
