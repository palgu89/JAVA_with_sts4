package abstracts;

public class Esanghaessi extends Character {

	public Esanghaessi() {
		hp = 100;
		mp = 50;
		System.out.println("이상해씨 생성~ 이상이상");
		printStatus();
	}
	
private int[] saveES;
	
	public int[] getSaveES() {
		return saveES;
	}

	public void setSaveES(int[] saveES) {
		saveES = new int[] {hp, mp, level};
		this.saveES = saveES;
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
