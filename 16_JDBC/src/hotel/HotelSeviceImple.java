package hotel;

import java.util.List;

public class HotelSeviceImple implements HotelService {
	private RoomDAO dao;

	public HotelSeviceImple() {
		dao = new RoomDAOImple();
	}
	
	@Override
	public int register(RoomVO rvo) {
		return dao.insert(rvo);
	}
	
	@Override
	public List<RoomVO> getList() {
		return dao.selectList();
	}

	@Override
	public int checkInModify(RoomVO rvo) {
		return dao.checkInUpdate(rvo);
	}

	@Override
	public int checkOutModify(RoomVO rvo) {
		return dao.checkOutUpdate(rvo);
	}

	@Override
	public RoomVO getDetail(String roomNum) {
		return dao.selectOne(roomNum);
	}
}
