package exam06;
/*super : 상속받은 class(여기서는 CarMaker)  */
import java.util.List;

public class Samsung extends CarMaker{
	
	public Samsung(List<String> carList) {
		super(carList);
		//move(); 이미 CarMaker를 살속받았기 때문에 굳이 super를 사용하지 않아도 알아서 CarMaker 함수 호출
	}
	
	public void secPm() {
		System.out.println("instanceof를 사용해서 나온 함수 땨란!");
	}
}

