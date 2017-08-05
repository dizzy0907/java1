package exam08;

import java.lang.reflect.Method;

public class Reflection {

	public static void main(String[] args)  {
		
		try {
			Class cls = Class.forName("exam08.Exam");		
			Method[] m = cls.getDeclaredMethods();//clas�ȿ� �ִ� ����� �Լ� �� ��������
			for(int i = 0; i < m.length; i++) {
				//System.out.println(m[i].toString());
			}	
			Exam e = (Exam)cls.newInstance();//new�� ���� ��ӹ��� �ʾƵ� ��
			//e.print();
			Method pMethod = cls.getMethod("print", String.class);
			pMethod.invoke(e, "����");
			
		}catch (Exception ec) {
			System.out.println(ec);
		}
	}	
}
