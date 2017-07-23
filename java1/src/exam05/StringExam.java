package exam05;

public class StringExam {
	
	String str ="123";
			
	public static void main(String[] args) {
		StringExam se = new StringExam();
		String str2 ="123";  //str 의 값을 그대로 받아옴 static 개념
		String str3 = new String("123");
		String str4 ="123"; //str 의 값을 그대로 받아옴 static 개념
	
	System.out.println(se.str == str2);
	System.out.println(se.str == str3);  //new로 다시 생성해줄 경우 주소값을 비교
	System.out.println(se.str == str4);
	System.out.println(str2 == str4);
	
	}
}
