package basic;

public abstract class Electronic {	// 전자제품 개념의 클래스
	protected boolean power;	// 상속의 경우일 때 부모가 주기로 맘먹은 경우에만 protected
	protected int button;
	protected String feature;
	
	public Electronic() {
	}
	
	abstract void buttonColor(String color);
	// 추상클래스는 객체화가 안되는 대신
	// 어떤 기능을 하는 메서드를 제시 할 수 있다
	// 단, {}로 구현영역은 할 수 없음
	
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getButton() {
		return button;
	}
	public void setButton(int button) {
		this.button = button;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
}
