package exam02;

public class Exam02 {
	
	int  money = 100;
	
	public int getMoney() {
		return money;
	}
	
	public static void main(String[] args) {
		Exam02 e = new Exam02();
		int m = e.getMoney();
		System.out.println(m);
	}
}
