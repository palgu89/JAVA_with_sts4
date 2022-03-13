package list.hotel;

public class Room {
	private String roomNum;
	private User user;
	private boolean empty;
	private String checkInTime;
	private String checkOutTime;
	
	public Room() {}

	public Room(String roomNum, User user, boolean empty) {
		this.roomNum = roomNum;
		this.user = user;
		this.empty = empty;
	}

	public final String getRoomNum() {
		return roomNum;
	}

	public final void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public final User getUser() {
		return user;
	}

	public final void setUser(User user) {
		this.user = user;
	}

	public final boolean isEmpty() {
		return empty;
	}

	public final void setEmpty(boolean empty) {
		this.empty = empty;
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
		return "Room [roomNum=" + roomNum + ", user=" + user + ", empty=" + empty + ", checkInTime=" + checkInTime
				+ ", checkOutTime=" + checkOutTime + "]";
	}
	
	
}
