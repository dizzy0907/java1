package exam02;

public class StringArray {

	public static void main(String[] args) {
		
		String[] arrStr = new String[5];
		arrStr[0] = "a";
		
		for(int i = 0; i < arrStr.length; i++) {
			arrStr[i] = "" + (i + 1);  // 숫자형을 문자형으로 형변환(문자형 + 숫자형 = 문자형)
		}
		
		for(int i = 0; i < arrStr.length; i++) {
			System.out.println(arrStr[i]);
		}	
	}
}
