package addrEx;

import java.util.List;

// DAO
public interface DataAccessObject {
	// service와 database 사이의 중간다리 역할
	
	int insert(Address addr);
	List<Address> selectList();
	Address selectOne(String name);
	Address selectOneByTel(String tel);
	List<Address> selectListByAge(int age);
	int update(Address addr);
	int delete(String name);
	
	// insert, update, delete는 database로 들어가는 값이라 int로 설정
	// selectList, selectOne은 database에서 그저 보기만 하는거라 내맘대로 설정
	
}
