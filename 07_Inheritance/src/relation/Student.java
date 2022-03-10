package relation;

public class Student extends Person {
	private String[] subjects;
	
	public Student() {
		// super();	// 부모 생성자 부르는 키워드	없어도 있는것처럼 보고 출력함
		// super나 this는 젤 위에 있어야 한다. 객체를 생성하고 리소스를 받는 순서이기 때문에
		System.out.println("This is Student Instance");
	}
	
	public void printSubjects() {
		System.out.println(name + "학생의 수강과목 리스트");
		for (String subject : subjects) {
			System.out.println("수강과목: " + subject);
		}
	}

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}
	
}
