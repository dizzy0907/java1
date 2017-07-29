package exam07;

public class Execute {
	
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		vm.insertMoney(1000);
		vm.clickButton(new Coke());
		Drink d = vm.getDrink();
		
		System.out.println(d.getdrinkName() +"가 나왔습니다");
	}
}
