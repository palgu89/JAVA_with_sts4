package list.addrbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressMenu {
	
	// 상수느낌으로 클래스 실행될 때 바로 실행
	private Scanner sc = new Scanner(System.in);
	private int menu;
	private boolean flag = true;
	private final String MENU_STR = "1.추가 2.검색 3.수정 4.삭제 5.전체출력 6.데이터초기화 0.종료";
	// 자바의 상수 표현법 MENU_STR
	
	public void processor(ArrayList<Address> addrDatas) {
		int idx = 0;
		while (flag) {
			System.out.println(MENU_STR);
			menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				addrDatas.add(inputObject());	// inputObject의 타입은 Address
				break;
			case 2:
				idx = searchIndex(addrDatas);
				if (idx < 0) {
					System.out.println("찾는 정보가 없습니다");
				} else {
					System.out.println(addrDatas.get(idx));
				}
				break;
			case 3:
				idx = searchIndex(addrDatas);
				System.out.println("수정할 정보를 입력합니다...");
				addrDatas.add(idx, inputObject());
				addrDatas.remove(idx+1);
				// 추가를 먼저 했으니 인덱스가 밀렸다
				// => 수정할 정보가 기존 인덱스에서 +1 됐으므로 idx +1 
				break;
			case 4:
				idx = searchIndex(addrDatas);
				addrDatas.remove(idx);
				break;
			case 5:
				for (Address address : addrDatas) {
					System.out.println(address);	// toString의 모양으로 나옴
					// toString이 없다면 주소값을 출력함
					// System.out.println(address.hashCode());	// 객체마다 고유번호를 알려줌
				}
				break;
			case 6:
//				addrDatas.removeAll(addrDatas);
//				System.out.println("데이터가 초기화 되었습니다");
				// 선생님버전
				addrDatas.clear();
				break;
			case 0:
				// 선생님버전
				flag = false;
				System.out.println("프로그램을 종료합니다");
				break;
				// return;

			default:
				break;
			}
		}
	}

	private int searchIndex(ArrayList<Address> addrDatas) {
		System.out.println("1.이름으로 찾기 2.전화번호로 찾기");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("이름 > ");
			String name = sc.next();
			
			for (int i = 0; i < addrDatas.size(); i++) {
				if (name.equals(addrDatas.get(i).getName())) {
					// addrDatas.get(i) => adress 객체 꺼내오고
					// .getName() => name을 가져옴
					return i;
				}
			}
		} else {
			System.out.println("전화번호 > ");
			String tel = sc.next();
			
			for (int i = 0; i < addrDatas.size(); i++) {
				if (tel.equals(addrDatas.get(i).getTel())) {
					return i;
				}
			}
		}
		return -1;
	}

	private Address inputObject() {
		System.out.println("이름 > ");
		String name = sc.next();
		System.out.println("전화번호 > ");
		String tel = sc.next();
		System.out.println("주소 > ");
		String addr = sc.next();
		
//		Address address = new Address(name, tel, addr);
//		return address;
		return new Address(name, tel, addr);
	}

}
