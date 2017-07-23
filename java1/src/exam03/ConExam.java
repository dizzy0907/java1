package exam03;

/* 생성자 함수와 활용*/
// 데이터 타입, return이 필요 없음
// class와 이름이 완전 똑같아야함
// 이부분은 반드시 실행이 되는 로직이 들어가야햠.(1회용 로직은 호출되면 암됨)
//   -ex ) "회원가입을 하는데 반드시 연령대를 확인해야함." 일 경우 생성자에게 연령대 확인 로직을 넣어서 사용.
// 배열변수도 가능


public class ConExam {
	
	int age = 30;
	String name = "고길동";
	
	public ConExam(int age, String name) {
		/* 생성자 함수 */
		this.age = age;
		this.name = name;
		
		if(age <20 ) {
			System.out.println("10대");
		}
		else if(age >= 20 && age < 30 ) {
			System.out.println("20대");
		}
		else if(age >= 30 && age < 40 ) {
			System.out.println("30대");
		}
		else if(age >= 40 && age < 50 ) {
			System.out.println("40대");
		}
		else if(age >= 50 && age < 60 ) {
			System.out.println("50대");
		}
		else
			System.out.println("60대");
		
	}
	
	public static void main(String[] args) {
		
		ConExam ce = new ConExam(59, "홍길동"); /* 생성자 함수 호출 */
	}

}
