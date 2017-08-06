package exam09;

public class CartGame extends Thread{

	public Cart c;
	
	public CartGame(Cart c) {
		this.c = c;
	}
	
	public void run() {
		c.startCar();
		try {
			Thread.sleep(c.speed);
			c.runningCar();
		}catch(Exception e) {
			e.printStackTrace();
		}
		c.endCar();
	}	
	
	public static void main(String[] args)  {
		String[] cartNames = {"種種1","種種2","種種3","種種4","種種5"};		
		for(int i = 0; i <cartNames.length; i++) {
			int speed = (int)(Math.random()*3000) + 1000;
			 Cart c = new Cart(speed, cartNames[i]);
			 CartGame cg = new CartGame(c);
			 cg.start();
		}
	}
	
}
