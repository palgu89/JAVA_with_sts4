package list.addrbook;

// VO의 기본 모양
public class Address {
	private String name;
	private String tel;
	private String address;
	
	public Address() {}

	public Address(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getTel() {
		return tel;
	}

	public final void setTel(String tel) {
		this.tel = tel;
	}

	public final String getAddress() {
		return address;
	}

	public final void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Address [name=" + name + ", tel=" + tel + ", address=" + address + "]";
	}
	
	
}
