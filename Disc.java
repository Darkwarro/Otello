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
    isBlack = !isBlack;
  }
  
  public boolean isBlack()
  {
    return isBlack; 
  }
}