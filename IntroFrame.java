import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Graphics;
import java.awt.Rectangle;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class IntroFrame extends JFrame
{
  private static final int FRAME_WIDTH = 400;
  private static final int FRAME_HEIGHT = 400;
  
  private JPanel panel;
  private JLabel greetingLabel;
  private JLabel versusLabel;
  private JLabel nameLabel;
  private JButton pvpButton;
  private JButton pvcButton;
  private JTextField player1TF;
  private String player1;
  private JTextField player2TF;
  private String player2;
  
  public IntroFrame()
  {
    prepareFrame();
    initComponents();
    addComponents();
  }
  
  //Sets the necessary parameters for the frame.
  private void prepareFrame()
  {
    setSize(FRAME_WIDTH, FRAME_HEIGHT);
    setResizable(false);
    setTitle("Welcome to Othello");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  }
  
  private void initComponents()
  {
    panel = new JPanel();
    //panel.setLayout(new GridLayout(1,1));
    
    greetingLabel = new JLabel("Welcome to Othello!"); //the label that greets the user
    greetingLabel.setFont(new Font("New York Times", Font.PLAIN, 40)); //setting the font really big
    
    nameLabel = new JLabel("Names? (Leave empty for Computer)"); //user chooses the option
    nameLabel.setFont(new Font("", Font.PLAIN, 20)); //setting the font medium small
    player1TF = new JTextField("Player1"); //where player1 enters their name
    player2TF = new JTextField("Player2"); //where player2 enters their name
    
    versusLabel = new JLabel("Versus a Player or Computer?"); //user chooses the option
    versusLabel.setFont(new Font("", Font.PLAIN, 25)); //setting the font medium small
    pvpButton = new JButton("P v P"); //enables the users to play against each other
    pvcButton = new JButton("P v COM"); //enables the user to play against the computer
    panel.add(greetingLabel);
    panel.add(nameLabel);
    panel.add(player1TF);
    panel.add(player2TF);
    panel.add(versusLabel);
    panel.add(pvpButton);
    panel.add(pvcButton);
    
    pvpButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        player1 = player1TF.getText();
        player2 = player2TF.getText();
        removeAll();
        setVisible(false);
        GameFrame game = new GameFrame(player1, player2);
        game.setVisible(true);
      }
    });
  }
  
  private void addComponents()
  {
    add(panel, BorderLayout.CENTER);
  }
}