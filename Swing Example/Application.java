import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Application {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Swing Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JButton button = new JButton("Click Me");
            frame.getContentPane().add(button);

            frame.setSize(1080, 720);
            frame.setVisible(true);
        });
    }
}