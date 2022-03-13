package generics;

import java.util.HashMap;
import java.util.Map;

public class FreashStore {

	public static void main(String[] args) {
		// <K, V>: <Key, Value>
		Map<String, Box<? extends Fruit>> map = new HashMap<>();	// ?: 와일드카드
		map.put("AppleBox", new Box<Apple>());
		map.put("OrangeBox", new Box<Orange>());
		
		// <> 안을 모두 Fruit으로 바꿔주면 가능하긴 함
		
		
	}

}
