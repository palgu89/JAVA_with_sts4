package product;

public class ProductVO {
	private int pno;
	private String pname;
	private int price;
	private String regDate;
	private String madeBy;
	
	public ProductVO() {}
	
	// insert용 생성자
	public ProductVO(String pname, int price, String madeBy) {
		this.pname = pname;
		this.price = price;
		this.madeBy = madeBy;
	}
	
	// list용 생성자
	public ProductVO(int pno, String pname, int price) {
		this.pno = pno;
		this.pname = pname;
		this.price = price;
	}
	
	// update용 생성자
	public ProductVO(int pno, String pname, int price, String madeBy) {
		this(pno, pname, price);
		this.madeBy = madeBy;
	}

	// All argument
	public ProductVO(int pno, String pname, int price, String regDate, String madeBy) {
		this(pno, pname, price, madeBy);
		this.regDate = regDate;
	}
	// 그냥 getter setter로 일일이 부여해줘도 되지만 위처럼 해도 된다

	public final int getPno() {
		return pno;
	}

	public final void setPno(int pno) {
		this.pno = pno;
	}

	public final String getPname() {
		return pname;
	}

	public final void setPname(String pname) {
		this.pname = pname;
	}

	public final int getPrice() {
		return price;
	}

	public final void setPrice(int price) {
		this.price = price;
	}

	public final String getRegDate() {
		return regDate;
	}

	public final void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public final String getMadeBy() {
		return madeBy;
	}

	public final void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	@Override
	public String toString() {
		return "ProductVO [pno=" + pno + ", pname=" + pname + ", price=" + price + ", regDate=" + regDate + ", madeBy="
				+ madeBy + "]";
	}	
}
