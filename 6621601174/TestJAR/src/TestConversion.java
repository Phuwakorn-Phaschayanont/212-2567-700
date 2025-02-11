import it.utils.converter.TemperatureConversion;

public class TestConversion {
    public static void main(String[] args) {
        System.out.println();
        TemperatureConversion temp = new TemperatureConversion();
        System.out.println("C->F : " + temp.celsiusToFahrenheit(32));
        System.out.println("F->C : " + temp.fahrenheitToCelsius(22));
        System.out.println("C->K : " + temp.celsiusToKelvin(32));
        System.out.println("K->C : " + temp.kelvinToCelsius(27));
        System.out.println("F->K : " + temp.fahrenheitToKelvin(22));
        System.out.println("K->F : " + temp.kelvinToFahrenheit(0));
    }
}
