package exam02;

public class Person {
	String name;
	String address;
	String job;
	
	public void doJob() {
		System.out.println(name + "님이 " + job + "을 하고 있습니다.");
	}
	
	public Person(String name, String job) {
		
		this.name = name;
		this.job = job;
	}

	public static void main(String[] args) {
		
		Person p = new Person("홍길동", "도적질");		
		p.doJob();
	}
}
