package exam05;

/*Object�� ��纯���� ��ӵǾ� �ֱ� ������ ���� ������ Ÿ���� ���������� ������� ��� Object�� ����
������ Object�� �뷮��ũ�� �ӵ��� ������ �Ѵ�.*/

import java.util.ArrayList;
import java.util.HashMap;

public class ObjectExam {

	public static void main(String[] args) {
		Object o ="asdf";
		o = new HashMap();
		o = new ArrayList<String>();
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("����");
		//al2.add(1);  //ArrayList<String> ��� �������༭ int Ÿ���� ���� ����
		String str =new String("123");
		String str2 = new String("123");  //str�� ���� ���⶧���� str�� �ּҰ��� ����
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str == str2);  //�ּҰ��� ��
		System.out.println(str.equals(str2)); //���� ��
		
		
		
		
	}
}
