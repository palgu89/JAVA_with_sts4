package basic;

public class Dimchae extends KimchiRef{

	// Cooler도 상속받고 싶고, Freezer, KimchiRef도 상속받고 싶지만
	// extends(상속)는 한개의 부모클래스만 갖는다
	// 그렇다고 KimchiRef의 extends를 Freezer로 만들고 Freezer의 extends를 Cooler를 넣으면 상속관계 붕괴
	// 그래서 abstract(추상 클래스)를 써서 개념화를 시키자
	// 그럼 이제 직렬로 이어도 괜찮다
	
	// 추상 클래스에 메서드를 선언했다면 그 하위 클래스들은 무조건 메서드를 구현 해야 함
	// = 강제 오버라이딩
	@Override
	void buttonColor(String color) {
		// TODO Auto-generated method stub
		
	}
}
