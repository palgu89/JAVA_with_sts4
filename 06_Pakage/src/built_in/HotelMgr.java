package built_in;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class User {
	private String name;
	private int age;
	private char gen;
	
	public User() {}
	
	public User(String name, int age, char gen) {
		this.name = name;
		this.age = age;
		this.gen = gen;
	}	// 아래에서 호출하고 거기서 클릭으로 생성자를 만들든지
		// 여기 와서 alt + shift + s 로 생성자를 생성하든지 둘 중 하나

	// Room room;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGen() {
		return gen;
	}
	public void setGen(char gen) {
		this.gen = gen;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", gen=" + gen + "]";
	}
}

class Room {	// 클래스를 보면 뭘 실행은 하지 않고 값만 주고 있음 > Value Object (VO)라고 함
	private String roomNum;	// floor와 room이 나눠져 있으므로 합치려면 string이 편하다
	private User user;
	private boolean empty;
	private String checkInTime;
	private String checkOutTime;
	
	public Room() {}
	
	// 호텔 만들 때 룸 초기화용 생성자
	public Room(User user, String roomNum, boolean empty, String checkInTime) {
		this.roomNum = roomNum;
		this.user = user;
		this.empty = empty;
		this.checkInTime = checkInTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRoomNum() {
		return roomNum;
	}

//	public void setRoomNum(String roomNum) {
//		this.roomNum = roomNum;
//	}

	public boolean isEmpty() {	// boolean 형은 getter의 개념이 아니라 get 대신 is가 붙는다
		return empty;
	}

	public void setEmpty(boolean empty) {	// setter는 값을 setting하는 거라 set이 붙음
		this.empty = empty;
	}

	public String getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}

	public String getCheckOutTime() {
		return checkOutTime;
	}
	
	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
	
	@Override
	public String toString() {	// alt + shift + s => generate toString
		return "Room [roomNum=" + roomNum + ", isEmpty=" + empty + ", checkInTime=" + checkInTime + ", checkOutTime=" + checkOutTime
				+ "]";
	}	// object class 소속 => 속해있는 정보값을 모두 나열해 준다
		// 내용은 고칠 수 있으나 포맷은 그대로 유지해야 된다
		// user는 위에 새로 override 해줬으니 user는 삭제했다	
}

class Hotel {	// 동적인 실행을 하는 클래스 > Service Object
	private Room[][] rooms;
	private String hotelName;
	
	public Hotel() {	// 생략가능 - 실행할 로직이 없고 디폴트 생성자만 사용할 경우
		buildHotel();
	}
	
	public void buildHotel() {
		Scanner sc = new Scanner(System.in);
		System.out.println("호텔이름을 입력 > ");
		this.hotelName = sc.next();
		System.out.println("호텔의 층 수를 입력 > ");
		int floorCount = sc.nextInt();
		System.out.println("층 당 방 수를 입력 > ");
		int roomCount = sc.nextInt();
		rooms = new Room[floorCount][roomCount];
		
		initRomms();
	}

