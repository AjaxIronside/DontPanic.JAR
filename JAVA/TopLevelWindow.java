import java.awt.*;
import javax.swing.*;
// Create a simple GUI window
public class TopLevelWindow {
   private static void createWindow() {
      //Create and set up the window.
      JFrame frame = new JFrame("The Hitchhiker's Guide To The Galaxy");
      frame.setSize(700, 700);
      
      //Ensuring that closing the frame... closes the frame.
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //A little icon for Windows users. 
      frame.setIconImage(new ImageIcon("src/greenguy.png").getImage());
      
      //Display an image to describe the action happening.
      ImageIcon picture = new ImageIcon("src/smiley.jpg");
      JLabel picDisplay = new JLabel(picture);
      picDisplay.setBounds(150, 100, 410, 310);
      
      //Text area. In future can maybe be used to describe what happens?
      JLabel textLabel = new JLabel("Don't Panic!",SwingConstants.CENTER);
      textLabel.setBounds(250, 450, 200, 30);
      
      //User input area, where user will type responses.
      JTextField userInput = new JTextField("Enter a response");
      userInput.setBounds(250, 500, 200, 30);
      
      //Button, to submit commands.
      JButton enterButt = new JButton("Enter");
      enterButt.setBounds(300, 550, 100, 30);
      
      frame.add(picDisplay);
      frame.add(textLabel);
      frame.add(userInput);
      frame.add(enterButt);
      frame.setLayout(null);
      frame.setVisible(true);
      
   }
   public static void main(String[] args) {
      createWindow();
   }
}