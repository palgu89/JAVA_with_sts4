package abstracts;

import java.util.Scanner;

public class PlayGame {
	private Character character;
	private int menu;
	private boolean flag;
	
	public PlayGame(Character character) {
		this.character = character;	// 생성된 케릭터를 받는다
	}
	
	public void printMenu(Scanner sc) {
		
		System.out.println("1.EAT 2.SLEEP 3.PLAY 4.TRAIN 5.ANOTHER Etc.EXIT");
		menu = sc.nextInt();
		
		playCharacter();	// 원래는 여기에 menu를 던졌지만 지금은 아예 메뉴를 위에 선언해줘서 던질 필요가 없게 했다
	}

	private void playCharacter() {
		switch (menu) {
		case 1:
			character.eat();
			break;
		case 2:
			character.sleep();
			break;
		case 3:
			character.play();
			break;
		case 4:
			character.train();
			break;
		case 5:
			break;
		default:
			flag = true;
			break;
		}
		character.printStatus();
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public int getMenu() {
		return menu;
	}

	public void setMenu(int menu) {
		this.menu = menu;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	} 
	
	
}
