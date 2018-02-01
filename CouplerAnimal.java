
public class CouplerAnimal {

	public CouplerAnimal() {
		
		private int life=10;
		private int posX;
		private int posY;
		
		public CouplerAnimal(int x,int y)
		{
			life=10;
			setPos(x,y);
		}
		
		private void setPos(int x,int y)
		{
			posX=x;
			posY=y;
		}
		
		public int getPosX()
		{
			return posX;
		}
		
		public int getPosY()
		{
			return posY;
		}
	}

}
