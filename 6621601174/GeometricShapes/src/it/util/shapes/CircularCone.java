package it.util.shapes;

public class CircularCone implements GeometricShapes {
    private double radius;
    private double height;

    public CircularCone(double r, double h) {
        this.radius = r;
        this.height = h;
    }
    @Override
    public double getVolume() {
        double v = ((double) 1/3) * Math.PI * radius * radius * height;
        return v;
    }
    @Override
    public double getTotalSurfaceArea() {
        double t = getLateralSurfaceArea() + getBaseSurfaceArea();
        return t;
    }
    public double getLateralSurfaceArea() {
        double l = Math.PI * radius * Math.sqrt((radius * radius) + (height * height));
        return l;
    }
    public double getBaseSurfaceArea() {
        double b = Math.PI * radius * radius;
        return b;
    }
    public double getSlantHeight() {
        double s = Math.sqrt((radius * radius) + (height * height));
        return s;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getHeight() {
        return this.height;
    }

//    public static void main(String[] args) {
//        CircularCone cc = new CircularCone(4, 2);
//        System.out.println("Slant = " + cc.getSlantHeight());
//        System.out.println("Volume = " + cc.getVolume());
//        System.out.println("Lateral = " + cc.getLateralSurfaceArea());
//        System.out.println("Base = " + cc.getBaseSurfaceArea());
//        System.out.println("Total = " + cc.getTotalSurfaceArea());
//    }
}