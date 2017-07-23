package exam05;

/*Object는 모든변수에 상속되어 있기 때문에 따로 데이터 타입을 선언해주지 않을경우 모두 Object로 받음
하지만 Object는 용량이크고 속도를 느리게 한다.*/

import java.util.ArrayList;
import java.util.HashMap;

public class ObjectExam {

	public static void main(String[] args) {
		Object o ="asdf";
		o = new HashMap();
		o = new ArrayList<String>();
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("라라라");
		//al2.add(1);  //ArrayList<String> 라고 선언해줘서 int 타입이 들어갈수 없음
		String str =new String("123");
		String str2 = new String("123");  //str과 값이 같기때문에 str의 주소값을 보냄
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str == str2);  //주소값을 비교
		System.out.println(str.equals(str2)); //값을 비교
		
		
		
		
	}
}
