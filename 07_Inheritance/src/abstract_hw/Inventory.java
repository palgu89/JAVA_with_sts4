package abstract_hw;

import java.util.Scanner;

public class Inventory {
	private Picachu picachu;
	private KKobugi kKobugi;
	private LeeSangHaeSea leeSangHaeSea;
	private PyLee pyLee;
	
	public Character getCharacter(int cno) {
		Character ch = null;
		switch (cno) {
		case 1:
			ch = getPicachu();
			break;
		case 2:
			ch = getkKobugi();		
			break;
		case 3:
			ch = getLeeSangHaeSea();
			break;
		case 4:
			ch = getPyLee();
			break;
		default:
			break;
		}
		return ch;
	}
	
	public Character choiceCharacter(int cno) {	// 최초 게임시작할때만 0을 받는다
		Scanner sc = new Scanner(System.in);
		int chNum = 0;
		if (cno == 0) {
			System.out.println("원하는 케릭터를 선택하세요 > ");
			System.out.println("1.피카츄 2.꼬북이 3.이상해씨 4.파이리");
			chNum = sc.nextInt();
		} else {
			chNum = cno;
		}
		
		// Character ch = null;
		
		switch (chNum) {
		case 1:
			if (getPicachu() == null) {	// 같은 클래스에 있으니 get말고 그냥 피카츄 써도 됨
				setPicachu(new Picachu());	// set말고 그냥 피카츄 가능
			}
			// else를 안쓴 이유는 null이어도 정보가 있어도
			// 결국은 가져와야 하니까 else 안쓰고 밖에서 get으로 불러옴
			// ch = getPicachu();	// get말고 그냥 피카츄 가능	
			// 그런데 실무에선 보통 직접 부르는거보다 getter setter로 부른다(중간에 인증요구나 이런게 있을 수 있기 때문에)
			break;
		case 2:
			if (getkKobugi() == null) {
				setkKobugi(new KKobugi());
			}
			// ch = getkKobugi();	// 이렇게 해도 되는데 메서드 기능별로 나눴다
			break;
		case 3:
			if (getLeeSangHaeSea() == null) {
				setLeeSangHaeSea(new LeeSangHaeSea());
			}
			// ch = getLeeSangHaeSea();
			break;
		case 4:
			if (getPyLee() == null) {
				setPyLee(new PyLee());
			}
			// ch = getPyLee();
			break;
		default:
			System.out.println("케릭터를 잘못 선택하셨습니다");
			return null;
		}	
		// return ch;
		return getCharacter(chNum);
	}
	public Picachu getPicachu() {
		return picachu;
	}
	public void setPicachu(Picachu picachu) {
		this.picachu = picachu;
	}
	
	public KKobugi getkKobugi() {
		return kKobugi;
	}
	public void setkKobugi(KKobugi kKobugi) {
		this.kKobugi = kKobugi;
	}
	
	public LeeSangHaeSea getLeeSangHaeSea() {
		return leeSangHaeSea;
	}
	public void setLeeSangHaeSea(LeeSangHaeSea leeSangHaeSea) {
		this.leeSangHaeSea = leeSangHaeSea;
	}
	
	public PyLee getPyLee() {
		return pyLee;
	}
	public void setPyLee(PyLee pyLee) {
		this.pyLee = pyLee;
	}

	
	
}
