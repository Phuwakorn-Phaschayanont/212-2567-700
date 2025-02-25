package it.util.shapes;

public class CircularCylinder implements GeometricShapes {
    private double radius;
    private double height;

    public CircularCylinder(double r, double h) {
        this.radius = r;
        this.height = h;
    }
    @Override
    public double getVolume() {
        double v = Math.PI * radius * radius * height;
        return v;
    }
    @Override
    public double getTotalSurfaceArea() {
        double ts = getLateralSurfaceArea() + getTopSurfaceArea() + getBottomSurfaceArea();
        return ts;
    }
    public double getLateralSurfaceArea() {
        double l = 2 * Math.PI * radius * height;
        return l;
    }
    public double getTopSurfaceArea() {
        double t = Math.PI * radius * radius;
        return t;
    }
    public double getBottomSurfaceArea() {
        double b = Math.PI * radius * radius;
        return b;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getHeight() {
        return this.height;
    }

//    public static void main(String[] args) {
//        CircularCylinder cc = new CircularCylinder(4, 6);
//        System.out.println("Volume = " + cc.getVolume());
//        System.out.println("Lateral = " + cc.getLateralSurfaceArea());
//        System.out.println("Top = " + cc.getTopSurfaceArea());
//        System.out.println("Bottom = " + cc.getBottomSurfaceArea());
//        System.out.println("Total = " + cc.getTotalSurfaceArea());
//    }
}
