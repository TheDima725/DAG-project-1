import java.util.*;

public class Environment
{
 private Grid gameGrid;
 private List<CouplerAnimal> couplerAnimals=new ArrayList<CouplerAnimal>();;
 
 public Environment(int h, int w)
 {
  gameGrid = new Grid(h, w);
  
 } 
 
 public void animalSpawn(int couplerUnits)
  {
   //CouplerAnimal spawn
   for(int i=0; i<couplerUnits; i++)
   {
	do
	{
	 int posX=RunTime.random(0, (gameGrid.getWidth()-1));
	 int posY=RunTime.random(0, (gameGrid.getHeight()-1));
	 
	 if(gameGrid.isFree(posX, posY)&&(gameGrid.checkCloseTo(posX, posY)==17))
	 {
	  couplerAnimals.add(new CouplerAnimal(posX, posY));
	  gameGrid.setCoupler(posX, posY);
	  break;
	 }
	 
	}while(true);
	
   }

   gameGrid.print(couplerAnimals.size());
  }
 
 
 
 public void lifeCycle()
 {
  
  gameGrid.print(couplerAnimals.size());
 }
 
}

