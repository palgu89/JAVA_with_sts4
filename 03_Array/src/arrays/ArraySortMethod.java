package arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortMethod {

	public static void main(String[] args) {
		int[] intArr = new int[12];
		
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = (int)(Math.floor(Math.random()*100))+1;
			
			System.out.print(intArr[i]+" ");
		}
		System.out.println("\n=================================");
		
		Arrays.sort(intArr);
		
		for(int i : intArr) {	// JS의 forEach
			System.out.println(i+" ");
			// 위의 i는 인덱스를 뜻하지만 여기의 i는 value를 뜻함
		}
		System.out.println("\n=================================");
		
		// 역정렬
		// Arrays.sort(intArr, Collections.reverseOrder());
		
		// 얘는 기본형 타입 배열은 정렬이 안됨
		// 데이터 타입이 object이어야 가능
		// 맨 처음 배열 선언을 int가 아니라 Integer로 바꾸면 가능
	}

}
