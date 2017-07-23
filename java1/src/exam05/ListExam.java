package exam05;

import java.util.ArrayList; //ctrl + shift + o
import java.util.HashMap;

/*List - 기능 
      - 방갯수 정의 필요 없
      - 모든 데이터 타입 다됨
      - 메모리를 많이 잡아먹음
      - 따로 데이터 타입을 명시 하지 않을경우 기본적으로 데이터 타임은 object가 되어 모든 타입이 다들어 갈 수 있다. */

/*HashMap -Key, Value*/

public class ListExam {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("가","가마");
		hm.put("나","나비");
		
		ArrayList<HashMap<String, String>> al = new ArrayList<HashMap<String, String>>();		
		al.add(hm);
		
		HashMap<String, ArrayList<String>> hm2 = new HashMap<String, ArrayList<String>>();
		//hm2.put("가가가", new  ArrayList<String>());
		
		ArrayList<String> al2 = new  ArrayList<String>();
		al2.add("a");
		al2.add("s");
		al2.add("d");
		System.out.println(al2);
		hm2.put("가가가", al2);
		
		System.out.println(hm2.get("가가가"));
		
/*
		for(int i = 1; i <= 5; i++) {
			al.add(i);
		}
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	
		System.out.println(al);*/
		
		System.out.println(al);
		System.out.println(hm.get("가"));
		
		
		
		
	}
}
