package exam06;

import java.util.List;

public class CarMaker implements Car{
	private String carName;
	private List<String> carList;
	
	public CarMaker(List<String> carList) {
		this.carList = carList;
	}
	
	@Override
	public void move() {
		System.out.println(carName +" 움직입니다");
	}

	@Override
	public void stop() {
		System.out.println(carName +" 정지합니다");
	}
	
	@Override
	public void printNam() {
		System.out.println(carName);
	}

	@Override
	public void chioceCar(String carName) {
		try {
			int index = carList.indexOf(carName);
			if(index == -1) {
				System.out.println("없는 자동차 입니다.");
			}
			this.carName = carList.get(index);
		}catch(Exception e) {
			System.out.println("오류났음쭁");
		}
	}

	@Override
	public boolean checkCarName() {
		if(carName==null) {
			return false;
		}
		return true;
	}

}
