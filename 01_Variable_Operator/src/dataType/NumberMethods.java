package dataType;
class TestString {
	
}

public class NumberMethods {

	public static void main(String[] args) {
		int num = -1024;
		
		// 반올림
		System.out.println(Math.round(1024.56));	// 1025
		
		// 절대값
		System.out.println(Math.abs(num));
		
		// 최댓값, 최솟값
		System.out.println(Math.max(1024, num));
		System.out.println(Math.min(1024, num));
		
		// 실수가 가질 수 있는 정수값
		System.out.println(Math.ceil(1024.16));	// 올림. 1025.0
		System.out.println(Math.floor(1024.56));	// 1024.0
		System.out.println(Math.floor(-1024.56));	// -1025.0
		
		// 제곱
		System.out.println(Math.pow(2, 10));	// 1024.0
		
		// 루트
		System.out.println(Math.sqrt(144));	// 12.0
		
		// 랜덤
		System.out.println(Math.random());	// 0 ~ 1 사이의 실수
		System.out.println((int)Math.floor(Math.random()*45)+1);	// 1 ~ 45 랜덤정수
		
		// log => 어떤 특정한 수를 1로 만들기 위해 필요한 나누기 횟수
		System.out.println(Math.log(1024.56));
		System.out.println(Math.log10(1024.56));
		System.out.println(Math.log1p(1024.56));
		
	}

}
