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
  if(r < 6 && c < 6 && c > 1 && r > 1)
  {
   //UP
   for(int i = 1; i < c;i++)
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
   for(int i = 1; i < c && i < 8-r;i++)
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
   for(int i = 1; i < r && i < 8-c;i++)
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
   for(int i = 1; i < r;i++)
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
   for(int i = 1; i < r && i < c;i++)
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
  }
 //CHECKING EDGE 1 && EDGE4 
  else if(( r < 6 && c < 6)  || ( r <6 && c > 1 ))
  {
   //UP
   for(int i = 1; i < c;i++)
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
     didsomething = true; break;
    }
    else if(discs[r][c-i].isBlack() != isBlack)
    {}
    else
    break;      
   }
   //UP RIGHT
   for(int i = 1; i < c && i < 8-r;i++)
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
     didsomething = true; break;
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
     didsomething = true; break;
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
     didsomething = true; break;
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
     didsomething = true; break;
    }
    else if(discs[r][c+i].isBlack() != isBlack)
    {}
    else
    break;        
   }
  }
  //CHECKING EDGE 2
  else if((r > 1 && c < 6) ||  (r > 1 && c > 1))
  {
   //UP
   for(int i = 1; i < c;i++)
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
     didsomething = true; break;
    }
    else if(discs[r][c-i].isBlack() != isBlack)
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
     didsomething = true; break;
    }
    else if(discs[r][c+i].isBlack() != isBlack)
    {}
    else
    break;        
   }
   // DOWN LEFT
   for(int i = 1; i < r && i < 8-c;i++)
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
     didsomething = true; break;
    }
    else if(discs[r-i][c+i].isBlack() != isBlack)
    {}
    else
    break;        
   }
    // LEFT
   for(int i = 1; i < r;i++)
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
     didsomething = true; break;
    }
    else if(discs[r-i][c].isBlack() != isBlack)
    {}
    else
    break;        
   }
    // UP LEFT
   for(int i = 1; i < r && i < c;i++)
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
   //CHECKING EDGE 3( RIGHT BOTTOM)
   
  }
   if(aiplays)
  this.playAI();
  
  return didsomething;
   
   
  
  
   
  //this.update(row, column, move);
 
 }
  //precondition: r and c are positive numbers in the domain 0 <= r,c < 8
 public int checkIfProperMove(int row, int column, boolean isBlack)
 {
  //if there is a disc over there 
  if(discs[row][column] != null)
  return -1;
  else
  {
   int check = flippable(row,column,isBlack,0);
   if(check == 0)
   return -1;
   else if(check < 10)
   {
    //BOUNDS ERROR CAN OCCUR
     //UP
    if( discs[row][column-check-1] != null && discs[row][column-check-1].isBlack() == isBlack)
    {
     return check;
    }
    else
     return 0;
   }
   else if(check < 20)
   {
    //BOUNDS ERROR CAN OCCUR
    //RIGT-UP DIAGONAL
    if( discs[row+(check-10)+1][column-(check-10)-1] != null && discs[row+(check-10)+1][column-(check-10)-1].isBlack() == isBlack)
    {
     return check;
    }
    else
     return 0;
   }
   else if(check < 30)
   {
    //BOUNDS ERROR CAN OCCUR
    //RIGHT DIAGONAL
    if( discs[row+(check-20)+1][column] != null && discs[row+(check-20)+1][column].isBlack() == isBlack)
    {
     return check;
    }
    else
     return 0;
   }
   else if(check < 40)
   {
    //BOUNDS ERROR CAN OCCUR
    //DOWN RIGHT DIAGONAL
     //THIS HAS BEEN MODIFIED FOR BUG TESTING
    if( discs[row+(check-30)+1][column+(check-30)+1] != null && discs[row+(check-30)+1][column+(check-30)+1].isBlack() == isBlack)
    {
     System.out.println("DOWN RIGHT");
     return check;
    }
    
    else
     return 0;
   }
   else if(check < 50)
   {
    //BOUNDS ERROR CAN OCCUR
    //DOWN
    if( discs[row][column+(check-40)+1] != null && discs[row][column+(check-40)+1].isBlack() == isBlack)
    {
     return check;
    }
    else
     return 0;
   }
   else if(check < 60)
   {

    //DOWN-LEFT DIAGONAL
    System.out.println("check r: "+(row-check+50-1)+" c: "+(column-check+50));
    if( discs[row-(check-50)-1][column+(check-50)+1] != null && discs[row-(check-50)-1][column+(check-50)+1].isBlack() == isBlack)
    {
     return check;
    }
    else
     return 0;
   }
   else if(check < 70)
   {
    //LEFT
    if( discs[row-(check-60)-1][column] != null && discs[row-(check-60)-1][column].isBlack() == isBlack)
    {
     return check;
    }
    else
     return 0;
   }
   else if(check < 80)
   {
  
    //UP-LEFT DIAGONAL
    if( discs[row-(check-70)-1][column-(check-70)-1] != null && discs[row-(check-70)-1][column-(check-70)-1].isBlack() == isBlack)
    {
     return check;
    }
    else
     return 0;
   }
   else 
   return -1;
  }
  
 }

 private int flippable(int r, int c,boolean isBlack, int angelo)
 {
  int manyflips = angelo;
  //CHECKING UP
  if((c > 1  && ( angelo == 0 || angelo < 10)) && discs[r][c-1] != null && discs[r][c-1].isBlack() != isBlack )
  {
   manyflips = flippable(r,c-1,isBlack,manyflips+1);
   System.out.println("UP");
  }
  //checking up-right diagonal
  else if(((c > 1 && r < 6  && angelo == 0) || ( c > 1 && r < 6 && angelo > 10 && angelo < 20)) && discs[r+1][c-1] != null && discs[r+1][c-1].isBlack() != isBlack)
  {
    if(angelo == 0)
    {
     manyflips += 10;
    }
    manyflips = flippable(r+1,c-1,isBlack,manyflips+1);
    System.out.println("UPRIGHT");
  }
  //checking right
  else if(((r < 6 && angelo == 0) || ( r < 6 && angelo > 20 && angelo < 30)) && discs[r+1][c] != null && discs[r+1][c].isBlack() != isBlack ) 
  {
    if(angelo == 0)
    {
     manyflips += 20;
    }
    manyflips = flippable(r+1,c,isBlack,manyflips+1);
    
    System.out.println("RIGHT");
  }
  //checking right down diagonal
  else if((( r < 6 && c < 6  && angelo == 0) || ( r < 6 && c < 6 && angelo > 30 && angelo < 40)) && discs[r+1][c+1] != null && discs[r+1][c+1].isBlack() != isBlack)
  {
    if(angelo == 0)
    {
     manyflips += 30;
    }
    manyflips = flippable(r+1,c+1,isBlack,manyflips+1);
    System.out.println("RIGHTDOWN");
  }
  //CHECKING DOWN
  else if(((c < 6 &&  angelo == 0) || ( c < 6 && angelo > 40 && angelo < 50)) && discs[r][c+1] != null && discs[r][c+1].isBlack() != isBlack)
  {
    if(angelo == 0)
    {
     manyflips += 40;
    } 
    manyflips = flippable(r,c+1,isBlack,manyflips+1);
      System.out.println("DOWN");
  }
  //checking DOWN left diagonal
  else if((( c < 6 && r > 1 && angelo == 0) ||(c < 6 && r > 1 && angelo > 50 && angelo < 60)) && discs[r-1][c+1] != null && discs[r-1][c+1].isBlack() != isBlack)
  {
   if(angelo == 0)
   {
    manyflips += 50;
   }
   manyflips = flippable(r-1,c+1,isBlack,manyflips+1);
  }
  //checking left
  else if(((r > 1  && angelo == 0) || ( r > 1 && angelo > 60 && angelo < 70)) && discs[r-1][c] != null && discs[r-1][c].isBlack() != isBlack)
  {
   if(angelo == 0)
   {
    manyflips += 60;
    
   }
   manyflips = flippable(r-1,c,isBlack,manyflips+1);
   System.out.println("HIT HOME LINE 195: "+manyflips);
  }
  //checking UP left diagonal
  else if(((r > 1 && c > 1 && angelo == 0) || (r > 1 && c > 1 && angelo > 70 && angelo < 80)) && discs[r-1][c-1] != null && discs[r-1][c-1].isBlack() != isBlack)
  {
    if(angelo == 0)
    {
     manyflips += 70;
    }
    manyflips = flippable(r-1,c-1,isBlack,manyflips+1);
  }
  
  System.out.print("manyflips: "+manyflips);
  
  
  
  
  
  
  /*
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
  */
  return manyflips;
 }
 
 private void update(int r, int c, int move)
 {
  System.out.println("MOVE IT BISHCUIT: "+move);
  if(move < 10)
  {
   //flipping up
   for(int i = 1; i < move+1;i++)
   {
    discs[r][c-i].flip(); 
   } 
  }
  else if(move < 20)
  {
   //flipping up-right
   for(int i = 1; i < (move-10)+1;i++)
   {
    discs[r+i][c-i].flip(); 
   }
  }
  else if(move < 30)
  {
   //flipping right
   for(int i = 1; i < (move-20)+1;i++)
   {
    discs[r+i][c].flip(); 
   }
  }
  else if(move < 40)
  {
   //flipping DOWN RIGHT(CORRECT) down diagonal
   for(int i = 1; i < (move-30)+1;i++)
   {
    discs[r+i][c+i].flip(); 
   } 
  }
  else if(move < 50)
  {
   //flipping down
   for(int i = 1; i < (move-40+1);i++)
   {
    discs[r][c+i].flip(); 
   } 
  }
  else if(move < 60)
  {
   //flipping down left diagonal
   for(int i = 1; i < (move-50)+1;i++)
   {
    discs[r-i][c+i].flip(); 
   }
  }
  else if(move < 70)
  {
   //flipping left
   //THE ONES WITH NEGATIVE 1 ARE THE CHANGED ONES
   
   for(int i = 1; i < (move-60)+1;i++)
   {
    discs[r-i][c].flip(); 
   }
   
  }
  else if(move < 80)
  {
   //flipping Up-left diagonal
   for(int i = 1; i < (move-70)+1;i++)
   {
    discs[r-i][c-i].flip(); 
   }
  }
 }
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
  if(r < 6 && c < 6 && c > 1 && r > 1)
  {
   //UP
   for(int i = 1; i < c;i++)
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
   for(int i = 1; i < c && i < 8-r;i++)
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
   for(int i = 1; i < r && i < 8-c;i++)
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
   for(int i = 1; i < r;i++)
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
   for(int i = 1; i < r && i < c;i++)
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
  }
 //CHECKING EDGE 1 && EDGE4 
  else if(( r < 6 && c < 6)  || ( r <6 && c > 1 ))
  {
   //UP
   for(int i = 1; i < c;i++)
   {
    if(discs[r][c-i] == null) 
    {
     break;
    }  
    else if(discs[r][c-i].isBlack() == isBlack && i != 1)
    {
     
     didsomething = true; break;
    }
    else if(discs[r][c-i].isBlack() != isBlack)
    {}
    else
    break;      
   }
   //UP RIGHT
   for(int i = 1; i < c && i < 8-r;i++)
   {
    if(discs[r+i][c-i] == null) 
    {
     break;
    }  
    else if(discs[r+i][c-i].isBlack() == isBlack && i != 1)
    {
     
     didsomething = true; break;
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
     
     didsomething = true; break;
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
     
     didsomething = true; break;
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
    
     didsomething = true; break;
    }
    else if(discs[r][c+i].isBlack() != isBlack)
    {}
    else
    break;        
   }
  }
  //CHECKING EDGE 2
  else if((r > 1 && c < 6) ||  (r > 1 && c > 1))
  {
   //UP
   for(int i = 1; i < c;i++)
   {
    if(discs[r][c-i] == null) 
    {
     break;
    }  
    else if(discs[r][c-i].isBlack() == isBlack && i != 1)
    {
     didsomething = true; break;
    }
    else if(discs[r][c-i].isBlack() != isBlack)
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
  
     didsomething = true; break;
    }
    else if(discs[r][c+i].isBlack() != isBlack)
    {}
    else
    break;        
   }
   // DOWN LEFT
   for(int i = 1; i < r && i < 8-c;i++)
   {
    if(discs[r-i][c+i] == null) 
    {
     break;
    }  
    else if(discs[r-i][c+i].isBlack() == isBlack && i != 1)
    {
     didsomething = true; break;
    }
    else if(discs[r-i][c+i].isBlack() != isBlack)
    {}
    else
    break;        
   }
    // LEFT
   for(int i = 1; i < r;i++)
   {
    if(discs[r-i][c] == null) 
    {
     break;
    }  
    else if(discs[r-i][c].isBlack() == isBlack && i != 1)
    {

     didsomething = true; break;
    }
    else if(discs[r-i][c].isBlack() != isBlack)
    {}
    else
    break;        
   }
    // UP LEFT
   for(int i = 1; i < r && i < c;i++)
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
   //CHECKING EDGE 3( RIGHT BOTTOM)
   
  }
  
  return didsomething;
   
   
  
  
   
  //this.update(row, column, move);
 
 }
 public Disc[][] getDiscs()
 {
 return discs;
 }
}