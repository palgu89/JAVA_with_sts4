package quiz;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 1.
		// 24절기 맞추기 게임
		// ? 번째 절기는 무엇입니까? >
		// 몇 번 시도했는지도 출력
		
		Scanner sc = new Scanner(System.in);
		String[] seasonal = {
				"입춘", "우수", "경칩", "춘분", "청명", "곡우","입하", "소만",
				"망종", "하지", "소서", "대서", "입추", "처서", "백로", "추분",
				"한로", "상강", "입동", "소설", "대설", "동지", "소한", "대한"
			};
		int ranNum = (int)(Math.floor(Math.random()*24))+1;
		int count = 1;
		while(true) {
			System.out.println(ranNum+"번째 절기는 무엇입니까?");
			String myAns = sc.next();
		
			if (seasonal[ranNum-1].equals(myAns)) {
				System.out.println("정답입니다 "+count+"번 시도하셨습니다");
				break;
			} else {
				System.out.println("틀렸습니다");
				count++;
			}
		}
		
	}

}
