public class TestShape {
    public static void main(String[] args) {
        Shape myCircle = new Circle(5);
        myCircle.displayInfo();
        Shape myRect = new Rectangle(10, 30);
        myRect.displayInfo();
    }
}
