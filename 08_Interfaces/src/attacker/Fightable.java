package attacker;

interface Attackable {	// public이다 자바 파일 구조상 default(package)처럼 보일 뿐
	public abstract void attack(Unit unit);
}

// 인터페이스는 규격(명세서)의 의미로 사용하므로 범위적 제한을 두지 않는다
interface Movable {	// 앞에 protected 붙이면 err => interface는 특정대상을 위한 것이 아님
	void move(int x, int y);
	// 원래 public abstract void move(int x, int y); 이다
}

// extends: 종류가 같은것끼리의 사용일 때 사용
         // => 클래스와 클래스는 extends관계
            // 인터페이스와 인터페이스도 extends관계
// implements: 내가 받아서 더 상세하게 구현할 때 사용
            // => 클래스는 인터페이스를 implements 할 수 있다
            // => 단, 인터페이스는 클래스를 implements를 할 수 없다
			// ==> interface는 여러개를 받을 수 있다

public interface Fightable extends Attackable, Movable {
	// final int x = 0;
	// public static final int x = 0; 이 원래 구조
	// 항상 public static으로 생각하자 => 규격 => 변하면 안됨
	// final => 무조건 해당 값 => 상수만 선언 가능
	
	
}
