package it.utils.shape;

import java.util.Scanner;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public void setWidth(double w) {
        this.width = w;
    }
    public void setHeight(double h) {
        this.height = h;
    }
    public double getWidth() {
        return this.width;
    }
    public double getHeight() {
        return this.height;
    }

    @Override
    public void inputParameters() {
        System.out.println();
        System.out.print("input width : ");
        this.width = new Scanner(System.in).nextDouble();
        System.out.print("input height : ");
        this.height = new Scanner(System.in).nextDouble();
    }

    @Override
    public double getArea() {
        return this.width*this.height;
    }
}
