package exam09;

public class Cart {
	
	public int speed = 0;
	public String name;
	
	public Cart(int speed, String name) {
		this.speed = speed;
		this.name = name;
	}
	
	public void startCar() {
		System.out.println(this.name + "�� �ٱ� �����մϴ�.");
	}
	
	public void runningCar() {
		System.out.println(this.name + "�� �ٴ� ���Դϴ�.");
	}
	
	public void endCar() {
		System.out.println(this.name + "�� ������� �����߽��ϴ�.");
	}
	
}
