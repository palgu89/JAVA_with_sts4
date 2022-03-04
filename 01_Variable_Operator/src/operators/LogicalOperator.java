package operators;

public class LogicalOperator {

	public static void main(String[] args) {	// 만들 때 실수로 alt + v 를 하지 않았다면 이게 안 생김 => main을 치면 바로 나온다
		System.out.println("논리연산자 => 리턴은 boolean");
		System.out.println("!, &&, ||");
		
		System.out.println(true && false);
		System.out.println(false || true);
		System.out.println(!false);
	}
}
