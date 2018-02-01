
public class Environment
{
 public Environment(int height, int width)
 {
  Cell[][] grid = new Cell[height][width];
   System.out.println("Creo Environment");
  //Inizializzo la matrice di caselle
  for(int i=0; i<height; i++)
  {
   for(int k=0; i<width; k++)
   {
	grid[i][k]=new Cell();   
   }
  }
  
  //Creo gli animali sulla griglia
  
 }

}
