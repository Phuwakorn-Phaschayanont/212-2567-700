package it.util.shapes;

public class RectangularPrism implements GeometricShapes {
    private double width;
    private double height;
    private double length;

    public RectangularPrism(double w, double h, double l) {
        this.width = w;
        this.height = h;
        this.length = l;
    }
    @Override
    public double getVolume() {
        double v = length * width * height;
        return v;
    }
    @Override
    public double getTotalSurfaceArea() {
        double ts = 2 * ((length * width) + (length * height) + (width * height));
        return ts;
    }
    public double getDiagonal() {
        double d = Math.sqrt((length * length) + (width * width) + (height * height));
        return d;
    }
    public double getWidth() {
        return this.width;
    }
    public double getHeight() {
        return this.height;
    }
    public double getLength() {
        return this.length;
    }

//    public static void main(String[] args) {
//        RectangularPrism rp = new RectangularPrism(4, 5, 2);
//        System.out.println("Diagonal = " + rp.getDiagonal());
//        System.out.println("Volume = " + rp.getVolume());
//        System.out.println("Total = " + rp.getTotalSurfaceArea());
//    }
}
