package abstracts;

public class Piri extends Character {

	public Piri() {
		hp = 100;
		mp = 50;
		System.out.println("파이리 생성~ 파이리파이리");
		printStatus();
	}
	
	private int[] savePR;
	
	public int[] getSavePR() {
		return savePR;
	}

	public void setSavePR(int[] savePR) {
		savePR = new int[] {hp, mp, level};
		this.savePR = savePR;
	}
	
	@Override
	public void eat() {
		mp += 10;
	}

	@Override
	public void sleep() {
		mp += 20;
	}

	@Override
	public void play() {
		mp -= 20;
		hp += 5;
	}

	@Override
	public boolean train() {
		mp -= 10;
		hp += 10;
		levelUp();
		return checkMp();
	}

	@Override
	public void levelUp() {
		if (hp >= 40) {
			hp -= 40;
			level++;
		}
	}

}
