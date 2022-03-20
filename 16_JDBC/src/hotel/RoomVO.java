package hotel;

public class RoomVO {
	private String roomNum;
	private String user;
	private boolean emptyRoom;
	private String checkInTime;
	private String checkOutTime;
	
	public RoomVO() {}

	public RoomVO(String roomNum, String user, boolean emptyRoom, String checkInTime, String checkOutTime) {
		this.roomNum = roomNum;
		this.user = user;
		this.emptyRoom = emptyRoom;
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
	}

	public RoomVO(String roomNum) {
		this.roomNum = roomNum;
	}
	
	public RoomVO(String roomNum, boolean emptyRoom) {
		this.roomNum = roomNum;
		this.emptyRoom = emptyRoom;
	}

	public final String getRoomNum() {
		return roomNum;
	}

	public final void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public final String getUser() {
		return user;
	}

	public final void setUser(String user) {
		this.user = user;
	}

	public final boolean isEmptyRoom() {
		return emptyRoom;
	}

	public final void setEmptyRoom(boolean emptyRoom) {
		this.emptyRoom = emptyRoom;
	}

	public final String getCheckInTime() {
		return checkInTime;
	}

	public final void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}

	public final String getCheckOutTime() {
		return checkOutTime;
	}

	public final void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	@Override
	public String toString() {
		return "RoomVO [roomNum=" + roomNum + ", user=" + user + ", emptyRoom=" + emptyRoom + ", checkInTime=" + checkInTime
				+ ", checkOutTime=" + checkOutTime + "]";
	}
	
	
}
