import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Rectangle;

import java.awt.event.ComponentListener;
import java.awt.event.ComponentEvent;

public class GameFrame extends JFrame implements ComponentListener
{
  private static final int FRAME_WIDTH = 800;
  private static final int FRAME_HEIGHT = 820;
  
  GamePanel panel;
  
  public GameFrame()
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
     setTitle("Othello");
     setLocationRelativeTo(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
  }
  
  private void initComponents()
  {
    panel = new GamePanel();
  }
  
  private void addComponents()
  {
    add(panel, BorderLayout.CENTER);
  }
  
  // @TODO: Keep a constant aspect ratio
  @Override
  public void componentResized(ComponentEvent arg0)
  {
    int W = 3;  
    int H = 2;  
    Rectangle b = arg0.getComponent().getBounds();
    arg0.getComponent().setBounds(b.x, b.y, b.width, b.width*H/W);
  }
  
  public void componentShown(ComponentEvent evt) {}

  public void componentHidden(ComponentEvent evt) {}

  public void componentMoved(ComponentEvent evt) {}
}