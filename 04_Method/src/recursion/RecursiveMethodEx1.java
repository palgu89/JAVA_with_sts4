package recursion;

public class RecursiveMethodEx1 {

	public static void main(String[] args) {
		int sum = recursion(10);
		System.out.println(sum);
	}

	private static int recursion(int i) {
//		int sum = 0;
//		for (int j = 0; j < i+1; j++) {
//			sum += j;
//		}
//		return sum;
		
		if (i > 0) {
			return i + recursion(i-1);	// 10 + (9 + (8 + ... +1))))))))))
		}else {
			return 0;
		}
	}

}
