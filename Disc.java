import java.awt.Graphics2D;
public class Disc
{
 private boolean isBlack;
 private int row;
 private int column;
 
 public Disc(int r, int c,boolean black)
 {
  isBlack = black; 
  row = r;
  column = c;
 }
 
 public void flip()
 {
  if(!isBlack)
  isBlack = true;
  else
  isBlack = false;
 }
 
 public boolean isBlack()
 {
  return isBlack; 
 }
 public void draw(Graphics2D g2)
 {
  //knk senin buray� ayarlaman laz�m, row ve columna g�re �izdirsen �a�maz s�yliyim
 }
}