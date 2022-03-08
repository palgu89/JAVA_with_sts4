package objects;

class Pet {
	String nickName = "냥이";
	boolean gender = false;
	int age = 2;
	char kind = 'A';

	void move() {
		System.out.println("어 움직인다");
	}
	
	void sound() {
		System.out.println("야옹야옹");
	}
	
	void getOld() {
		age++;
	}
}
public class Person {

	public static void main(String[] args) {
		Pet myCat = new Pet();
//		String myCatNick = myCat.nickName;	// 냥이
//		System.out.println(myCatNick);
		System.out.println(myCat.nickName);
		myCat.nickName = "냥냥이";
		System.out.println(myCat.nickName);
		
		System.out.println(myCat.age);
		myCat.getOld();
		System.out.println(myCat.age);
	}

}
