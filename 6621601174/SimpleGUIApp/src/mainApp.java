import javax.swing.*;

public class mainApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("First GUI Application");
        frame.setContentPane(new FirstDemo().getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
