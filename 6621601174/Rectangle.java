// คลาสย่อยสาหรับสี่เหลี่ยม
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        // เรียกใช้ constructor ของ Shape และกำหนดประเภทเป็น "Rectangle"
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with width: " + width + " and height: " + height);
    }

    @Override
    public double area() {
        return width * height; // คำนวณพื้นที่สี่เหลี่ยม
    }

}