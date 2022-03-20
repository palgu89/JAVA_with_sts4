package hotel;

public class UserVO {
	private String name;
	private int age;
	private String gen;
	
	public UserVO() {}
	
	public UserVO(String name, int age, String gen) {
		super();
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

	public final String getGen() {
		return gen;
	}

	public final void setGen(String gen) {
		this.gen = gen;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", gen=" + gen + "]";
	}
	
	
}
