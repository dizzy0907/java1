package exam04;

public class BizMan extends Person{

	public static void main(String args[]) {
		
//		Person p = new BizMan();  //Person이 bizMan을 상속받음
//		
//		p.doSlieep();
//		p.doWakeUp();
//		p.doWork("일");
//		
//		Person p2 = new Student();  //Person이 Studet를 상속받았기 때문에 BizMan이 사용 가능 
//		
//		p2.doSlieep();
//		p2.doWakeUp();
//		p2.doWork("공부");
		
		Person[] arrP= new Person[2];
		
		arrP[0] = new BizMan();
		arrP[1] = new Student();
		
		arrP[0].doWork();
		arrP[1].doWork();
		
		//Person p = arrP[0];
		//BizMan b = arrP[0]; 이건 안됨, BizMan b = new Person(); 이기 때문에 안됨.
		
	}
}
