package exam04;

/*static - ����, �Լ��տ������ ����
 *         - ����ϸ� �����ڰ� �ʿ���� �ٷ� ����� ����. (������ �ʿ���� Ŭ����. �ٷ� ȣ�� ����)
 *         - static�� static ������ ����� ����
 *         - static����ϸ� ���ڰ� ������
 *         - static�� �ϳ� �� �����ؾ��Ҷ� �����
 * */
public class StaticExam {
	public static int num;
	
	public void printStr(Person str) {
		str.doWork();  //BizMan class �� ��� �޾ұ� ������ BizMan�� ��ӹ��� Person�� �ִ� �Լ��� ��� �Ҽ� �ִ�.
		System.out.println("�Ű�������¡" + str);
	}
	public void printStr(int num2) {
		System.out.println("�Ű���������" + num2);
		}
	
	public void printStr() {
		System.out.println("�Ű����� ��¡");
	}
	
	public static void main(String[] args) {
		
		StaticExam se = new StaticExam();
		
		se.printStr(new BizMan());  //BizMan�� �̹� Person�� ��� �޾ұ� ������ 12��° ������ printStr(Person str) �Լ� ����� ���� 
		se.printStr();
		se.printStr(5);
	}
	

}
