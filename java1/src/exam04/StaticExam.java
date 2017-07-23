package exam04;

/*static - 변수, 함수앞에사용이 가능
 *         - 사용하면 생성자가 필요없이 바로 사용이 가능. (생성자 필요없이 클래스. 바로 호출 가능)
 *         - static은 static 끼리만 사용이 가능
 *         - static사용하면 글자가 기울어짐
 *         - static은 하나 만 존재해야할때 사용함
 * */
public class StaticExam {
	public static int num;
	
	public void printStr(Person str) {
		str.doWork();  //BizMan class 를 상속 받았기 때문에 BizMan이 상속받은 Person에 있는 함수를 사용 할수 있다.
		System.out.println("매개변수있징" + str);
	}
	public void printStr(int num2) {
		System.out.println("매개변수있지" + num2);
		}
	
	public void printStr() {
		System.out.println("매개변수 없징");
	}
	
	public static void main(String[] args) {
		
		StaticExam se = new StaticExam();
		
		se.printStr(new BizMan());  //BizMan이 이미 Person을 상속 받았기 때문에 12번째 라인의 printStr(Person str) 함수 사용이 가능 
		se.printStr();
		se.printStr(5);
	}
	

}
