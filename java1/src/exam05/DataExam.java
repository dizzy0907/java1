package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class DataExam {

	public static void main(String[] args) {
		String data = "�谡,12,�ٴٴ�/";
		data += "����,34,�ٹٹ�/";
		data += "����,56,������/";
		data += "����,78,ŸŸŸ/";
		String[] datas = data.split("/");		
		ArrayList<HashMap<String,String>> dataList = new ArrayList<HashMap<String,String>>();
		
		for(int i =0; i <datas.length; i++) {
		String[] inDatas = datas[i].split(",");
		HashMap<String,String> hm = new HashMap<String,String>();		
		for(int j =0; j <inDatas.length; j++) {
			if(j == 0) {
				hm.put("�̸�",inDatas[j]);
			}else if(j == 1) {
				hm.put("����",inDatas[j]);
			}else if(j == 2) {
				hm.put("�ּ�",inDatas[j]);				
			}
		}
		dataList.add(hm);
	}
		System.out.println(dataList);
		
		for(HashMap hm : dataList) {  //dataList�� ArrayList<HashMap>�� �޾ұ� ������ ��Ŭ�������� �˾Ƽ� 0���� �����ǰԲ� �������. ����� hashMap���� �ؾ� ����(for(int i = 0; i < dataList.size(); i++){HashMap hm; dataList(hm.get(i)) ~~~ �̺κ��� �����Ȱ���
			System.out.println("�̸�" +hm.get("�̸�"));
			System.out.println("����" + hm.get("����"));
			System.out.println("�ּ�" + hm.get("�ּ�"));
			System.out.println("============");
		}
	}
}
