package exam07;

public class VendingMachine implements Sale{

	private Drink d;
	
	@Override
	public void insertMoney(int money) {
		System.out.println(money + " 을 넣으셨습니다.");
	}

	@Override
	public void clickButton(Drink d) {
		this.d = d;
		System.out.println(d.getdrinkName() + "을 선택하셨습니다.");
	}

	@Override
	public Drink getDrink() {
		return d;
	}
}
