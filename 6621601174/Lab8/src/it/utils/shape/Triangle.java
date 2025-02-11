package it.utils.shape;

import java.util.Scanner;

public class Triangle implements Shape {
    private double base;
    private double height;

    @Override
    public void inputParameters() {
        System.out.println();
        System.out.print("input base : ");
        this.base = new Scanner(System.in).nextDouble();
        System.out.print("input height : ");
        this.height = new Scanner(System.in).nextDouble();
    }

    @Override
    public double getArea() {
        return 0.5*base*height;
    }
    public double getBase() {
        return this.base;
    }
    public double getHeight() {
        return this.height;
    }
    public void setBase(double b) {
        this.base = b;
    }
    public void setHeight(double h) {
        this.height = h;
    }
}
