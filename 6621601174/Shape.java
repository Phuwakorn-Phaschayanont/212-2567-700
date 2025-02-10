// คลาส Abstract สำหรับ Shape
public abstract class Shape {
    private String type;

    // Constructor เพื่อกำหนดประเภทของรูปทรง
    public Shape(String type) {
        this.type = type;
    }
    // เมธอด abstract สำหรับการวาดรูปทรง
    public abstract void draw();

    // เมธอด abstract สำหรับคำนวณพื้นที่
    public abstract double area();

    // เมธอด เพื่อคืนค่าประเภทรูปทรง
    public String getType() {
        return type; // คืนค่าประเภทของรูปทรง
    }
}
