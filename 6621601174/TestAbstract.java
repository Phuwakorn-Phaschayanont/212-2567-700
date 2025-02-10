public class TestAbstract {

    public static void main(String[] args) {

        Shape circle = new Circle(5); // สร้างออบเจ็ก Circle
        Shape rectangle = new Rectangle(4, 6); // สร้างออบเจ็ก Rectangle

        circle.draw(); // เรียกใช ้เมธอด draw() ของ Circle
        System.out.println("Area of Circle: " + circle.area()); // แสดงพื้นที่วงกลม
        System.out.println("Type of shape: " + circle.getType()); // แสดงประเภทของรูปทรง

        rectangle.draw(); // เรียกใช้เมธอด draw() ของ Rectangle
        System.out.println("Area of Rectangle: " + rectangle.area()); // แสดงพื้นที่สี่เหลี่ยม
        System.out.println("Type of shape: " + rectangle.getType()); // แสดงประเภทของรูปทรง
    }
}