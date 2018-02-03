import java.util.*;

public class RunTime
{
 public static void main(String[] args)
 {	 
  int h = 15;
  int w = 15;
  
  System.out.println("Inserisci il numero di animali da spawnare (min=1 max=20):");
  int animals=inputInt();
  
  Environment game = new Environment(h, w);
  game.animalSpawn(animals);
  
  
 }

 public static int random(int min,int max)
 {
   Random generator = new Random(); 
   int i = generator.nextInt(max-min) + min;
   return i;
 }
 
 private static int inputInt()
 {
  Scanner scan=new Scanner(System.in);
  int integer=scan.nextInt();
  scan.close();
  return integer;
 }
 
 public static void clear()
 {
  //Cercando qualcosa per pulire lo schermo
 }
}
