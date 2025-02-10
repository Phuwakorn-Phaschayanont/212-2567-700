public class MyCalculator implements ZCalculator {
    @Override
    public double add2Number(double a, double b) {
        return a + b;
    }
    @Override
    public double sub2Number(double a, double b) {
        return a - b;
    }
    @Override
    public double multiply2Number(double a, double b) {
        return a * b;
    }
    @Override
    public double divide2Number(double a, double b) {
        return a / b;
    }
    @Override
    public double power(double base, int powerNo) {
        return Math.pow(base, powerNo);
    }
    public static void main(String[] args) {
        MyCalculator mycal = new MyCalculator();
        System.out.println("10-20 = " + mycal.sub2Number(10, 20));
        System.out.println();
    }
    // เพิ่มเติม methods ได้อีกเท่าที่ต้องการ

}
