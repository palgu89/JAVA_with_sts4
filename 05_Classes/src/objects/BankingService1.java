package objects;
//계좌현황, 입금, 출금, 종료
// 계좌 클래스는 예금주, 계좌번호, 잔액 속성을 갖는다
// 계좌 클래스는 입금과 출금을 정상적으로 진행하는 메서드를 갖는다

// 제출 : 2021-11-08 14:00 까지
// midaseye@naver.com
// java_hw_20211108_이름.java, zip

// optional 과제 => 퀴즈2, 3, 4 클래스를 활용해서 코드 리팩토링 해보기 

class BankAccount1 {
	String owner = "Park_s";
	int accountNumber = 100200300;
	double deposit = 0.0;
	
	public void saving(int money) {
		deposit = deposit + money;
	}
	
	public void withdraw(int money) {
		if (deposit < money) {
			System.out.println("잔액이 부족합니다!");
		} else {
			deposit = deposit - money;
		}
	}
	
}

public class BankingService1 {

	public static void main(String[] args) {
		BankAccount1 myBa = new BankAccount1();
		
		System.out.println("현재 잔액 : " + myBa.deposit);
		
		myBa.saving(1000000);
		System.out.println("현재 잔액 : " + myBa.deposit);
		
		myBa.withdraw(500000);
		System.out.println("현재 잔액 : " + myBa.deposit);
		
		myBa.withdraw(500001);
		System.out.println("현재 잔액 : " + myBa.deposit);
		
	}
}
