package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member {
	String name;
	int age;
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + " : " + age;
	}
}

public class SetEx02 {

	public static void main(String[] args) {
		// Set set = new HashSet();
		// 이렇게만 쓰면 보증이 되지 않아 for에서 받질 못함
		
		Set<Member> set = new HashSet<>();
		
//		set.add("java");
//		set.add("java");
		// 값이 중복 되기 때문에 하나만 출력
		
		set.add(new Member("Park", 40));
		// set.add(new Member("Park", 40));
		// hashCode()의 값을 가져다 쓰기 때문에 둘 다 출력
		set.add(new Member("Park", 41));
		set.add(new Member("Park", 42));
		set.add(new Member("Park", 43));
		
		System.out.println(set);
		
		for (Member member : set) {
			System.out.println(member.toString());
			// 40 ~ 43을 순서대로 출력해주지 않고 랜덤으로 출력해 줌
		}
		
		// set과 비슷하나 다음 요소가 존재(순서)하냐고 물어 볼 때 사용
		// set은 다음요소의 개념이 없어서 출력하면 랜덤으로 나옴
		Iterator<Member> iterator = set.iterator();
		while (iterator.hasNext()) {
			Member member = (Member) iterator.next();
			System.out.println(member);
		}
	}

}
