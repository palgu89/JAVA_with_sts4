package overloading;

public class CalcArea {

	public static void main(String[] args) {
		
		int width = 100;
		double height = 40;
		area(width, height);
		
		double triWidth = 50;
		int triHeight = 60;
		area(triWidth, triHeight);
		
		double radius = 5;
		final double PI = 3.14;
		area(radius, PI);
	}

	private static void area(double radius, double PI) {
		System.out.println("원의 넓이: "+(double)(Math.pow(radius, 2)*PI));
	}

	private static void area(double triWidth, int triHeight) {
		System.out.println("삼각형의 넓이: "+(triWidth*triHeight/2));
	}

	private static void area(int width, double height) {
		System.out.println("사각형의 넓이: "+(width*height));
	}
	
}
