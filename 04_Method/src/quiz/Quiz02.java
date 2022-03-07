package quiz;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {		
		// 2.
		// 테스트를 참여할 인원수를 입력하세요 >
		
		// 1번째 사람 이름을 입력하세요 >
		// 1번째 사람의 국어점수를 입력하세요 >
		// 1번째 사람의 영어점수를 입력하세요 >
		// 1번째 사람의 수학점수를 입력하세요 >
		// ...
		// 3번째 사람의 수학점수를 입력하세요 >
		
		// 이름 국어 영어 수학 총점 평균
		// aaa   89   88   78   ?    ?
		// bbb    ?   ?    ?    ?    ?
		// ...
		
		
		Scanner sc = new Scanner(System.in);
		int testerCount = 0;
		System.out.println("테스트에 참여할 인원수 >");
		testerCount = sc.nextInt();
		String[] names = new String[testerCount];
		int[][] scores = new int[testerCount][3];
		int[] totals = new int[testerCount];
		double[] avgs = new double[testerCount];
		DecimalFormat df = new DecimalFormat("#.##");	// 소수점 2자리까지 자르기
		
		
		inputDatas(sc, names, scores, totals, avgs, df);
		
	}
	
	
	private static void inputDatas(Scanner sc, String[] ns, int[][] ss, int[] ts, double[] as, DecimalFormat df) {
		// Scanner sc = new Scanner(System.in);
		String[] names = ns;
		int[][] scores = ss;
		int[] totals = ts;
		double[] avgs = as;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i+1)+"번째 사람의 이름 입력 > ");
			names[i] = sc.next();
			
			for (int j = 0; j < scores[i].length; j++) {
				System.out.println("번째 사람의 ");
				System.out.println(j==0 ? "국어" : j==1 ? "영어" : "수학");
				scores[i][j] = (int)(Math.random()*40)+61; 	// 원래는 sc.nextInt()로 받겠지만 귀찮아서 랜덤 61~100
				System.out.println(" 점수 입력 >" + scores[i][j]);
				
				totals[i] += scores[i][j];
			}
			avgs[i] = Double.parseDouble(df.format((double)totals[i] / 3));	// 자른 소수들은 string이 된다 -> 다시 double로 바꿔준다
			System.out.println("==================================");
		}
		printDatas(names, scores, totals, avgs);
		printFinish();
	}
	
	private static void printFinish() {
		System.out.println("프로그램 종료");
		
	}


	private static void printDatas(String[] names, int[][] scores, int[] totals, double[] avgs) {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t순위");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(names[i] + "\t");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.print(totals[i] + "\t");
			System.out.print(avgs[i] + "\t");
			
			int rank = 1;
			for (int k = 0; k < totals.length; k++) {
				if (totals[i] < totals[k]) {
					rank++;
				}
			}
			System.out.println(rank);
		}
		
	}
}
