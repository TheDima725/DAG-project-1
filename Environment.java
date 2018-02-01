
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
 
   public void AnimalSpawn()
   {

	  for(int i=0,i<=2,i++)
	  {
		  //spawno sulla casella di posizione [random(3,0),random(3,0)] l'animale, passandogli il costruttore
		  //CouplerAnimal(posX,posY); così da dargli posizione random
		  //ho fatto max 3 min 0 così che su 16 caselle, max 8 possono essere di cibo, e quindi 8 per gli animali. max 3 animali
	  }
	  
   }
  
  
   public int random(int max,int min)
   {
	   Random generator = new Random(); 
	   int i = generator.nextInt(max-min) + min;
	   return i;
   }

}
