package exam03;

/*   Father에게 상속받기 - "extends"   */
/*   함수의 재정의(@overriding): 상속받는 이름의 함수를 다시 사용   */
/*   파라메터 변수 : 함수에 넘기는 변수   */

public class Son extends Father{
	
	String house ="아들집";
	
	public Son() {   /*   생성자 함수   */
		
		
		
	}
	public void printHouse() {			
		System.out.println(house);
	}
	public static void main (String[] agrs) {
		Son s = new Son();		/*   위에 생성자 호출   */
		
		Father f = new Father();
		
		System.out.println(s.money + " 만원");
		System.out.println(s.car);
		System.out.println(s.house);	
		System.out.println(f.house);
		
		/*Father class에 있는 함수 호출하기*/
		s.printHouse(); //Son에 있는 printHouse 함수 호출
		f.printHouse(); //Father에 있는 printHouse 함수 호출
		s.doJob("나"); //Father에 있는 dojob에 String who 변수 넘김 : 파라메터 변수
		s.doSleep("나"); //Father에 있는 doSleep에 String who 변수  넘김 : 파라메터 변수
		
	}
}
