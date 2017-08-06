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
		String[] cartNames = {"�غ�1","�غ�2","�غ�3","�غ�4","�غ�5"};		
		for(int i = 0; i <cartNames.length; i++) {
			int speed = (int)(Math.random()*3000) + 1000;
			 Cart c = new Cart(speed, cartNames[i]);
			 CartGame cg = new CartGame(c);
			 cg.start();
		}
	}
	
}
