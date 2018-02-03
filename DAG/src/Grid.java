
public class Grid 
{
 final private int FREE=100;
 final private int COUPLER_ANIMAL=101;
 
 private int[][] board;
 
 public Grid(int w, int h)
 {
  board=new int[h][w];
  for(int i=0; i<board.length; i++)
  {
   for(int k=0; k<board[i].length; k++)
   {
	board[i][k]=FREE;   
   }
  }
  
 }
 
 public boolean isFree(int x, int y)
 {
  //Controlla se la cella può essere controllata
  if((x<0)||(x>=board.length))
   return false;
  if((y<0)||(y>=board[x].length))
   return false;
  //Controlla se la cella è libera
  if(board[x][y]==FREE)
   return true;
  else
   return false;
 }
 
 public void setCoupler(int x, int y)
 {
  board[x][y]=COUPLER_ANIMAL;
 }

 
 //Stampa il campo da gioco
 public void print(int couplerUnits)
 {
  for(int i=0; i<board.length; i++)
  {
	  if(i==0)
	   {
		for(int z=0; z<(board[i].length+2); z++)
		 System.out.print("# "); 
		System.out.println();
	   }
   
   for(int k=0; k<board[i].length; k++)
   {
	if(k==0)
	 System.out.print("# ");  
	
	if(board[i][k]==FREE)
     System.out.print('-');
	else
	 System.out.print('@');
	
	if(k==(board[i].length-1))
     System.out.print(" #");
	
	System.out.print(' ');
   }
   
   switch(i)
   {
    case 0:
     System.out.print("       Statistiche");
     break;
    case 2:
     System.out.print("       Coupler animals: "+couplerUnits);
     break;
    case 3:
     System.out.print("       Cloner animals:   /");
     break;
    case 4:
     System.out.print("       Food:             /");
     break;       
   }
   System.out.println();
   
   if(i==(board.length-1))
   {
	for(int z=0; z<(board[i].length+2); z++)
	 System.out.print("# "); 
	System.out.println();
   }
    
  }
 }
 
 //Restituisce le posizioni libere accanto all'animale
 public int checkCloseTo(int x, int y)
 {
  int freeCells=0;
  
  if(this.isFree(x+1, y))
   freeCells+= 10;
  if(this.isFree(x, y+1))
   freeCells+= 1;
  if(this.isFree(x-1, y))
   freeCells+= 2;
  if(this.isFree(x, y-1))
   freeCells+= 4;
  
  return freeCells;
 }
 
 //Restituisce l'altezza della griglia
 public int getHeight()
 {
  return board.length;
 }
 
 //Restituisce la larghezza della griglia
 public int getWidth()
 {
  return board[0].length;
 }
 
}
