// คลาสย่อยสำหรับวงกลม
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle"); // เรียกใช ้ constructor ของ Shape และกำหนดประเภทเป็น "Circle"
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }

    @Override
    public double area() {
        return Math.PI * radius * radius; // คำนวณพื้นที่วงกลม
    }

}