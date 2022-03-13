package list.member.login;

import java.util.ArrayList;

public class Login {

	public static void main(String[] args) {
		ArrayList<Join> memberDatas = new ArrayList<>();
		JoinMenu joinMenu = new JoinMenu();
		joinMenu.processor(memberDatas);
	}

}
