package exam08;

import java.lang.reflect.Method;

public class Reflection {

	public static void main(String[] args)  {
		
		try {
			Class cls = Class.forName("exam08.Exam");		
			Method[] m = cls.getDeclaredMethods();//clas안에 있는 선언된 함수 다 갸져오기
			for(int i = 0; i < m.length; i++) {
				//System.out.println(m[i].toString());
			}	
			Exam e = (Exam)cls.newInstance();//new로 새로 상속받지 않아도 됨
			//e.print();
			Method pMethod = cls.getMethod("print", String.class);
			pMethod.invoke(e, "룰룰룰");
			
		}catch (Exception ec) {
			System.out.println(ec);
		}
	}	
}
