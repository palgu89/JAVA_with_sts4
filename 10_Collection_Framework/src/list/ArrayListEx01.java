package list;

import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		
		// ArrayList 클래스를 이용해서 list(집합객체)를 생성
		// 기존 자바의 배열과 달리 동적 배열이라고 생각하자
		ArrayList list1 = new ArrayList();
		list1.add(1);	// 1을 넣어도 타입이 Object임
		// list1.add(new Integer(1));	// 위와 동일한데 자바9부터 deprecated
		list1.add(43);
		list1.add(15);
		list1.add(23);
		list1.add(34);
		
		for (int i = 0; i < list1.size(); i++) {	// 길이는 length가 아니라 size()메서드 사용
			System.out.println("index " + i + ": " + list1.get(i));
		}
		System.out.println(list1);	// [1, 43, 15, 23, 34]
		
		System.out.println("43 포함여부: " + list1.contains(43));
	}

}
