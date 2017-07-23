package exam03;

/*   상속받기   */

public class Father {

	int money = 1000;
	String car = "YF 소나타";
	String house = "아빠집";
	
	public void printHouse() {			
		System.out.println(house);
	}
	
	public void doJob(String who) {
		System.out.println(who + " 일한다.");		
	}
	
	public void doSleep(String who) {
		System.out.println(who + " 잔다.");		
	}
	
	public static void main(String[] args) {
		
	
	}
}
