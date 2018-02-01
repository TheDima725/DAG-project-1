import java.util.*;

public class RunTime {

	public static void main(String[] args) {
	
		int h = 4;
		int w = 4;
		
    /*
		@SuppressWarnings("unused")
		Environment game = new Environment(h, w);
	*/     
	    
	    private boolean isRunning;
		 
		public void gameLoop() throws InterruptedException
		{
			@SuppressWarnings("unused")
			Environment game = new Environment(h, w);
			
			//spawn animali e cibo
			
		    while(isRunning)
		    {
		    	//doGameUpdates();
		    	//updateInfo();
		    	Thread.sleep(1000);
		    }
		    
		}
	     
		}

}
