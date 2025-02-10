import java.util.Arrays;

public class SimpleNumeric {
    public double getMin(double[] number) {
        Arrays.sort(number);
        double min = number[0];
        return min;
    }
    public double getMax(double[] number) {
        Arrays.sort(number);
        double max = number[9];
        return max;
    }
    public double getAverage(double[] number) {
        double avg = 0;
        double sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        avg = sum/number.length;
        return avg;
    }
    public double getSummary(double[] number) {
        double summary = 0;
        double sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        summary = sum;
        return summary;
    }
}
