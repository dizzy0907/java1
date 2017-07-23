package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class DataExam {

	public static void main(String[] args) {
		String data = "김가,12,다다다/";
		data += "정라,34,바바바/";
		data += "오사,56,자자자/";
		data += "송차,78,타타타/";
		String[] datas = data.split("/");		
		ArrayList<HashMap<String,String>> dataList = new ArrayList<HashMap<String,String>>();
		
		for(int i =0; i <datas.length; i++) {
		String[] inDatas = datas[i].split(",");
		HashMap<String,String> hm = new HashMap<String,String>();		
		for(int j =0; j <inDatas.length; j++) {
			if(j == 0) {
				hm.put("이름",inDatas[j]);
			}else if(j == 1) {
				hm.put("나이",inDatas[j]);
			}else if(j == 2) {
				hm.put("주소",inDatas[j]);				
			}
		}
		dataList.add(hm);
	}
		System.out.println(dataList);
		
		for(HashMap hm : dataList) {  //dataList를 ArrayList<HashMap>로 받았기 때문에 이클립스에서 알아서 0부터 구동되게끔 만들어줌. 방식이 hashMap으로 해야 가능(for(int i = 0; i < dataList.size(); i++){HashMap hm; dataList(hm.get(i)) ~~~ 이부분이 생략된거임
			System.out.println("이름" +hm.get("이름"));
			System.out.println("나이" + hm.get("나이"));
			System.out.println("주소" + hm.get("주소"));
			System.out.println("============");
		}
	}
}
