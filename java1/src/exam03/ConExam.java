package exam03;

/* ������ �Լ��� Ȱ��*/
// ������ Ÿ��, return�� �ʿ� ����
// class�� �̸��� ���� �Ȱ��ƾ���
// �̺κ��� �ݵ�� ������ �Ǵ� ������ �����t.(1ȸ�� ������ ȣ��Ǹ� �ϵ�)
//   -ex ) "ȸ�������� �ϴµ� �ݵ�� ���ɴ븦 Ȯ���ؾ���." �� ��� �����ڿ��� ���ɴ� Ȯ�� ������ �־ ���.
// �迭������ ����


public class ConExam {
	
	int age = 30;
	String name = "��浿";
	
	public ConExam(int age, String name) {
		/* ������ �Լ� */
		this.age = age;
		this.name = name;
		
		if(age <20 ) {
			System.out.println("10��");
		}
		else if(age >= 20 && age < 30 ) {
			System.out.println("20��");
		}
		else if(age >= 30 && age < 40 ) {
			System.out.println("30��");
		}
		else if(age >= 40 && age < 50 ) {
			System.out.println("40��");
		}
		else if(age >= 50 && age < 60 ) {
			System.out.println("50��");
		}
		else
			System.out.println("60��");
		
	}
	
	public static void main(String[] args) {
		
		ConExam ce = new ConExam(59, "ȫ�浿"); /* ������ �Լ� ȣ�� */
	}

}
