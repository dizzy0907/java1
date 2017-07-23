package exam04;

/*접근제어자 강의*/

public class Modifier {
	
	public int pubNum;  //속해있는 패키지, 다른패키지, 다른 jar 파일에서도 사용이 가능
	private int priNum;  //무조건 여기 class에서만 사용 가능
	int defNum;  //기본 데이터 타입이 default라서 같은 클래스에선 사용이 가능하지만,  다른 패키지에서는 사용이 불가능
	protected int proNnum; // 같은 패키지 안에서 사용이 가능, 상속시 다른 패키지에서도 사용이 가능
}
