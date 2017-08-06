package exam09;

/*Thread
���ۼ����� ������ ���α׷��� ���� �����Ѵٴ� ������ ����

*/

public class ExamThread extends Thread{
	
	int threadId;
	
	public ExamThread(int threadId) {		
		this.threadId = threadId;
	}
	
	public void run() {		
		System.out.println("��" + this.threadId +"�������� �������̾�");
		try {
			int time = (int)(Math.random()*3000)+1;
			Thread.sleep(time);  //1000 = 1��
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("��" + this.threadId +"�������� �������̾�");
	}
	
	public static void main(String[] args)  {
		System.out.println("���α׷� ���۽���");
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
		System.out.println("���α׷� �������");
	}
}
