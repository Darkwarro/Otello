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
  public boolean play(int row, int column, boolean isBlack)
  {
    int r = row;
    int c = column;
    Boolean didsomething = false;
    //checking middle
   // if(r < 6 && c < 6 && c > 1 && r > 1)
    //{
      //UP
      for(int i = 1; i <= c;i++)
      {
        if(discs[r][c-i] == null) 
        {
          break;
        }  
        else if(discs[r][c-i].isBlack() == isBlack && i != 1)
        {
          for(int z = 1; z <i;z++)
          {
            discs[r][c-z].flip(); 
          }
          discs[row][column] = new Disc(row,column,isBlack);
          didsomething = true;
          break;
        }
        else if(discs[r][c-i].isBlack() != isBlack)
        {}
        else
          break;      
      }
      //UP RIGHT
      for(int i = 1; i <= c && i < 8-r;i++)
      {
        if(discs[r+i][c-i] == null) 
        {
          break;
        }  
        else if(discs[r+i][c-i].isBlack() == isBlack && i != 1)
        {
          for(int z = 1; z <i;z++)
          {
            discs[r+z][c-z].flip(); 
          }
          discs[row][column] = new Disc(row,column,isBlack);
          didsomething = true;
          break;
        }
        else if(discs[r+i][c-i].isBlack() != isBlack)
        {}
        else
          break;       
      }
      //RIGHT
      for(int i = 1; i < 8-r;i++)
      {
        if(discs[r+i][c] == null) 
        {
          break;
        }  
        else if(discs[r+i][c].isBlack() == isBlack && i != 1)
        {
          for(int z = 1; z <i;z++)
          {
            discs[r+z][c].flip(); 
          }
          discs[row][column] = new Disc(row,column,isBlack);
          didsomething = true;
          break;
        }
        else if(discs[r+i][c].isBlack() != isBlack)
        {}
        else
          break;        
      }
      //RIGHT DOWN
      for(int i = 1; i < 8-c && i < 8-r ;i++)
      {
        if(discs[r+i][c+i] == null) 
        {
          break;
        }  
        else if(discs[r+i][c+i].isBlack() == isBlack && i != 1)
        {
          for(int z = 1; z <i;z++)
          {
            discs[r+z][c+z].flip(); 
          }
          discs[row][column] = new Disc(row,column,isBlack);
          didsomething = true;
          break;
        }
        else if(discs[r+i][c+i].isBlack() != isBlack)
        {}
        else
          break;        
      }
      //DOWN
      for(int i = 1; i < 8-c ;i++)
      {
        if(discs[r][c+i] == null) 
        {
          break;
        }  
        else if(discs[r][c+i].isBlack() == isBlack && i != 1)
        {
          for(int z = 1; z <i;z++)
          {
            discs[r][c+z].flip(); 
          }
          discs[row][column] = new Disc(row,column,isBlack);
          didsomething = true;
          break;
        }
        else if(discs[r][c+i].isBlack() != isBlack)
        {}
        else
          break;        
      }
      // DOWN LEFT
      for(int i = 1; i <= r && i < 8-c;i++)
      {
        if(discs[r-i][c+i] == null) 
        {
          break;
        }  
        else if(discs[r-i][c+i].isBlack() == isBlack && i != 1)
        {
          for(int z = 1; z <i;z++)
          {
            discs[r-z][c+z].flip(); 
          }
          discs[row][column] = new Disc(row,column,isBlack);
          didsomething = true;
          break;
        }
        else if(discs[r-i][c+i].isBlack() != isBlack)
        {}
        else
          break;        
      }
      // LEFT
      for(int i = 1; i <= r;i++)
      {
        if(discs[r-i][c] == null) 
        {
          break;
        }  
        else if(discs[r-i][c].isBlack() == isBlack && i != 1)
        {
          for(int z = 1; z <i;z++)
          {
            discs[r-z][c].flip(); 
          }
          discs[row][column] = new Disc(row,column,isBlack);
          didsomething = true;
          break;
        }
        else if(discs[r-i][c].isBlack() != isBlack)
        {}
        else
          break;        
      }
      // UP LEFT
      for(int i = 1; i <= r && i <= c;i++)
      {
        if(discs[r-i][c-i] == null) 
        {
          break;
        }  
        else if(discs[r-i][c-i].isBlack() == isBlack && i != 1)
        {
          for(int z = 1; z <i;z++)
          {
            discs[r-z][c-z].flip(); 
          }
          discs[row][column] = new Disc(row,column,isBlack);
          didsomething = true; break;
        }
        else if(discs[r-i][c-i].isBlack() != isBlack)
        {}
        else
          break;        
      }
  
    if(aiplays)
      this.playAI();
    
    return didsomething;
    
  
    
  }
  //precondition: r and c are positive numbers in the domain 0 <= r,c < 8

  private void playAI()
  {
    
  }
  public int wincheck()
  {
    boolean wfound = false;
    boolean bfound = false;
    for(int r = 0; r < discs.length;r++)
    {
      for(int c = 0; c < discs[0].length;c++)
      {
        if(discs[r][c] != null && discs[r][c].isBlack())
          bfound = true;
        if(discs[r][c] != null && !discs[r][c].isBlack())
          wfound = true;
      }
    }
    if(!bfound && wfound)
    {
      return 1;
    }
    else if(!wfound && bfound)
    {
      return 2; 
    }
    else
    {
      return 3;
    }
    
  }
  public boolean hasLegalMove(int row, int column, boolean isBlack)
  {
    int r = row;
    int c = column;
    Boolean didsomething = false;
    //checking middle
    if(discs[r][c] != null)
    {
      System.out.println("Nope, this space is filled bruh");
      return false;
    }
    //if(r < 6 && c < 6 && c > 1 && r > 1)
    //{
      //UP
      for(int i = 1; i <= c;i++)
      {
        if(discs[r][c-i] == null) 
        {
          break;
        }  
        else if(discs[r][c-i].isBlack() == isBlack && i != 1)
        {
          didsomething = true;
          break;
        }
        else if(discs[r][c-i].isBlack() != isBlack)
        {}
        else
          break;      
      }
      //UP RIGHT
      for(int i = 1; i <= c && i < 8-r;i++)
      {
        if(discs[r+i][c-i] == null) 
        {
          break;
        }  
        else if(discs[r+i][c-i].isBlack() == isBlack && i != 1)
        {
          didsomething = true;
          break;
        }
        else if(discs[r+i][c-i].isBlack() != isBlack)
        {}
        else
          break;       
      }
      //RIGHT
      for(int i = 1; i < 8-r;i++)
      {
        if(discs[r+i][c] == null) 
        {
          break;
        }  
        else if(discs[r+i][c].isBlack() == isBlack && i != 1)
        {
          didsomething = true;
          break;
        }
        else if(discs[r+i][c].isBlack() != isBlack)
        {}
        else
          break;        
      }
      //RIGHT DOWN
      for(int i = 1; i < 8-c && i < 8-r ;i++)
      {
        if(discs[r+i][c+i] == null) 
        {
          break;
        }  
        else if(discs[r+i][c+i].isBlack() == isBlack && i != 1)
        {
          didsomething = true;
          break;
        }
        else if(discs[r+i][c+i].isBlack() != isBlack)
        {}
        else
          break;        
      }
      //DOWN
      for(int i = 1; i < 8-c ;i++)
      {
        if(discs[r][c+i] == null) 
        {
          break;
        }  
        else if(discs[r][c+i].isBlack() == isBlack && i != 1)
        {
          didsomething = true;
          break;
        }
        else if(discs[r][c+i].isBlack() != isBlack)
        {}
        else
          break;        
      }
      // DOWN LEFT
      for(int i = 1; i <= r && i < 8-c;i++)
      {
        if(discs[r-i][c+i] == null) 
        {
          break;
        }  
        else if(discs[r-i][c+i].isBlack() == isBlack && i != 1)
        {
          didsomething = true;
          break;
        }
        else if(discs[r-i][c+i].isBlack() != isBlack)
        {}
        else
          break;        
      }
      // LEFT
      for(int i = 1; i <= r;i++)
      {
        if(discs[r-i][c] == null) 
        {
          break;
        }  
        else if(discs[r-i][c].isBlack() == isBlack && i != 1)
        {
          
          didsomething = true;
          break;
        }
        else if(discs[r-i][c].isBlack() != isBlack)
        {}
        else
          break;        
      }
      // UP LEFT
      for(int i = 1; i <= r && i <= c;i++)
      {
        if(discs[r-i][c-i] == null) 
        {
          break;
        }  
        else if(discs[r-i][c-i].isBlack() == isBlack && i != 1)
        {
          
          didsomething = true; break;
        }
        else if(discs[r-i][c-i].isBlack() != isBlack)
        {}
        else
          break;        
      }

    return didsomething;
    
    
  }
  public Disc[][] getDiscs()
  {
    return discs;
  }
  public boolean checkPlace(int row, int column)
  {
    return discs[row][column] != null; 
  }
}