package hotel;

import java.util.List;

public interface RoomDAO {
	int insert(RoomVO rvo);
	List<RoomVO> selectList();
	int checkInUpdate(RoomVO rvo);
	int checkOutUpdate(RoomVO rvo);
	RoomVO selectOne(String roomNum);
}
