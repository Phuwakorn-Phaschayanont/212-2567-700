
import it.util.shapes.RectangularPrism;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RectangularPrismForm {
    private JButton calculateButton;
    private JButton closeButton;
    private JLabel RectangularPrismLabel;
    private JTextField textLength;
    private JTextField textWidth;
    private JTextField textHeight;
    private JPanel rectangularPrismPanel;

    private JDialog frame;

    public RectangularPrismForm() {
        RectangularPrismLabel.setIcon(new ImageIcon(this.getClass().getResource("/resources/rectangularprism2.png")));
        frame = new JDialog((Frame) null, "Circular Cone Shape Area", true);
        frame.setContentPane(rectangularPrismPanel);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        closeButton.addActionListener(new ActionListener() {
            @Override        public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doCalculate();
            }
        });
    }

    public void show() {
        frame.setVisible(true);
    }
    public void dispose() {
        frame.setVisible(false);
        frame.dispose();
    }
    public void doCalculate() {
        try {
            RectangularPrism rp = new RectangularPrism(Double.parseDouble(textLength.getText()), Double.parseDouble(textWidth.getText()),
                                        Double.parseDouble(textHeight.getText()));
            double volume = rp.getVolume();
            double diagonal = rp.getDiagonal();  // call calculate slant method for relative shape in JAR
            double totalSurfaceArea = rp.getTotalSurfaceArea();
            String result = "Volume = " + volume + "\n" + "Diagonal = " + diagonal + "\n" + "Total Surface Area = " + totalSurfaceArea;
            displayResult(result, "Result of Rectangular Prism Shape", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException err) {
            displayResult("Please input number only!!","Result of Rectangular Prism Shape",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void displayResult(String resultMsg, String title, int type) {
        JOptionPane.showMessageDialog(null, resultMsg, title, type);
    }
}
