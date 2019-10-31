import java.awt.*;
import javax.swing.*;
// Create a simple GUI window
public class TopLevelWindow {
   private static void createWindow() {
      //Create and set up the window.
      JFrame frame = new JFrame("The Hitchhiker's Guide To The Galaxy");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JLabel textLabel = new JLabel("Don't Panic!",SwingConstants.CENTER);
      textLabel.setPreferredSize(new Dimension(300, 100));
      frame.getContentPane().add(textLabel, BorderLayout.CENTER);
      //Display the window.
      frame.setLocationRelativeTo(null);
      frame.pack();
      frame.setVisible(true);
   }
   public static void main(String[] args) {
      createWindow();
   }
}