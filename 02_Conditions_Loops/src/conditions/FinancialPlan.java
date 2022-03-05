package conditions;

import java.util.Iterator;
import java.util.Scanner;

public class FinancialPlan {

	public static void main(String[] args) {
		// 1. 꼭 구매하고 싶은 것 입력 받기. 예) 아파트, 자동차, 등등...
		// 2. 구매할 대상의 가격 입력 받기
		// 3. 미래에 수령할 월급 입력 받기 => 현실적으로 입력
		// 4. 월급의 몇 %를 저축할지? => 현실적으로 입력
		// 5. 대상을 구매하기 위해 소요되는 기간 구하기 (월, 년 상관 없음)
		// 6. 연 이율은 적금을 기준으로 2.5%로 가정

		Scanner sc = new Scanner(System.in);
		System.out.println("뭘 사고 싶으세요?");
		String buy = sc.next();
		System.out.println("사고 싶은 것의 가격은 얼마에요?");
		int howMuch = sc.nextInt();
		System.out.println("월급은 얼마 받으실거세요?");
		int salary = sc.nextInt();
		System.out.println("거기서 얼마나 저축하실거세요?(%)");
		double save = sc.nextDouble();
		
		// 선생님이 구한 식
		double bankRate = 2.5 / 100 / 12;

		// 내가 구한 식: myMoney = (float) (salary * (save / 100) * Math.pow(1.025, n));
		
		// 총수령액(T) = (월납입금(A) X 납입월[n]) + (월납입금(A) X (납입월[n] * (납입월[n]+1)/2) X (연이율[r]/12)) => 단리적금계산식
		// T = (A * n) + (A * (n * (n + 1) / 2) * (r / 12))
		
		double t = 0;
		int n = 0;
		final double A = salary * (save / 100);	// final은 js의 const느낌
		
		do {
			t = (A * n) + (A * (n * (n +1) / 2) * bankRate);
			n++;
		} while (t < howMuch);
		System.out.println(buy + "을 구매하기 위해 필요한 최소 저축 개월수: "+ n + "개월");
	}
}
