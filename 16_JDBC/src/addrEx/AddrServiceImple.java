package addrEx;

import java.util.List;

public class AddrServiceImple implements Service {
	// 여기서 Service의 구체적 기능을 만들어 수행한 뒤 데이터베이스로 보냄
	
	private DataAccessObject dao;
	
	public AddrServiceImple() {
		dao = new AddrDAOImple();
	}
	
	@Override
	public boolean register(Address addr) {
		// 이미 앞에서 받아서 여긴 받을 게 없음
		// 단 dao로 던져줄건 있음
		// 근데 register는 boolean, insert는 int이므로 아래와 같이 작성한다
		return dao.insert(addr) > 0 ? true : false;

	}

	@Override
	public List<Address> getList() {
		return dao.selectList();
	}

	@Override
	public Address getDetail(String name) {
		return dao.selectOne(name);
	}
	
	@Override
	public Address getDetailByTel(String tel) {
		return dao.selectOneByTel(tel);
	}
	
	@Override
	public List<Address> getListByAge(int age) {
		return dao.selectListByAge(age);
	}

	@Override
	public boolean modify(Address addr) {
		return dao.update(addr) > 0 ? true : false;
	}

	@Override
	public boolean remove(String name) {
		return dao.delete(name) > 0 ? true : false;
	}
}
