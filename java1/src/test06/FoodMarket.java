package test06;

public class FoodMarket {
	
	public void sale(Food f) {
		if(f instanceof Rice) {
			Rice r = (Rice)f;
			r.discountFood();
		}else if(f instanceof Coffee) {
			Coffee c = (Coffee)f;
			c.openFood();
		}
		f.saleFood();
	}
	
	public static void main(String[] args) {
		Ramen ra = new Ramen();
		Rice ri = new Rice();
		Coffee co = new Coffee();
		
		FoodMarket fm = new FoodMarket();
		fm.sale(ra);
		fm.sale(ri);
		fm.sale(co);
	}

}
