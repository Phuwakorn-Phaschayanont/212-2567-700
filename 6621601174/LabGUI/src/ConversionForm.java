import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import it.utils.converter.TemperatureConversion;

public class ConversionForm {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JButton convert_c_to_f;
    private JButton convert_f_to_c;
    private JButton convert_c_to_k;
    private JButton convert_f_to_k;
    private JButton convert_k_to_c;
    private JButton convert_k_to_f;
    private JPanel TestGUIConversion;

    TemperatureConversion temp = new TemperatureConversion();

    public ConversionForm() {
        convert_c_to_f.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double result = temp.celsiusToFahrenheit(Double.parseDouble(textField1.getText()));
                    displayResult("Result of Celsius To Fahrenheit", result + "");
                } catch (NumberFormatException err) {
                    displayResult("Result of Celsius To Fahrenheit","Please input number only!!");
                }
            }
        });
        convert_f_to_c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double result = temp.fahrenheitToCelsius(Double.parseDouble(textField2.getText()));
                    displayResult("Result of Fahrenheit to Celsius", result + "");
                } catch (NumberFormatException err) {
                    displayResult("Result of Fahrenheit to Celsius","Please input number only!!");
                }
            }
        });
        convert_c_to_k.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double result = temp.celsiusToKelvin(Double.parseDouble(textField3.getText()));
                    displayResult("Result of Celsius To Kelvin", result + "");
                } catch (NumberFormatException err) {
                    displayResult("Result of Celsius To Kelvin","Please input number only!!");
                }
            }
        });
        convert_f_to_k.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double result = temp.fahrenheitToKelvin(Double.parseDouble(textField4.getText()));
                    displayResult("Result of Fahrenheit to Kelvin", result + "");
                } catch (NumberFormatException err) {
                    displayResult("Result of Fahrenheit to Kelvin","Please input number only!!");
                }
            }
        });
        convert_k_to_c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                double result = temp.kelvinToCelsius(Double.parseDouble(textField5.getText()));
                displayResult("Result of Kelvin to Celsius", result + "");
                } catch (NumberFormatException err) {
                    displayResult("Result of Kelvin to Celsius","Please input number only!!");
                }
            }
        });
        convert_k_to_f.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double result = temp.kelvinToFahrenheit(Double.parseDouble(textField6.getText()));
                    displayResult("Result of Kelvin to Fahrenheit", result + "");
                } catch (NumberFormatException err) {
                    displayResult("Result of Kelvin to Fahrenheit","Please input number only!!");
                }
            }
        });
    }
    private void displayResult(String title, String msg) {
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
    }
    public JPanel getMainApp() {
        return this.TestGUIConversion;
    }
}
