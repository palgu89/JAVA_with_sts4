package printEx;

import java.util.Scanner;

public class MyInfo {

	public static void main(String[] args) {
		String name = "son";
		int age = 29;
		float height = 177.5f;
		double weight = 89.82;
		char blood = 'O';
		boolean vachine = true;
		long asset = 2148000000L;
		String description = "현재는 Open API 강의중";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("다음 멤버의 정보를 입력하세요");
		System.out.println("이름 > ");
		name = sc.next();
		System.out.println("나이 > ");
		age = sc.nextInt();
		System.out.println("키 > ");
		height = sc.nextFloat();
		System.out.println("몸무게 > ");
		weight = sc.nextDouble();
		System.out.println("혈액형 > ");
		blood = sc.next().charAt(0);	// 입력값 중 첫번째 것만 받겠다
		System.out.println("백신접종여부 > ");
		vachine = sc.nextBoolean();
		System.out.println("자산 > ");
		asset = sc.nextLong();	// 괄호 안에 10을 넣으면 10진수로 표현
		System.out.println("부가정보 > ");
		description = sc.nextLine();
		
		// c 언어에서 사용하는 포맷형
		System.out.printf("%s, %d, %f, %f, %s, %s, %d, %s", name, age, height, weight, blood, vachine, asset, description);
		
		char ch1 = 65;	// char를 왜 한글자만 되게끔 했을까를 예상했을 때 아스키코드때문이 아닐까로 예상한다.
		char ch2 = 97;	// 메모리 사용이 숫자가 문자보다 적기 때문에 연산에 용이하려고 그렇지 않을까 싶다
		System.out.println(ch1);	// A
		System.out.println(ch2);	// a
	}

}
