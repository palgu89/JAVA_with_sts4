package conditions;

import java.util.Scanner;

public class RSPGame {

	public static void main(String[] args) {
		// 가위바위보 게임을 해보자
		
		// 1. 컴퓨터는 랜덤으로 가위바위보를 선택한다.
		// 2. 나도 가위바위보 중에 하나를 입력한다.
		// 3. 가위바위보를 비교해서 결과를 출력한다.
		
		int comNum = (int)(Math.floor(Math.random()*3));
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보 중 하나를 고르세요");
		String myRSP = sc.nextLine();
		String comRSP = comNum == 0 ? "가위" : comNum == 1 ? "바위" : "보";
		
		if (comRSP.equals("가위")) {
			if (myRSP.equals("가위")) {
				System.out.println("비겼습니다");
			}else if (myRSP.equals("바위")) {
				System.out.println("이겼습니다");
			}else {
				System.out.println("졌습니다");
			}
		} else if (comRSP.equals("바위")) {
			if (myRSP.equals("가위")) {
				System.out.println("졌습니다");
			}else if (myRSP.equals("바위")) {
				System.out.println("비겼습니다");
			}else {
				System.out.println("이겼습니다");
			}
		} else {
			if (myRSP.equals("가위")) {
				System.out.println("이겼습니다");
			}else if (myRSP.equals("바위")) {
				System.out.println("졌습니다");
			}else {
				System.out.println("비겼습니다");
			}
		}
		System.out.println("컴퓨터: "+comRSP);
	}

}
