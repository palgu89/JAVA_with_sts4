package dbservice;

public interface DataBase {
	void select();
	void insert();
	void update();
	void delete();
	
	// 여기서 데이터베이스 인터페이스를 통해
	// MySQL과 Oracle에다가 이건 꼭 필요하다고 규제하는 역할을 한다
}
