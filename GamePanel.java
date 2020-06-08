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
  private boolean isBlack = true;
  private int turns = 4;
  private boolean consecutivePass = false;
  private boolean gameOver = false;
  
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
  
  public boolean getIsBlack()
  {
    return isBlack;
  }
  
  public void paintComponent(Graphics g)
  {
    System.out.println("Paint component kicks in");
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
        
        try
        {
          if(grid.hasLegalMove(r, c, isBlack))
          {
          Image pointerImage = ImageIO.read(new File("images/redCircle.png"));
          System.out.println("at " + r + " " + c);
          g2.drawImage(pointerImage, 43 + (r * 90), 43 + (c * 90), 86, 86, null);
          }
        }
        
        catch(Exception e)
        {
          System.out.println("why");
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
      System.out.println("X: " + e.getX() + "Y: " + e.getY());
    if(e.getX() > 42 && e.getY() > 42 && e.getX() < 762 && e.getY() < 762)
    {
      int xCor = (e.getX()-42)/90;
      int yCor = (e.getY()-42)/90;
      
      
      if(grid.play(xCor, yCor, isBlack))
      {
        repaint();
        isBlack = !isBlack;
        turns++;
        consecutivePass = false;
      }
      else
      {
        System.out.println("You cannot place a disc there");
      }
      
      if(turns == 64 || grid.wincheck() == 2  || grid.wincheck() == 1)
      {
        
        JOptionPane.showMessageDialog(this, "All the discs are placed", "Game Over", JOptionPane.INFORMATION_MESSAGE);
        gameOver = true;
        
        if(grid.wincheck() == 2)
          JOptionPane.showMessageDialog(this, "Black Won!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
        else if(grid.wincheck() == 1)
          JOptionPane.showMessageDialog(this, "White Won!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
        else
          JOptionPane.showMessageDialog(this, "All the discs are placed.", "Game Over", JOptionPane.INFORMATION_MESSAGE);
        
      }
      
      boolean isLegal = false;
      for(int r = 0; r < 8; r++)
      {
        for(int c = 0; c < 8; c++)
        {
          if(grid.hasLegalMove(r,c,isBlack)) 
            isLegal = true;
        }
      }
      if(!isLegal)
      {
        JOptionPane.showMessageDialog(this, "You have no legal move!"," The turn has skipped", JOptionPane.INFORMATION_MESSAGE);
        isBlack = !isBlack;
        if(consecutivePass == true)
        {
          JOptionPane.showMessageDialog(this, "both players passed in two consecutive rounds", "Game Over", JOptionPane.INFORMATION_MESSAGE);
          gameOver = true;
        }
        consecutivePass = true;
      }
      if(grid.checkPlace(xCor,yCor)); //bu ne olm
      //System.out.println("IT IS THERE");
      
    }
    
    
  }
  
  public boolean isGameOver()
  {
    return gameOver;
  }
}
