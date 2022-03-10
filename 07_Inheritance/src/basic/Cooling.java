package basic;

public class Cooling {

	public static void main(String[] args) {
		// 냉장고를 제작하기 위한 시작점
		
		// Electronic elec = new Electronic();
		Electronic elec = new Dimchae();
		System.out.println(elec.getButton());	// 0
		
		// Cooler cooler = new Cooler();
		// Cooler cooler = new Dimchae();
		Electronic cooler = new Dimchae();
		// Freezer freezer = new Freezer();
		Electronic freezer = new Dimchae();
		
		// KimchiRef kimchi = new KimchiRef();
		// KimchiRef kimchi = new Dimchae();
		Electronic kimchi = new Dimchae();
		System.out.println(kimchi.isPower());	// false KimchiRef의 isPower를 주석처리 했지만 false가 뜬다
		
		System.out.println(kimchi.getButton());	// 0 
		kimchi.setButton(3);
		System.out.println(kimchi.getButton());	// "발효버튼 추가" \n 3 
		
		// 19번 라인까지는 상속을 통한 다형성 구현, 다형성을 통한 상속으로 입증되는 리소스 검증
		
		Electronic dim1 = new Dimchae();
		System.out.println(dim1.getButton());
		
		// Electronic dim2 = new Dimchae();
		// Electronic dim3 = new Dimchae();
		KimchiRef dim2 = new Dimchae();
		Freezer dim3 = new Dimchae();
		
		// Electronic dim4 = new Dimchae();
		Cooler dim4 = new Dimchae();
		System.out.println(dim4.isPower());
		
		dim4.setButton(3);
		System.out.println(dim4.getButton());
		// 37번 라인까지는 추상클래스를 활용한 느슨한연결을 상속을 통해서 구현
		// 추상클래스는 객체로 인스턴스를 만들수가 없기 때문에 구현되었을 때 문제가 되는 위험은 줄어듦
		// 테스트용 객체를 여러 개념이 도입된 방식을 만들 때 편하게 사용할 수 있음
		
		// Electronic에 객체를 생성함 => 추상클래스라 객체화가 될 수 없음
		// Electronic elec2 = new Electronic(); 은 에러남
		Electronic elec2 = new Electronic() {	// 근데 이건 괜찮음
			// Electronic 객체 안에 있는 생성자의 이름을 빌려 밖에서 그 클래스의 역할을 할 수 있게끔 메서드를 만들 수 있음
			// 밖에 나와서 객체노릇하는 중
			int age = 0;
			
			public int getAge() {
				return age;
			}
			
			public void setAge(int age) {
				this.age = age;
			}

			@Override
			void buttonColor(String color) {
				// TODO Auto-generated method stub
				
			}
			
			
		};
	}

}
// 상속의 목적
// 코드의 효율적인 재활용
// 다형성 - 잘 설계된 클래스를 이용해서 보증된 형식을 만들어냄
//			클래스 하나 잘 만들어 놓으면 상속된 클래스에 갖다 쓰기 용이
//			한계는 상속된 클래스에 새로운 메서드를 넣을 때 다형성은 무용지물
//			그래서 implement가 나왔다