	private void initRomms() {
		// 호텔 배열의 모든 값을 Room 객체로 초기화
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				rooms[i][j] = new Room(null, convertRoomNum(i, j), true, null);
//				System.out.print(rooms[i][j].getRoomNum()+"호\t"); 	// 생성확인 테스트용
//				System.out.print("사용자: "+rooms[i][j].getUser()+"\t"); 	// 생성확인 테스트용
//				System.out.print("빈방?: "+rooms[i][j].isEmpty()+"\t"); 	// 생성확인 테스트용
//				System.out.print("입실시간: "+rooms[i][j].getCheckInTime()+"\n"); 	// 생성확인 테스트용
				// System.out.println(rooms[i][j]);	// 원래는 주소값이 나와야 하지만 위에 @Override toString을 해놨기 때문에 원하는 정보값들이 나옴
				// System.out.println(rooms[i][j].toString());	// 이건 @Override를 하지 않았을 때 내가 toString이란 함수를 만들어서 정보값을 받을 때
			}
		}
	}

	private String convertRoomNum(int i, int j) {	// case 2를 역으로
		String roomNum = "";
		if (j < 9) {	// 9면 10호, 8이면 9호에 해당
			roomNum = "0" + String.valueOf(j+1);
		} else {
			roomNum = String.valueOf(j+1);
		}
		return String.valueOf(i+1)+roomNum;	// 층+호수 리턴
	}

	public void goFrontDesk() {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		boolean flag = true;
		
		while (flag) {
			System.out.println("\n=================="+this.hotelName+"호텔 관리 메뉴 ====================");
			System.out.println("1: 객실현황  2: 입실  3: 퇴실  4: 객실상세조희  5: 투숙객 조희  Etc: 종료");
			System.out.println("=========================================================================");
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>메뉴를 선택하세요>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			menu = sc.nextInt();
			
			flag = choiceMenu(menu);
		}
		System.out.println("프로그램을 종료합니다");
	}

	private boolean choiceMenu(int menu) {
		Scanner sc = new Scanner(System.in);
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
			roomGetDetail(roomNum);
			break;
		case 5:
			System.out.println("------------------투숙객 리스트 -----------------");
			getUserList(this.rooms);
			break;
		default:
			System.out.println("저희 호텔을 이용해 주셔서 감사합니다");
			return false;
		}
		return true;
		}
	
	private void getUserList(Room[][] rooms) {
		for (Room[] rooms1 : rooms) {	// 한 층의 정보
			for (Room room : rooms1) {	// 층당 방 하나의 정보
				System.out.print(room.getRoomNum()+"호: ");
				System.out.println(room.getUser().getName()+" 님");
			}
		}
		
//		for (int i = 0; i < rooms.length; i++) {
//			for (int j = 0; j < rooms[i].length; j++) {
//				if (rooms[i][j].getUser() != null) {
//					System.out.print(rooms[i][j].getRoomNum()+"호: ");
//					System.out.println(rooms[i][j].getUser().getName()+" 님");
//				}
//			}
//		}
	}

	private void roomGetDetail(String roomNum) {
		int floor = 0, room = 0;
		if (roomNum.length() > 3) {
			floor = Integer.parseInt(roomNum.substring(0, 2))-1;
			room = Integer.parseInt(roomNum.substring(2))-1;
		}else {
			floor = Integer.parseInt(roomNum.substring(0, 1))-1;
			room = Integer.parseInt(roomNum.substring(1))-1;
		}
		System.out.println(rooms[floor][room]);
		System.out.println(rooms[floor][room].getUser());	// 입실할 때 User 객체를 넣지 않음 > null
//		Room roomObj = rooms[floor][room];	// 또는 그냥 System.out.println(rooms[floor][room]);	
//		System.out.println(roomObj.getRoomNum());
//		System.out.println(roomObj.getUser());
//		System.out.println(roomObj.isEmpty());
//		System.out.println(roomObj.getCheckInTime());
//		System.out.println(roomObj);
		
//		User userObj = roomObj.getUser();	// 또는 그냥 System.out.println(rooms[floor][room].getUser());
//		System.out.println(userObj.getName());
//		System.out.println(userObj.getAge());
//		System.out.println(userObj.getGen());
//		System.out.println(userObj);	// 입실할 때 User 객체를 넣지 않음 => null
	}

	private void roomCheckOut(String roomNum) {
		int floor = 0, room = 0;
		if (roomNum.length() > 3) {
			floor = Integer.parseInt(roomNum.substring(0, 2))-1;
			room = Integer.parseInt(roomNum.substring(2))-1;
		}else {
			floor = Integer.parseInt(roomNum.substring(0, 1))-1;
			room = Integer.parseInt(roomNum.substring(1))-1;
		}
		if (!rooms[floor][room].isEmpty()) {
			rooms[floor][room].setEmpty(true);
			rooms[floor][room].setUser(null);	// 퇴실시 유저 정보 초기화
			rooms[floor][room].setCheckInTime("");
			LocalDateTime todayNow = LocalDateTime.now();
			rooms[floor][room].setCheckOutTime(
					DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
					.format(todayNow)
					);
			
			System.out.println(roomNum + "호 퇴실완료");
		} else {
			System.out.println(roomNum +"호는 현재 빈방 > 다른 방을 선택하세요");
		}
	}
	
	private void roomCheckIn(String roomNum) {
		
		int floor = 0, room = 0;
		if (roomNum.length() > 3) {	// 1004호 => 1004 => 10, 04 => 9, 3
			floor = Integer.parseInt(roomNum.substring(0, 2))-1;
			room = Integer.parseInt(roomNum.substring(2))-1;
		}else {	// 808호 => 808 => 8, 08 => 7, 7
			floor = Integer.parseInt(roomNum.substring(0, 1))-1;
			room = Integer.parseInt(roomNum.substring(1))-1;
		}
		if (rooms[floor][room].isEmpty()) {
			rooms[floor][room].setEmpty(false);
			
			User user = getUserInfo();
			rooms[floor][room].setUser(user);
			LocalDateTime todayNow = LocalDateTime.now();
			rooms[floor][room].setCheckInTime(
					DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
					.format(todayNow)
					);	// localDateTime을 설정할 계획
			
			if(rooms[floor][room].getCheckInTime().length() > 0) {	// 입실 시 기존 체크아웃기록 삭제
				rooms[floor][room].setCheckOutTime("");
			}
			System.out.println(roomNum + "호 입실완료");
		} else {
			System.out.println(roomNum +"호는 현재 사용중 > 다른 방을 선택하세요");
		}
	}
	
	private User getUserInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("투숙객의 정보를 입력해야 합니다");
		System.out.println("이름 > ");
		String name = sc.next();
		System.out.println("나이 > ");
		int age = sc.nextInt();
		System.out.println("성별 > ");
		char gen = sc.next().charAt(0);
		
		// User user = new User(name, age, gen);
		// return user;
		return new User(name, age, gen);
	}

	private void getRoomsStatus() {
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				System.out.print(rooms[i][j].getRoomNum() + "호: ");
				System.out.print(rooms[i][j].isEmpty() ? "입실가능" : "사용중");
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}

public class HotelMgr {

	public static void main(String[] args) {
		// 호텔 예약 프로그램
		
		Hotel hotel = new Hotel();	// 호텔 객체 생성
		// hotel.buildHotel();
		
		hotel.goFrontDesk();	// getMenu(); 호텔이용 메뉴 선택
	}
}
