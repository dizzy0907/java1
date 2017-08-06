package exam09;

import java.util.ArrayList;
import java.util.List;

public class HorseGame  extends Thread{

	public Horse h;
	static int idx = 0;  //static으로 했기때문에 한 메모리공간에 한값만 저장(만약 static가 아닐 경우 각각의 메모리 공간을 설정해 각각의 값을 넣기때문에 매번 1등이 나옴
	
	public HorseGame(Horse h) {
		this.h = h;
	}
	
	public void run() {
		h.startHorse();
		try {
			Thread.sleep(h.speed);
			h.runningHorse();
		}catch(Exception e) {
			e.printStackTrace();
		}
		h.endHorse(++idx);
	}	
	
	public static void main(String[] args)  {
		String[] horseNames = {"가가","나나","다다","라라","마마"};		
		List<HorseGame> horseList = new ArrayList<HorseGame>();
		for(int i = 0; i <horseNames.length; i++) {
			int speed = (int)(Math.random()*3000) + 1000;
			 Horse h = new Horse(speed, horseNames[i]);
			 HorseGame hg = new HorseGame(h);
			 hg.start();
			 horseList.add(hg);
		}
		for(HorseGame hg :horseList)		{
			try {
				hg.join();  //상위쓰레드 동일쓰레드 하위쓰레드를 묶어 놓는 개념
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("경기가 종료되었습니다.");
	}
}
