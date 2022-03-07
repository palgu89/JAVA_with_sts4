package creation;

public class MakeMethod {

	public static void main(String[] args) {
		// 메서드는 반드시 이름을 갖는다
		// 사용중인 main 메서드를 분석해보자
		// [접근제한자] [저장특성] 리턴타입 메서드명([파라미터]) {메서드 실행 로직 영역}
		// []으로 감싼건 선택사항
		// void => 리턴을 하지 않는 메서드
		// 리턴타입이 존재하면 반드시 메서드 실행 로직 영역에
		// return 리턴 타입과 일치하는 데이터를 만들어야 한다
		// 파라미터 또한 데이터타입을 지정해주어야 함
		
		// 메서드명은 소문자로 시작할 것 => 클래스와 혼동 방지
		
		/* 메서드 모양의 예제
		 * void method1() {
		 * 자바의 메서드는 메서드 안에 선언 될 수 없어서 빨간줄이 뜬다 
		 * }
		 * 
		 * void method2(int i) {
		 * 
		 * }
		 * 
		 * int method3(String str, char ch) {
		 * 
		 * 	return 0; // int로 메서드를 선언하면 return값도 int여야함
		 * }
		 */
		
		// 메서드가 다른 메서드를 호출 할 때
		// 호출하려는 메서드가 static 속성이거나
		// 호출하려는 메서드를 갖고 있는 클래스의 주소값이 필요하다
		// => new를 통해 인스턴스화 된 객체 
	}

}
