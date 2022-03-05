package loops;

import java.util.Scanner;

public class LoopsQuiz {

	public static void main(String[] args) {
		// Q1. for문을 활용하여 x의 y승을 구하세요
		
		// Q2. 3자리 이상의 정수 L, 정수 a, 정수 b를 입력받아
		//		L까지 a, b의 배수 갯수를 구하세요
		
		// Q3. 음수나 0을 입력할때까지 숫자를 계속 입력받고
		// 		음수나 0이 입력되면 지금까지 입력된 수의 총합과 평균을 구하세요
		
		// Q4. 컴퓨터가 랜덤으로 1~100 사이의 정수를 정하면
		// 		맞추는 게임을 구현하세요 
		// 		컴퓨터의 수보다 높은 수를 입력하면 > 더 낮은 수를 입력하세요
		//		컴퓨터의 수보다 낮은 수를 입력하면 > 더 높은 수를 입력하세요
		
		// Q5. (Optional)
		//		다음과 같이 출력되도록 하세요
		// 		ABCDEFGHIJKLMNOPQRSTUVWXYZ
		// 		ABCDEFGHIJKLMNOPQRSTUVWXY
		// 		ABCDEFGHIJKLMNOPQRSTUVWX
		// 		ABCDEFGHIJKLMNOPQRSTUVW
		// 		ABCDEFGHIJKLMNOPQRSTUV
		// 		ABCDEFGHIJKLMNOPQRSTU
		// 		ABCDEFGHIJKLMNOPQRST
		// 		ABCDEFGHIJKLMNOPQRS
		// 		ABCDEFGHIJKLMNOPQR
		// 		ABCDEFGHIJKLMNOPQ
		//		.....
		//		....
		// 		...
		//		A
		
		// 01.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("X 값을 입력하세요");
		int x = sc.nextInt();
		System.out.println("Y 값을 입력하세요");
		int y = sc.nextInt();
		
		int result = 1;
		
		for (int i = 0; i < y; i++) {
			result *= x;
		}
		System.out.println(x+"의 "+y+"승은 "+result+"입니다");
		
		// 또는 double result2 = Math.pow(x, y); // pow는 double을 요구함
		// System.out.println(x+"의 "+y+"승은 "+(int)result2+"입니다");
		
		// 02.
		// Scanner sc = new Scanner(System.in);
		System.out.println("한계값 입력(3자리 이상) >");
		int limit = sc.nextInt();
		
		System.out.println("첫번째 정수 입력 > ");
		int a = sc.nextInt();
		System.out.println("두번째 정수 입력 >");
		int b = sc.nextInt();
		
		int count = 0;
		
		for (int j = 0; j < limit+1; j++) {
			if(j % a == 0 || j % b == 0) {
				System.out.println(j+" ");
				count++;
			}
		}
		System.out.println("\n"+limit+"까지의 "+a+"또는 "+b+"의 배수 갯수는 "+count+"개입니다");
		
		// 03.
		// Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int total = 0, count2 = 0;
		
		while (flag) {
			System.out.println("정수 입력, 0이하의 수를 입력하면 종료됩니다 >");
			int num = sc.nextInt();
			if (num <= 0) {
				flag = false;
			} else {
				total += num;
				count2++;
			}
		}
		System.out.println("입력한 수의 총합: "+total);
		System.out.println("입력한 수의 갯수:"+count2);
		System.out.println("평균: "+(double)total/count2);
		// double로 하지 않으면 만약 total = 10, count = 4 일 때 2.5가 안나오고 2가 나옴
				
		// 04.
		int comNum = (int)(Math.floor(Math.random()*100))+1;
		System.out.println("컴퓨터가 랜덤 숫자를 정했습니다(1~100)");
		// Scanner sc = new Scanner(System.in);
		
		boolean flag2 = true;
		int count3 = 0;
		while(flag2) {
			System.out.println("숫자를 입력해 주세요 > ");
			int myNum = sc.nextInt();
			
			if (comNum == myNum) {
				System.out.println("맞추셨네요 > 컴퓨터의 숫자: "+comNum);
				flag = false;	// 또는 while(true)로 하고 여기에 break;하면 됨
			} else {
				if (comNum > myNum) {
					System.out.println("더 큰 숫자를 입력하세요");
				} else {
					System.out.println("더 작은 숫자를 입력하세요");
				}
				count3++;
			}
			System.out.println(("시도횟수: "+count3+"회"));
		}
		
		// 05.
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int k = 0; k < 26; k++) {
			System.out.print(str.substring(0, str.length()-k));
		}
		System.out.println("==========================");
		
		for (int l = 0; l < 26; l++) {
			char aa = 'A';
			for (int m = 0; m < 26 - l; m++) {
				System.out.print((char)(aa+m));
			}
			System.out.println();
		}
	}

}