package basic;

public abstract class Freezer extends Cooler{	// 아이싱 개념 클래스
	@Override
	public boolean isPower() {	// alt + shift + s => Override/Implement Method
		return super.isPower();	// super: 부모 클래스(electronic)를 의미한다
	}

	@Override
	public int getButton() {
		// return super.getButtons();
		return super.button;	// protected로 바꿨기 때문에 this가 아니라 super
		// return this.button;	// 김치냉장고는 버튼이 다르니 자기꺼 쓰겠다
		// 내부 메서드만 빌려 쓰고 메서드를 재정의(Override)함
		// cf. overloading(중복정의): 메서드 이름은 같은데 파라미터가 달라서 기능이 다름
	}

	@Override
	public String getFeature() {
		// return super.getFeature();
		return super.feature;	// 김치냉장고 기능은 또 다르니 자기꺼 쓰겠다
	}

	@Override
	public String toString() {	// toString은 object에서 상속받은 메서드
		return "This is Freezer";
	}

	@Override
	public void setPower(boolean power) {
		super.power = power;
	}

	@Override
	public void setButton(int button) {
		System.out.println("냉동버튼 추가");
		super.button = button;
	}	// 주석처리해도 Electronic에 선언이 되어있기 때문에 Cooling에서 에러가 안난다

	@Override
	public void setFeature(String feature) {
		System.out.println("냉동과학 추가");
		super.feature = feature;
	}
	
}
