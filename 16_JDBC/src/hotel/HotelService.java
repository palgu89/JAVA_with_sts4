package hotel;

import java.util.List;

public interface HotelService {
	int register(RoomVO rvo);
	List<RoomVO> getList();
	int checkInModify(RoomVO rvo);
	int checkOutModify(RoomVO rvo);
	RoomVO getDetail(String roomNum);
}
