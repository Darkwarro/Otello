import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import javax.imageio.ImageIO;

import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.io.File;
import java.io.IOException;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

public class GamePanel extends JPanel implements MouseListener
{
  private Image backgroundImage;
  private GamePanel gamePanel;
  private OtelloGrid grid;
  private boolean isBlack = false;
  private int turns = 4;
  
  public GamePanel()
  {
    addMouseListener(this); //adds a mouse listener 
    
    setLayout(null);
    try
    {
      backgroundImage = ImageIO.read(new File("images/board.png"));
    }
    catch(IOException e)
    {
    }
    
    gamePanel = this;
    grid = new OtelloGrid(0);
    
  }
  
  public void paintComponent(Graphics g)
  {
    Graphics2D g2 = (Graphics2D) g;
    g2.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), null);
    
    Disc[][] discs = grid.getDiscs();
    
    for(int r = 0; r < 8; r++)
    {
      for(int c = 0; c < 8; c++)
      {
        try
        {
          Image discImage = ImageIO.read(new File("images/black" + discs[r][c].isBlack() + ".png"));
          g2.drawImage(discImage, 43 + (r * 90), 43 + (c * 90), 86, 86, null);
        }
        
        catch(Exception e)
        {
          //no image or no disc
        }   
      }
    }
  }
  
  public void mouseClicked(MouseEvent e) {}  
  public void mouseExited(MouseEvent e) {} 
  public void mouseEntered(MouseEvent e) {}
  public void mouseReleased(MouseEvent e) {} 
  
  public void mousePressed(MouseEvent e) 
  {
    if(e.getX() > 42 && e.getY() > 42 && e.getX() < 762 && e.getY() < 762)
    {
      System.out.println("X:" + (e.getX()-42)/90);
      System.out.println("Y:" + (e.getY()-42)/90);
      int xCor = (e.getX()-42)/90;
      int yCor = (e.getY()-42)/90;
      
      if(grid.checkIfProperMove(xCor, yCor, isBlack))
      {
        grid.play(xCor, yCor, isBlack);
        repaint();
        isBlack = !isBlack;
        turns++;
      }
      
      if(turns == 64)
      {
      JOptionPane.showMessageDialog(this, "All the discs are placed", "Game Over", JOptionPane.INFORMATION_MESSAGE);
      }
    }
  } 
}