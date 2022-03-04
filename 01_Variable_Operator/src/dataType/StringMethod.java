package dataType;

public class StringMethod {

	public static void main(String[] args) {
		String str = "Hello World";
		
		// 문자열의 길이
		System.out.println(str.length());	// 11 (띄어쓰기 포함)
		
		// 문자열의 인덱스
		System.out.println(str.indexOf('W'));	// 단일 문자 값의 인덱스 (char)
		System.out.println(str.indexOf("ll"));	// 일치하는 문자열의 시작 인덱스 (String)
		System.out.println(str.lastIndexOf("o", 4));	// 지정한 인덱스로부터 찾기 시작
		System.out.println(str.lastIndexOf('l'));	// 마지막으로 나타나는 문자값 찾기
		System.out.println(str.lastIndexOf("Wo"));
		System.out.println(str.lastIndexOf('l', 5));	// 지정한 인덱스로부터 찾기 시작
		// 문자열의 특정 인덱스에 해당하는 문자값
		System.out.println(str.charAt(6));
		
		// 특정 문자값 존재여부
		System.out.println(str.contains("Hell"));
		
		// 특정 문자값의 동일여부 (문자값 비교할 때 반드시 equals()를 사용해야 함 <= 주소값때문)
		// String은 참조자료형이기 때문에 서로 다른 주소값을 갖고 있다
		// 비교 연산자는 값만 비교하기 때문에 참조자료형을 비교연산하게 되면 false를 리턴한다
		System.out.println(str.equals("Hello World"));
		
		// 대소문자 변환 및 비교
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.equalsIgnoreCase("hello world"));	// 대소문자 무시하고 비교
		
		// 비어있는 값인지 확인
		System.out.println(str.isEmpty());	// "" ?
		
		// 문자값 변경
		System.out.println(str.replace('W', 'w'));	// repalceAll(정규표현식, 변환할 문자값) 은 정규식 배울 때 다룬다
		
		// 문자열 분리 후 배열로 리턴
		String [] strArr = str.split("");	// 구분자(delimiter)를 파라미터로 받는다 => ""이면 한개씩 자름
		System.out.println(strArr[0]);
		System.out.println(strArr[0]);
		System.out.println(strArr[strArr.length-1]);
		
		// 문자열 자르기
		System.out.println(str.substring(4));
		System.out.println(str.substring(2, 6));	// llo
		
		// 양쪽 공백 제거 => 문자열 가운데 있는 whitespace는 제거하지 앟는다
		System.out.println(str.trim());
		
		// 문자값으로 변환
		System.out.println(String.valueOf(12345));
		
		// 문자값 비교 return => 비교하는 문자값의 아스키코드의 차 => int 리턴
		// 문자값 비교를 각 자리를 순회하면서 비교 (최초의 다른 값을 찾아 그 차이(아스키코드)값을 리턴)
		System.out.println(str.compareTo("Hello World"));
		System.out.println(str.compareToIgnoreCase("hello world"));
	}

}
