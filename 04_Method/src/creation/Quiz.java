package creation;

public class Quiz {

	public static void main(String[] args) {
		// 랜덤으로 정수 5개를 배열로 만들어
		// 그 배열을 메서드에 전달하면
		// 평균을 연산 후 리턴 받아
		// 출력하는 코드를 작성하세요
		// 1. 랜덤으로 정수 5개 만드는 메서드
		// 2. 평균을 연산하는 메서드
		
		int[] ranInt = RandomInteger();
		for (int i = 0; i < ranInt.length; i++) {
			System.out.print(ranInt[i]+" ");			
		}
		System.out.println();
		
		clacAvg(ranInt);
	}


	private static void clacAvg(int[] ranInt) {
		int total = 0;
		for (int i : ranInt) {
			total += i;
		}
		double avg = (double)(total)/ranInt.length;
		System.out.println(avg);
	}


	private static int[] RandomInteger() {
		int[] ranNum = new int[5];
		for (int i = 0; i < ranNum.length; i++) {
			ranNum[i] = (int)(Math.floor(Math.random()*100))+1;
		}
		return ranNum;
	}

}
