package Chapters.Chapter07.Ch07_2;

class BankAccount {
	String accNumber; // 계좌번호 
	String ssNumber; // 주민번호
	int balance = 0; // 예금 잔액
	
	//초기화를 위한 메서드
	public void initAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal; // 계좌 개설 시 예금액으로 초기화
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}

	public int checkMyBalance() {
		System.out.printf("%-4s : %-15s\n", "계좌번호",  accNumber);
		System.out.printf("%-4s : %-15s\n", "주민번호", ssNumber);
		System.out.printf("%-4s : %-15s\n", "    잔액", balance);
		return balance;
	}
}

class BankAccountUnilD {

	public static void main(String[] args) {
		BankAccount yoon = new BankAccount(); // 계좌생성
		yoon.initAccount("12-34-89", "990990-9090990", 10000); // 초기화
		
		BankAccount park = new BankAccount(); // 계좌생성
		park.initAccount("33-55-09", "770088-5959007", 10000);
		
		yoon.deposit(5000);
		park.deposit(3000);
		yoon.withdraw(2000);
		park.withdraw(2000);
		yoon.checkMyBalance();
		park.checkMyBalance();
	}
}
