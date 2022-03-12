package tryCatch;

public class ArrayException {

	public static void main(String[] args) {
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		try {
			for (int i = 0; i < arr.length + 1; i++) {
				System.out.println(arr[i]);
			}	// for문 블럭지정해서 alt+shift+z => try catch		
		} catch (Exception e) {
			e.printStackTrace();
			countinueMethod();
		} finally {
			countinueMethod();
		}
	}

	private static void countinueMethod() {
		System.out.println("예외가 발생했으니... 여기로 온게 아닌가...");		
	}

}
