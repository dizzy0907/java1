package exam04;

public class BizMan extends Person{

	public static void main(String args[]) {
		
//		Person p = new BizMan();  //Person�� bizMan�� ��ӹ���
//		
//		p.doSlieep();
//		p.doWakeUp();
//		p.doWork("��");
//		
//		Person p2 = new Student();  //Person�� Studet�� ��ӹ޾ұ� ������ BizMan�� ��� ���� 
//		
//		p2.doSlieep();
//		p2.doWakeUp();
//		p2.doWork("����");
		
		Person[] arrP= new Person[2];
		
		arrP[0] = new BizMan();
		arrP[1] = new Student();
		
		arrP[0].doWork();
		arrP[1].doWork();
		
		//Person p = arrP[0];
		//BizMan b = arrP[0]; �̰� �ȵ�, BizMan b = new Person(); �̱� ������ �ȵ�.
		
	}
}
