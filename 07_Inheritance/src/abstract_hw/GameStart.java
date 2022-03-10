package abstract_hw;

public class GameStart {
	public static void main(String[] args) {
		Character ch = null;
		PlayGame pg = null;
		Inventory inventory = new Inventory();
		
		// 나중에 또 불러야 하니까 일단 최초 선택으로 0을 넣어둠 => int자리 마련
		ch = inventory.choiceCharacter(0);
		
		if (ch == null) {
			System.out.println("게임 종료 합니다");
			return;	// 아무것도 리턴하지 않으니 프로그램 종료
		} else {
			pg = new PlayGame(inventory, ch.getCno());
		}
		while (true) {
			pg.printMenu();
			
			if (pg.isFlag()) {
				System.out.println("게임을 종료합니다");
				break;
			}
		}
	}

}
