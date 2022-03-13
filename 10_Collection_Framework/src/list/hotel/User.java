package list.hotel;

public class User {
	private String name;
	private int age;
	private char gen;

	public User() {}

	public User(String name, int age, char gen) {
		this.name = name;
		this.age = age;
		this.gen = gen;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final int getAge() {
		return age;
	}

	public final void setAge(int age) {
		this.age = age;
	}

	public final char getGen() {
		return gen;
	}

	public final void setGen(char gen) {
		this.gen = gen;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", gen=" + gen + "]";
	}
	
	
}
