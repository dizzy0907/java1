package exam05;

import java.util.ArrayList; //ctrl + shift + o
import java.util.HashMap;

/*List - ��� 
      - �氹�� ���� �ʿ� ��
      - ��� ������ Ÿ�� �ٵ�
      - �޸𸮸� ���� ��Ƹ���
      - ���� ������ Ÿ���� ��� ���� ������� �⺻������ ������ Ÿ���� object�� �Ǿ� ��� Ÿ���� �ٵ�� �� �� �ִ�. */

/*HashMap -Key, Value*/

public class ListExam {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("��","����");
		hm.put("��","����");
		
		ArrayList<HashMap<String, String>> al = new ArrayList<HashMap<String, String>>();		
		al.add(hm);
		
		HashMap<String, ArrayList<String>> hm2 = new HashMap<String, ArrayList<String>>();
		//hm2.put("������", new  ArrayList<String>());
		
		ArrayList<String> al2 = new  ArrayList<String>();
		al2.add("a");
		al2.add("s");
		al2.add("d");
		System.out.println(al2);
		hm2.put("������", al2);
		
		System.out.println(hm2.get("������"));
		
/*
		for(int i = 1; i <= 5; i++) {
			al.add(i);
		}
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	
		System.out.println(al);*/
		
		System.out.println(al);
		System.out.println(hm.get("��"));
		
		
		
		
	}
}
