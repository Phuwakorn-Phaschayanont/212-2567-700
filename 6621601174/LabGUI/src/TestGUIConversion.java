import javax.swing.*;

public class TestGUIConversion {
    public static void main(String[] args) {
        JFrame frame = new JFrame("First GUI Application");
        frame.setContentPane(new ConversionForm().getMainApp());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
