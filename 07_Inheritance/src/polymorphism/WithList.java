package polymorphism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class WithList {

	// 다형성을 이용하면 여러타입의 하위객체들을 통일된 상위객체의 타입으로 이용할 수 있다
	// 상위객체가 완벽하게 구성이 되면 보증된 형태로 하위객체에서 사용할 수 있기 때문에 다형성을 사용한다
	// 아래의 코드 처럼 타입마다 검증하는 로직이 필요가 없게 되어 코드량을 획기적으로 줄일 수 있다
	
	public static void main(String[] args) {
		List list = new ArrayList();
		List linkedList = new LinkedList();
		List vector = new Vector();
		List stack = new Stack();
		
		list.add(linkedList);
		list.add(linkedList);
		list.add(vector);
		list.add(stack);
		
		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i) instanceof ArrayList) {
//				ArrayList al = list.get(i);
//			}else if (list.get(i) instanceof LinkedList) {
//				LinkedList ll = list.get(i);
//			}
			List el = (List)list.get(i);
		}
	}

}
