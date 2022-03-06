package quiz;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// 3.
		// 숫자 야구 게임

		 Scanner sc = new Scanner(System.in);
		String[] comBbNum = new String[3]; 			
		for (int i = 0; i < 3; i++) {
			String bbRanNum = Integer.toString((int)(Math.floor(Math.random()*9))+1);
			comBbNum[i] = bbRanNum;
		}
		for (int j = 0; j < comBbNum.length-1; j++) {
			for (int k = j+1; k < comBbNum.length; k++) {
				if (comBbNum[j] == comBbNum[k]) {
					comBbNum[k] = Integer.toString((int)(Math.floor(Math.random()*9))+1);
				}							
			}
		}
		
		for (int i = 0; i < comBbNum.length; i++) {
			System.out.print(comBbNum[i]+" ");			
		}
		System.out.println();
		
		while(true) {
			int strike = 0;
			int ball = 0;
			int play = 0;
			
			System.out.println("세자리 숫자를 입력하세요");
			int num = sc.nextInt();
			String inputNum = Integer.toString(num);
			String [] myNumArr = inputNum.split("");
			play++;
			
			for (int i = 0; i < comBbNum.length; i++) {
				for (int j = 0; j < myNumArr.length; j++) {
					if (comBbNum[i].equals(myNumArr[j])  && i == j) {
						strike++;
					} else if(comBbNum[i].equals(myNumArr[j])  && i != j){
						ball++;
					}
				}
			}
			if (strike == 3) {
				System.out.println("게임 종료 "+play+"회 시도 하였습니다");
				break;
			} else if(strike == 0 && ball == 0) {
				System.out.println("OUT");
			} else {
				System.out.println(strike+"S "+ball+"B");
			}
		}
		
		// 선생님 버전
//		Scanner sc = new Scanner(System.in);
//		int[] comNum2 = {0,0,0};
//		int[] myNum2 = new int[3];
//		int count2 = 0;
//		
//		for (int i = 0; i < comNum2.length; i++) {
//			comNum2[i] = (int)(Math.random()*9)+1;
//			for (int j = 0; j < i; j++) {
//				if (comNum2[i] == comNum2[j]) {
//					i--;	// 중복됐으니 다시 처음부터 돌아야 된다.
//					break;
//				}
//			}
//		}
//		for (int i : comNum2) {
//			System.out.println(i+" ");
//		}
//		System.out.println("\n컴퓨터가 숫자를 정하였습니다");
//		while (true) {
//			int strike2 = 0, ball2 = 0;
//			System.out.println("숫자를 추측하세요 > 예) 123");
//			String myNumStr = sc.next();
//			count2++;
//			
//			String[] myNumArr = myNumStr.split("");
//			for (int i = 0; i < myNumArr.length; i++) {
//				myNum2[i] = Integer.parseInt(myNumArr[i]);
//			}
//			
//			for (int i = 0; i < comNum2.length; i++) {
//				for (int j = 0; j < myNum2.length; j++) {
//					if(comNum2[i]==myNum2[j] && i==j) {
//						strike2++;
//					}else if(comNum2[i]==myNum2[j] && i!=j) {
//						ball2++;
//					}
//				}
//			}
//			System.out.println(count2+"회 시도: "+myNumStr);
//			System.out.println(" > "+ strike2 + "S "+ ball2 + "B");
//			
//			if(strike2 == 3) {
//				System.out.println("게임 종료");
//				break;
//			}
//		}
		

	}

}
