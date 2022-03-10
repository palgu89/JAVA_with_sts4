package relation;

public class RelationMain {

	public static void main(String[] args) {
		Person p = new Person();
		p.setNum(1);
		p.setName("person");
		p.setDept("dept");
		p.setAddr("addr");
		p.printInfo();
		System.out.println("===================");
		
		Professor pf = new Professor();
		pf.setNum(2);
		pf.setName("김교수");
		pf.setDept("컴퓨터공학");
		pf.setAddr("경기도 인천");
//		String[] subjects = new String[3];
//		subjects[0] = "전산학개론";
//		subjects[1] = "C 프로그래밍";
//		subjects[2] = "JAVA 프로그래밍";
//		
//		pf.setSubjects(subjects);
		
		pf.setSubjects(new String[] {"전산학개론", "C 프로그래밍", "JAVA 프로그래밍"});
		pf.printInfo();
		pf.printSubjects();
		System.out.println("===================");
		
		Student std = new Student();
		std.setNum(3);
		std.setName("이코딩");
		std.setDept("컴퓨터공학");
		std.setAddr("서울 강남구");
		std.setSubjects(new String[] {"JAVA 프로그래밍", "운영체제", "알고리즘"});
		std.printInfo();
		std.printSubjects();
		System.out.println("===================");
		
		Staff stf = new Staff();
		stf.setNum(4);
		stf.setName("박행정");
		stf.setDept("HR");
		stf.setAddr("경기도 성남");
		stf.setJob("인사관리");
		stf.printInfo();
		stf.printJob();
		
		// Person으로 선언하면 setJob과 printJob은 에러난다 => 상속의 한계점
	}

}
