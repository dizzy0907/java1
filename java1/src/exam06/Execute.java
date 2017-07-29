package exam06;

import java.util.ArrayList;
import java.util.List;

public class Execute {

	public void printOption(Car c, String carName) {
		if(c instanceof Samsung) {
			Samsung s = (Samsung)c;
			s.secPm();
		}
		c.chioceCar(carName);
		if(!c.checkCarName()) {
			System.out.println("선택하신 자동차가 없습니다.");
		}else {
			System.out.println("시동을 킵니다.");
			c.move();
			c.stop();
			System.out.println("시동을 끕니다.");
		}
	}
	public static void main(String[] args) {
		Execute e = new Execute();
		
		List<String> kiaCarList = new ArrayList<String>();
		kiaCarList.add("K7");
		kiaCarList.add("K5");
		kiaCarList.add("K3");
		Kia k = new Kia(kiaCarList);
		e.printOption(k,"K7");
		
		List<String> sCarList = new ArrayList<String>();
		sCarList.add("SM5");
		sCarList.add("SM6");
		sCarList.add("SM3");
		Samsung s = new Samsung(sCarList);
		e.printOption(s,"SM6");
	}
}
