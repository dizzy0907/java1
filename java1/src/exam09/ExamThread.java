package exam09;

/*Thread
시작순서는 있지만 프로그램이 먼저 실행한다는 조건이 없음

*/

public class ExamThread extends Thread{
	
	int threadId;
	
	public ExamThread(int threadId) {		
		this.threadId = threadId;
	}
	
	public void run() {		
		System.out.println("난" + this.threadId +"쓰레드의 시작점이야");
		try {
			int time = (int)(Math.random()*3000)+1;
			Thread.sleep(time);  //1000 = 1초
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("난" + this.threadId +"쓰레드의 종료점이야");
	}
	
	public static void main(String[] args)  {
		System.out.println("프로그램 시작시점");
		ExamThread eh1 = new ExamThread(1);
		ExamThread eh2 = new ExamThread(2);
		ExamThread eh3 = new ExamThread(3);
		ExamThread eh4 = new ExamThread(4);
		ExamThread eh5 = new ExamThread(5);	
		eh1.start();
		eh2.start();
		eh3.start();
		eh4.start();
		eh5.start();
		System.out.println("프로그램 종료시점");
	}
}
