package exam03;

/*   Father���� ��ӹޱ� - "extends"   */
/*   �Լ��� ������(@overriding): ��ӹ޴� �̸��� �Լ��� �ٽ� ���   */
/*   �Ķ���� ���� : �Լ��� �ѱ�� ����   */

public class Son extends Father{
	
	String house ="�Ƶ���";
	
	public Son() {   /*   ������ �Լ�   */
		
		
		
	}
	public void printHouse() {			
		System.out.println(house);
	}
	public static void main (String[] agrs) {
		Son s = new Son();		/*   ���� ������ ȣ��   */
		
		Father f = new Father();
		
		System.out.println(s.money + " ����");
		System.out.println(s.car);
		System.out.println(s.house);	
		System.out.println(f.house);
		
		/*Father class�� �ִ� �Լ� ȣ���ϱ�*/
		s.printHouse(); //Son�� �ִ� printHouse �Լ� ȣ��
		f.printHouse(); //Father�� �ִ� printHouse �Լ� ȣ��
		s.doJob("��"); //Father�� �ִ� dojob�� String who ���� �ѱ� : �Ķ���� ����
		s.doSleep("��"); //Father�� �ִ� doSleep�� String who ����  �ѱ� : �Ķ���� ����
		
	}
}
