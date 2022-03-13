package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetEx01 {

	public static void main(String[] args) {
		// 중복된 값 없이 저장
		Set set = new HashSet();
		int count = 0;
		
		for (int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*10)+1;
			set.add(num);
			count++;
		}
		
		System.out.println(count);
		System.out.println(set);
		
		// set은 정렬이 안되기 때문에 정렬하려면 list에 넣은 뒤 정렬한다
		List list = new LinkedList(set);
		Collections.sort(list);
		
		System.out.println(list);
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(set);
//		}
	}

}
