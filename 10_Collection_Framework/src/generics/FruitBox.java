package generics;

public class FruitBox {

	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<>();
		Box<Apple> appleBox = new Box<>();
		Box<Toy> toyBox = new Box<>();
		
		// Box<Apple> appleBox2 = new Box<Orange>();	// err, Generic에 의한 타입제한
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Orange());	// 상속된 클래스도 가능
		fruitBox.add(new Apple());
		// fruitBox.add(new Toy());	// Fruit 타입과 연관성이 없으므로 err
		
		// toyBox.add(new Apple());	// Toy 타입과 연관성이 없으므로 err
		
		
	}

}
