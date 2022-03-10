package abstracts;

public class Ccobuki extends Character {

	public Ccobuki() {
		hp = 100;
		mp = 50;
		System.out.println("꼬부기 생성~ 꼬북꼬북");
		printStatus();
	}
	
	private int[] saveCB;
	
	public int[] getSaveCB() {
		return saveCB;
	}

	public void setSaveCb(int[] saveCB) {
		saveCB = new int[] {hp, mp, level};
		this.saveCB = saveCB;
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
