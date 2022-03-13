package list;

import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		strList.add("A");
		strList.add("B");
		strList.add("C");
		strList.add(1, "A-1");	// index 1 자리에 A-1을 끼워넣겠다 => B가 뒤로 밀린다

		System.out.println(strList);	// [A, A-1, B, C]
		
		// list 자르기 => sublist(start idx, last idx) => start부터 last 전까지 출력
		ArrayList<String> strList2 = new ArrayList<String>(strList.subList(2, 4));
		System.out.println(strList2);
		
		strList.addAll(strList.size(), strList2);	// strList의 제일 뒤에 strList2를 더하겠다
		// strList.addAll(strList2) 는 위의 strList.size()가 생략된 형태
		strList.addAll(1, strList2);	// idx 1에 strList2를 끼워 넣음
		System.out.println(strList);	// [A, B, C, A-1, B, C, B, C]
		
		strList.retainAll(strList2);	// 두 리스트에서 겹치는 것을 제외하고 strList에서 삭제
		System.out.println(strList);	// [B, C, B, C, B, C]
		
		// 리스트 내에 다른 리스트의 요소가 모두 포함 되어 있는지 여부 판단
		System.out.println(strList.containsAll(strList2));
		
		strList2.remove(1);
		System.out.println(strList2);	// idx 1을 지움 => [B]
		
		strList.clear();	// 모든 요소 삭제 []만 출력
		System.out.println(strList);
		System.out.println(strList == null);	// false => 객체는 존재
		System.out.println(strList.size() == 0);	// true
		System.out.println(strList.isEmpty());	// true
		
		// replace는 없고 remove한 뒤 add해줘야 한다
	}

}
