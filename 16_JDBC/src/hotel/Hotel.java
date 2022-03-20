package hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {
	List<RoomVO> roomList;
	Scanner sc = new Scanner(System.in);
	HotelService hsv = new HotelSeviceImple();
	List<RoomVO> list = null;
	
	public Hotel() {
		bulidHotel();
		frontDesk();
	}
	
	private void bulidHotel() {
		System.out.println("호텔의 층 수 입력 > ");
		int floorCount = sc.nextInt();
		System.out.println("층 당 방 수 입력 > ");
		int roomCount = sc.nextInt();
		
		initializeRooms(floorCount, roomCount);
	}

	private void initializeRooms(int floorCount, int roomCount) {
		this.roomList = new ArrayList<>();
		
		for (int i = 1; i <= floorCount; i++) {
			for (int j = 1; j <= roomCount; j++) {
				this.roomList.add(new RoomVO(i+(j < 10 ? "0" : "")+j, null, true, null, null));
				hsv.register(new RoomVO(i+(j < 10 ? "0" : "")+j, null, true, null, null));
			}
		}
		System.out.println("호텔 생성 완료");
	}

	private void frontDesk() {
		int menu, isOk = 0;
		boolean flag = true;
		String roomNum, user = null;
		
		while (flag) {
			System.out.println("\n========================= 호텔 관리 메뉴 ========================");
			System.out.println("1:객실현황  2:입실  3:퇴실  4:객실상세조회  Etc:종료");
			System.out.println("------------------------------------------------------------------");
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>메뉴를 선택하세요>>>>>>>>>>>>>>>>>>>>>>>>");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				list = hsv.getList();
				for (RoomVO rvo : list) {
					System.out.println(rvo);
				}
				break;
			case 2:
				System.out.println("입실할 호실 > ");
				roomNum = sc.next();
				System.out.println("성함 > ");
				user = sc.next();
				isOk = hsv.checkInModify(new RoomVO(roomNum, user, false, null, null));
				if (isOk > 0) {
					System.out.println(roomNum + "호 입실 완료");
				} else {
					System.out.println(roomNum + "호는 현재 사용중");
				}
				break;
			case 3:
				System.out.println("퇴실할 호실 > ");
				roomNum = sc.next();
				isOk = hsv.checkOutModify(new RoomVO(roomNum, null, true, null, null));
				if (isOk > 0) {
					System.out.println(roomNum + "호 퇴실 완료");
				} else {
					System.out.println(roomNum + "호는 현재 빈방");
				}
				break;
			case 4:
				System.out.println("조회할 방 번호 > ");
				roomNum = sc.next();
				System.out.println(hsv.getDetail(roomNum));
				break;
			case 5:
				
				break;
			default:
				System.out.println("이용해 주셔서 감사합니다");
				flag = false;
				break;
			}
		}
		System.out.println("프로그램을 종료합니다");
	}
	
	
}
