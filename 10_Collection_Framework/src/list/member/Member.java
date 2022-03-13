package list.member;

public class Member {
	private String id;
	private String pw;
	public Member() {}
	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	public final String getId() {
		return id;
	}
	public final void setId(String id) {
		this.id = id;
	}
	public final String getPw() {
		return pw;
	}
	public final void setPw(String pw) {
		this.pw = pw;
	}
	
}
