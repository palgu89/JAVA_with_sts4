package list.hotel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class HotelServiceImple implements HotelService {
	private Scanner sc = new Scanner(System.in);
	private List<Room> roomList;
	
	public HotelServiceImple(List<Room> roomList) {
		this.roomList = roomList;
	}

	@Override
	public boolean choiceMenu(int menu) {
		
		
		String roomNum = "";
		switch (menu) {
		case 1:
			getRoomsStatus();
			break;
		case 2:
			System.out.println("입실할 방번호를 입력 > ");
			roomNum = sc.next();
			roomCheckIn(roomNum);
			break;
		case 3:
			System.out.println("퇴실할 방번호를 입력 > ");
			roomNum = sc.next();
			roomCheckOut(roomNum);
			break;
		case 4:
			System.out.println("조회할 방번호를 입력 > ");
			roomNum = sc.next();
			getRoomDetail(roomNum);
			break;
		case 5:
			System.out.println("-------- 투숙객 리스트 ---------");
			getUserList();
			break;
		default:
			System.out.println("저희 호텔을 이용해 주셔서 감사합니다");
			return false;
		}
		return true;
	}

	@Override
	public void getRoomsStatus() {
		for (Room room : roomList) {
			System.out.print(room.getRoomNum() + "호");
			System.out.print("[" + (room.isEmpty() ? "입실가능" : "사용중") + "]\t");
			System.out.println();
		}

	}

	@Override
	public void roomCheckIn(String roomNum) {
		for (Room room : roomList) {
			if (room.getRoomNum().equals(roomNum)) {
				if (room.isEmpty()) {
					room.setEmpty(false);
					room.setUser(getUserInfo());
					LocalDateTime todayNow = LocalDateTime.now();
					room.setCheckInTime(
							DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(todayNow));
					room.setCheckOutTime(null);
					System.out.println(roomNum + "호 입실완료");
				} else {
					System.out.println(roomNum + "호는 현재 사용중!");
				}
				break;
			}
		}
	}

	private User getUserInfo() {
		System.out.println("투숙객의 정보를 입력해야 합니다!");
		System.out.println("이름 > ");
		String name = sc.next();
		System.out.println("나이 > ");
		int age = sc.nextInt();
		System.out.println("성별 > ");
		char gen = sc.next().charAt(0);

		return new User(name, age, gen);
	}

	@Override
	public void roomCheckOut(String roomNum) {
		for (Room room : roomList) {
			if (room.getRoomNum().equals(roomNum)) {
				if (!room.isEmpty()) {
					room.setEmpty(true);
					room.setUser(null);
					LocalDateTime todayNow = LocalDateTime.now();
					room.setCheckOutTime(
							DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(todayNow));
					room.setCheckInTime(null);
					System.out.println(roomNum + "호 퇴실완료");
				} else {
					System.out.println(roomNum + "호는 현재 빈방!");
				}
				break;
			}
		}
	}

	@Override
	public void getRoomDetail(String roomNum) {
		for (Room room : roomList) {
			if (room.getRoomNum().equals(roomNum)) {
				System.out.println(room);
				break;
			}
		}
	}

	@Override
	public void getUserList() {
		for (Room room : roomList) {
			System.out.print(room.getRoomNum() + "호 > ");
			System.out.println(room.getUser());
		}
	}

}
