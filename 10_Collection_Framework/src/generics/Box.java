package generics;

import java.util.ArrayList;

public class Box<T> {
// public class Box<T extends Fruit> // 이렇게 하면 Toy는 못 씀
	// <T>: Type의 약어 Box라는 클래스가 어떤 Type을 품고 있다
	// <E>: Element의 약어
	
	ArrayList<T> list = new ArrayList<>();
	void add(T item) {
		list.add(item);
	}
	
	T get(int idx) {
		return list.get(idx);
	}
	
	int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
}
