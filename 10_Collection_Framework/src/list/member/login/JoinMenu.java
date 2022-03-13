package list.member.login;

import java.util.ArrayList;
import java.util.Scanner;

public class JoinMenu {
	private Scanner sc = new Scanner(System.in);
	private int menu;
	private boolean flag = true;
	private final String MENU_STR = "1.회원가입 2.로그인 3.종료";
	
	public void processor(ArrayList<Join> memberDatas) {
		while (flag) {
			System.out.println(MENU_STR);
			menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				memberDatas.add(inputObject());
				break;
			case 2:
				login(memberDatas);
				break;
			case 3:
				System.out.println("프로그램을 종료합니다");
				flag = false;
				break;
			default:
				break;
			}
		}
		
	}

	private void login(ArrayList<Join> memberDatas) {
		System.out.println("아이디 입력: ");
		String id = sc.next();
		System.out.println("비밀번호 입력: ");
		String pwd = sc.next();
		
		for (int i = 0; i < memberDatas.size(); i++) {
			if(id.equals(memberDatas.get(i).getId())) {
				if (pwd.equals(memberDatas.get(i).getPwd())) {
					System.out.println(id + "님이 로그인에 성공하였습니다");
				} else {
					System.out.println("비밀번호가 틀렸습니다");
				}
			}
		}
	}

	private Join inputObject() {
		System.out.println("아이디를 입력: ");
		String id = sc.next();
		System.out.println("비밀번호 입력: ");
		String pwd = sc.next();
		
		return new Join(id, pwd);
	}
	
	
	
}
