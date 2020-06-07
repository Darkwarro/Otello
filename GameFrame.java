import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Graphics;
import java.awt.Rectangle;

import java.awt.event.ComponentListener;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class GameFrame extends JFrame implements MouseListener
{
  private static final int FRAME_WIDTH = 800;
  private static final int FRAME_HEIGHT = 845;
  
  private GamePanel panel;
  private JPanel infoPanel;
  private JLabel turnLabel;
  private JButton menuButton;
  
  public GameFrame()
  {
    addMouseListener(this); //adds a mouse listener 
    prepareFrame();
    initComponents();
    createInfoPanel();
    addComponents();
  }
  
  //Sets the necessary parameters for the frame.
  private void prepareFrame()
  {
    setSize(FRAME_WIDTH, FRAME_HEIGHT);
    setResizable(false);
    setTitle("Othello");
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    
  }
  
  private void initComponents()
  {
    panel = new GamePanel();
    panel.addMouseListener(this);
    infoPanel = new JPanel();
  }
  
  private void addComponents()
  {
    add(panel, BorderLayout.CENTER);
    add(infoPanel, BorderLayout.SOUTH);
  }
  
  private void createInfoPanel()
  {
    infoPanel.setLayout(new GridLayout(1,1));
    turnLabel = new JLabel("Turn: White");
    turnLabel.setFont(new Font("", Font.PLAIN, 20)); //setting the font really big
    menuButton = new JButton("Menu");
    
    infoPanel.add(turnLabel);
    infoPanel.add(menuButton);
    
    repaint();
  }
  /*
   // @TODO: Keep a constant aspect ratio
   @Override
   public void componentResized(ComponentEvent arg0)
   {
   int W = 3;  
   int H = 2;  
   Rectangle b = arg0.getComponent().getBounds();
   arg0.getComponent().setBounds(b.x, b.y, b.width, b.width*H/W);
   System.out.println("resized");
   }
   
   public void componentShown(ComponentEvent evt) {System.out.println("event");}
   
   public void componentHidden(ComponentEvent evt) {System.out.println("hidden");}
   
   public void componentMoved(ComponentEvent evt) {System.out.println("moved");} */
  
  public void mouseClicked(MouseEvent e) {}  
  public void mouseExited(MouseEvent e) {} 
  public void mouseEntered(MouseEvent e) {}
  public void mouseReleased(MouseEvent e) {} 
  
  public void mousePressed(MouseEvent e) 
  {
    if(panel.getIsBlack())
    {
      turnLabel.setText("Turn: Black");
      repaint();
    }
    else
    {
      turnLabel.setText("Turn: White");
    }
    
    if(panel.isGameOver())
    {
      infoPanel.add(new JButton("New Game?"));
    }
  }
}