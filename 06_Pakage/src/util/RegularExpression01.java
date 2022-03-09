package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression01 {

	public static void main(String[] args) {
		String[] strArr = {
				"bat", "baby", "bonus", "cA", "ca", "co", "c",
				"c0", "car", "combat", "count", "date", "disc"
				};
		
		// c[a-z]* => c로 시작하고 두번째가 소문자인 영단어 모두
		Pattern pattern = Pattern.compile("c[a-z]*");
		
		for (String str : strArr) {
			// Matcher => pattern이 가지고 있는 값(c로 시작하는 ~) 과 str을 비교
			Matcher matcher = pattern.matcher(str);
			if (matcher.matches()) {
				System.out.println(str + ", ");
			}
		}
		
		String str1 = "\\D";	// \를 하나만 쓰면 인식 못함 escape처리 해줘야 함
	}

}
