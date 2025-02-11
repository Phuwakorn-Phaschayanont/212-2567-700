package it.utils.converter;

public class TemperatureConversion implements TemperatureConverter {

    @Override
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    @Override
    public double celsiusToKelvin(double celsius) {
        return (celsius + 273.15);
    }

    @Override
    public double fahrenheitToCelsius(double fahrenheit) {
        return ((fahrenheit - 32) * 5)/9;
    }

    @Override
    public double fahrenheitToKelvin(double fahrenheit) {
        return ((fahrenheit - 32)/ 1.8) + 273.15;
    }

    @Override
    public double kelvinToCelsius(double kelvin) {
        return (kelvin - 273.15);
    }

    @Override
    public double kelvinToFahrenheit(double kelvin) {
        return ((kelvin - 273.15)* 1.8) + 32;
    }
}
