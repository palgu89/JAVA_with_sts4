package hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RoomDAOImple implements RoomDAO {
	
	private Connection conn;
	private PreparedStatement pst;
	private String query = "";
	
	public RoomDAOImple() {
		MySQLConnect dbc = MySQLConnect.getInstance();
		conn = dbc.getConnection();
	}

	@Override
	public int insert(RoomVO rvo) {
		query = "insert into room (room_num, user, empty_room, check_in_time, check_out_time) "
				+ "value(?, ?, ?, ?, ?)";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, rvo.getRoomNum());
			pst.setString(2, rvo.getUser());
			pst.setBoolean(3, rvo.isEmptyRoom());
			pst.setString(4, rvo.getCheckInTime());
			pst.setString(5, rvo.getCheckOutTime());
			return pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return 0;
	}
	
	@Override
	public List<RoomVO> selectList() {
		query = "select * from room";
		try {
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			List<RoomVO> list = new ArrayList<>();
			while(rs.next()) {
				list.add(new RoomVO(rs.getString("room_num"), rs.getString("user"), rs.getBoolean("empty_room"), rs.getString("check_in_time"), rs.getString("check_out_time")));
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return null;
	}

	@Override
	public int checkInUpdate(RoomVO rvo) {
		query = "update room set user = ?, empty_room = ?, check_in_time = now(), check_out_time = null where room_num = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, rvo.getUser());
			pst.setBoolean(2, rvo.isEmptyRoom());
			pst.setString(3, rvo.getRoomNum());
			return pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	@Override
	public int checkOutUpdate(RoomVO rvo) {
		query = "update room set user = ?, empty_room = ?, check_in_time = null, check_out_time = now() where room_num = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, rvo.getUser());
			pst.setBoolean(2, rvo.isEmptyRoom());
			pst.setString(3, rvo.getRoomNum());
			return pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	@Override
	public RoomVO selectOne(String roomNum) {
		query = "select * from room where room_num = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, roomNum);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				return new RoomVO(
						rs.getString("room_num"), 
						rs.getString("user"), 
						rs.getBoolean("empty_room"), 
						rs.getString("check_in_time"), 
						rs.getString("check_out_time")
						);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}


}
