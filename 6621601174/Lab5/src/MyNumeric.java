import java.util.Arrays;

public class MyNumeric {
    public static void main(String[] args) {

        double[] myNumber = {19.0, 12.0, 14.0, 15.0, 11.0, 21.5, 18.5, 22.5, 25.0, 13.0};

        SimpleNumeric number = new SimpleNumeric();

        System.out.println("All numbers : " + Arrays.toString(myNumber));
        System.out.println("Min : " + number.getMin(myNumber));
        System.out.println("Max : " + number.getMax(myNumber));
        System.out.println("Average : " + number.getAverage(myNumber));
        System.out.print("Summary : " + number.getSummary(myNumber));
    }
}
