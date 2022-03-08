package objects;

import java.util.Scanner;

class BankAccount {
	String accountHolder = "손필규";
	String accountNumber = "111-111111-11-111";
	int balance = 20000000;
	
	void deposit(int deposit) {
		balance += deposit;
		System.out.println("입금 후 잔액: "+balance);
	}

	void withdraw(int withdraw) {
		System.out.println("수수료: 1200원");
		balance = balance - withdraw - 1200;
		System.out.println("출금 후 잔액: "+balance);
	}

	void remit(String remitNumber) {
		Scanner sc = new Scanner(System.in);
		System.out.println("송금할 금액을 입력해 주세요");
		int remitAmount = sc.nextInt();
		System.out.println("수수료: 1200원");
		System.out.println("송금 계좌: "+remitNumber);
		System.out.println("송금액: "+remitAmount);
		if(!remitNumber.equals(accountNumber)) {			
			balance = balance - remitAmount - 1200;
		}
		System.out.println("송금 후 잔액: "+balance);
	}
}

public class BankingService {

	public static void main(String[] args) {
		// 계좌 현황, 입금, 출금, 종료
		// 계좌 클래스는 예금주, 계좌번호, 잔액 속성을 갖는다
		// 계좌 클래스는 입금과 출금을 정상적으로 진행하는 메서드를 갖는다
		
		// 제출: 2021-11-08 14:00까지
		// midaseye@naver.com
		// java_hw_20211108_이름.java, zip
		
		// optional 과제 => 퀴즈2, 3, 4 클래스를 활용해서 코드 리팩토링 해보기
		
		BankAccount ba = new BankAccount();
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		boolean flag = true;
		while (flag) {
			menu = printMenu(sc);
			switch (menu) {
			case 1:
				currMethod(ba);
				break;
			case 2:
				depositMethod(ba, sc);
				break;
			case 3:
				withdrawMethod(ba, sc);
				
				break;
			case 4:
				remitMethod(ba, sc);
				break;
			default:
				System.out.println("사용해주셔서 감사합니다");
				flag = false;
				break;
			}
		}
		
	}

	private static void remitMethod(BankAccount ba, Scanner sc) {
		System.out.println("송금할 계좌번호을 입력해주세요");
		System.out.println("ex)000-000000-00-000");
		String remitNumber = sc.next();
		ba.remit(remitNumber);
	}

	private static void withdrawMethod(BankAccount ba, Scanner sc) {
		System.out.println("출금할 금액을 입력해주세요");
		int withdraw = sc.nextInt();
		ba.withdraw(withdraw);
	}
	
	private static void depositMethod(BankAccount ba, Scanner sc) {
		System.out.println("입금할 금액을 입력해주세요");
		int deposit = sc.nextInt();
		ba.deposit(deposit);
	}
	private static void currMethod(BankAccount ba) {
		System.out.println("계좌 현황");
		System.out.println("성명: "+ba.accountHolder);
		System.out.println("계좌번호: "+ba.accountNumber);
		System.out.println("잔액: "+ba.balance);
	}

	private static int printMenu(Scanner sc) {
		System.out.println("======================ATM======================");
		System.out.println("1: 계좌현황  2: 입금  3: 출금  4: 송금  5: 종료");
		System.out.println("===============================================");
		System.out.println(">>>>>>>원하시는 메뉴의 번호를 입력하세요>>>>>>>");
		int menu = sc.nextInt();
		return menu;
	}

}
