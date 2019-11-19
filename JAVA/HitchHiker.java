import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HitchHiker{
   public static void main(String args[]){
   
   /*Let's declare the elements of the window first, and then use handler
    methods to change what's in them later on.*/
   
   //String that is entered by the player and evaluated by a parser.
      String intake = ("");
   
   //Action window display is just a static image that changes based on game progress.
      ImageIcon picture = new ImageIcon("src/smiley.jpg");
      JLabel picDisplay = new JLabel(picture);
      picDisplay.setBounds(150, 50, 410, 310);
   
   //This text label will describe the action of the game, or any feedback to the user.
      JLabel textLabel = new JLabel("",SwingConstants.CENTER);
      textLabel.setBounds(-50, 350, 800, 200);
   
   //User input text box.
      JTextField userInput = new JTextField("Enter a response.");
      userInput.setBounds(250, 500, 200, 30);
   
   //The enter button with the listener. This is how inputs are sent to the game.
   
   
   //Send all these declared elements to a method which constructs the JFrame.
      createWindow(picDisplay, textLabel, userInput, intake);
   
   }

   private static void createWindow(JLabel picDisplay, JLabel textLabel, JTextField userInput, String intake){
   
   //create and configure the frame
      JFrame frame = new JFrame("The Hitchhiker's Guide To The Galaxy");
      frame.setSize(700, 700);
   
    //Ensuring that closing the frame... closes the frame.
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    //A little icon for Windows users.
      frame.setIconImage(new ImageIcon("src/greenguy.png").getImage());
   
      ImageIcon picture = new ImageIcon("src/smiley.jpg");
    //picDisplay.setImage(picture);
   
      textLabel.setText("<html><center>Don't Panic!<br>Welcome to the Hitchhiker's Guide  to the Galaxy  Java remake by Al Such.<br>Type \"start\" to begin, or \"help\" for more info.</html>");
   
      JButton enterButt = new JButton("Enter");
   
      enterButt.setBounds(300, 550, 100, 30);
   
   
      frame.add(picDisplay);
      frame.add(textLabel);
      frame.add(userInput);
      frame.add(enterButt);
      frame.setLayout(null);
      frame.setVisible(true);
   
      enterButt.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               String intake = userInput.getText();
               if (intake.equalsIgnoreCase("start")){
                  enterButt.removeActionListener(this);
                  startScreen(picDisplay, textLabel, userInput, enterButt);
               }
               else if (intake.equalsIgnoreCase("help")){
                  enterButt.removeActionListener(this);
                  helpPrompt(picDisplay, textLabel, userInput, enterButt);
               }
               else {
                  textLabel.setText("Don't know how to " + intake + " something.");
               }
            }
         });
   
   
   
   }

   private static void startScreen(JLabel picDisplay, JLabel textLabel, JTextField userInput, JButton enterButt){
   
      //New listener prompts
      
      enterButt.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               String intake = userInput.getText();
                  //put stuff here
                 //  else {
                  //textLabel.setText("Don't know how to " + intake + " something.");
               //}
            }
         });
   
      
      
      //New story prompt.
      textLabel.setText("<html>You wake up. The room is spinning very gently round your head. <br>Or at least it would be if you could see it which you can't.</html>");
      
   }
   
   private static void helpPrompt(JLabel picDisplay, JLabel textLabel, JTextField userInput, JButton enterButt){
   
      //New listener prompts
      
      enterButt.addActionListener(
         new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
               String intake = userInput.getText();
               if (intake.equalsIgnoreCase("start")){
                  enterButt.removeActionListener(this);
                  startScreen(picDisplay, textLabel, userInput, enterButt);
               }                 
               else {
                  textLabel.setText("Don't know how to " + intake + " something.");
               }
            }
         });
   
      
      
      //New story prompt.
      textLabel.setText("<html>THE HITCHHIKER'S GUIDE TO THE GALAXY<br>Infocom interactive fiction - a science fiction story<br>Now go ahead and type \"start\".</html>");
      
   }
}
