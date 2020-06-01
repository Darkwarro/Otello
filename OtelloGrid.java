import java.awt.Graphics2D;
public class OtelloGrid
{
 private boolean aiplays;
 private int aismarts;
 private Disc[][] discs;
 
 public OtelloGrid(int aismarts) 
 {
  discs = new Disc[8][8]; 
  discs[3][3] = new Disc(3,3,false);
  discs[4][4] = new Disc(4,4,false);
  discs[4][3] = new Disc(4,3,true);
  discs[3][4] = new Disc(3,4,true);
  
  this.aismarts = aismarts;
  if(aismarts == 0)
  aiplays = false;
  else
  aiplays = true;
 }
 //precondition: the move has been appropriately checked with check if proper move,
 public void play(int row, int column, boolean isBlack)
 {
  discs[row][column] = new Disc(row,column,isBlack);
  
   
  this.update();
  if(aiplays)
  this.playAI();
 }
  //precondition: r and c are positive numbers in the domain 0 <= r,c < 8
 public boolean checkIfProperMove(int row, int column, boolean isBlack)
 {
  //if there is a disc over there 
  if(discs[row][column] != null)
  return false;
  else if(flippable(row,column,isBlack))
  return true;
  else
  return false;
 }

 private boolean flippable(int r, int c,boolean isBlack)
 {
  boolean flip = false;
  //checking up
  if(c < 6)
  {
   //black case
   if(isBlack && discs[r][c+2] != null && discs[r][c+2].isBlack() && discs[r][c+1] != null && !discs[r][c+1].isBlack()) 
   flip = true;
   //white case
   else if(!isBlack && discs[r][c+2] != null && !discs[r][c+2].isBlack() && discs[r][c+1] != null && discs[r][c+1].isBlack()) 
   flip = true;
  }
  //checking up-right diagonal
  if(c < 6 && r < 6)
  {
   //black case
   if(isBlack && discs[r+2][c+2] != null && discs[r+2][c+2].isBlack() && discs[r+1][c+1] != null && !discs[r+1][c+1].isBlack()) 
   flip = true;
   //white case
   else if(!isBlack && discs[r+2][c+2] != null && !discs[r+2][c+2].isBlack() && discs[r+1][c+1] != null && discs[r+1][c+1].isBlack()) 
   flip = true;   
  }
  //checking right
  if(r < 6) 
  {
   //black case
   if(isBlack && discs[r+2][c] != null && discs[r+2][c].isBlack() && discs[r+1][c] != null && !discs[r+1][c].isBlack()) 
   flip = true;
   //white case
   else if(!isBlack && discs[r+2][c] != null && !discs[r+2][c].isBlack() && discs[r+1][c] != null && discs[r+1][c].isBlack()) 
   flip = true; 
  }
  //checking right down diagonal
  if( r < 6 && c > 1)
  {
   //black case
   if(isBlack && discs[r+2][c-2] != null && discs[r+2][c-2].isBlack() && discs[r+1][c-1] != null && !discs[r+1][c-1].isBlack()) 
   flip = true;
   //white case
   else if(!isBlack && discs[r+2][c-2] != null && !discs[r+2][c-2].isBlack() && discs[r+1][c-1] != null && discs[r+1][c-1].isBlack()) 
   flip = true; 
  }
  //checking down
  if(c > 1)
  {
   //black case
   if(isBlack && discs[r][c-2] != null && discs[r][c-2].isBlack() && discs[r][c-1] != null && !discs[r][c-1].isBlack()) 
   flip = true;
   //white case
   else if(!isBlack && discs[r][c-2] != null && !discs[r][c-2].isBlack() && discs[r][c-1] != null && discs[r][c-1].isBlack()) 
   flip = true;
  }
  //checking down left diagonal
  if( c > 1 && r > 1)
  {
   //black case
   if(isBlack && discs[r-2][c-2] != null && discs[r-2][c-2].isBlack() && discs[r-1][c-1] != null && !discs[r-1][c-1].isBlack()) 
   flip = true;
   //white case
   else if(!isBlack && discs[r-2][c-2] != null && !discs[r-2][c-2].isBlack() && discs[r-1][c-1] != null && discs[r-1][c-1].isBlack()) 
   flip = true; 
  }
  //checking left
  if(r > 1)
  {
   //black case
   if(isBlack && discs[r-2][c] != null && discs[r-2][c].isBlack() && discs[r-1][c] != null && !discs[r-1][c].isBlack()) 
   flip = true;
   //white case
   else if(!isBlack && discs[r-2][c] != null && !discs[r-2][c].isBlack() && discs[r-1][c] != null && discs[r-1][c].isBlack()) 
   flip = true;  
  }
  //checking up left diagonal
  if(r > 1 && c < 6)
  {
   //black case
   if(isBlack && discs[r-2][c+2] != null && discs[r-2][c+2].isBlack() && discs[r-1][c+1] != null && !discs[r-1][c+1].isBlack()) 
   flip = true;
   //white case
   else if(!isBlack && discs[r-2][c+2] != null && !discs[r-2][c+2].isBlack() && discs[r-1][c+1] != null && discs[r-1][c+1].isBlack()) 
   flip = true; 
  }
  return flip;
 }
 
 private void update()
 {
   
 }
 private void playAI()
 {
   
 }
 public Disc[][] getDiscs()
 {
 return discs;
 }
}