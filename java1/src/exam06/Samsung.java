package exam06;
/*super : ��ӹ��� class(���⼭�� CarMaker)  */
import java.util.List;

public class Samsung extends CarMaker{
	
	public Samsung(List<String> carList) {
		super(carList);
		//move(); �̹� CarMaker�� ��ӹ޾ұ� ������ ���� super�� ������� �ʾƵ� �˾Ƽ� CarMaker �Լ� ȣ��
	}
	
	public void secPm() {
		System.out.println("instanceof�� ����ؼ� ���� �Լ� �x��!");
	}
}

