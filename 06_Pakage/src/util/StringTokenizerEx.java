package util;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		String src = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(src, ",");
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		String exp = "x=100*(100+10)/3";
		StringTokenizer st2 = new StringTokenizer(exp,"=-+/*()", true);
		// false면 "" 안의것들을 빼버리고 출력
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}

}
