package addrEx;

import java.util.List;

// crud service 정의 > 기본 중의 기본
public interface Service {
	// 앱에서 무엇을 할 수 있을까를 개념적으로 정리
	
	// 등록
	boolean register(Address addr);
	
	// 검색 및 조회
	List<Address> getList();
	Address getDetail(String name);
	Address getDetailByTel(String tel);
	List<Address> getListByAge(int age);
	
	// 수정
	boolean modify(Address addr);
	
	// 삭제
	boolean remove(String name);


}
