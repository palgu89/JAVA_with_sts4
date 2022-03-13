package list.addrbook;

import java.util.ArrayList;

public class AddressBook {

	public static void main(String[] args) {
		ArrayList<Address> addrDatas = new ArrayList<>();
		AddressMenu addrMenu = new AddressMenu();
		addrMenu.processor(addrDatas);
	}

}
