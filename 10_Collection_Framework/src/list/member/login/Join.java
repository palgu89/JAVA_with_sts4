package list.member.login;

public class Join {
	private String id;
	private String pwd;
	
	public Join() {}

	public Join(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}

	public final String getId() {
		return id;
	}

	public final void setId(String id) {
		this.id = id;
	}

	public final String getPwd() {
		return pwd;
	}

	public final void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
