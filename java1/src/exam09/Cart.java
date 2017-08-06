package exam09;

public class Cart {
	
	public int speed = 0;
	public String name;
	
	public Cart(int speed, String name) {
		this.speed = speed;
		this.name = name;
	}
	
	public void startCar() {
		System.out.println(this.name + "이 뛰기 시작합니다.");
	}
	
	public void runningCar() {
		System.out.println(this.name + "이 뛰는 중입니다.");
	}
	
	public void endCar() {
		System.out.println(this.name + "이 결승점에 도착했습니다.");
	}
	
}
