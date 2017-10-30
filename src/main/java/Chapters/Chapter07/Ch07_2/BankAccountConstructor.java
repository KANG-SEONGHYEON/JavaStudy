package Chapters.Chapter07.Ch07_2;

class BankAccountC {
	String accNumber; // 계좌번호 
	String ssNumber; // 주민번호
	int balance; // 예금 잔액
	
	public BankAccountC(String acc, String ss, int bal) { // 생성자
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
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

class BankAccountConstructor {

	public static void main(String[] args) {
		BankAccountC yoon = new BankAccountC("12-34-89", "990990-9090990", 10000);
		BankAccountC park = new BankAccountC("33-55-09", "770088-5959007", 10000);
		
		yoon.deposit(5000);
		park.deposit(3000);
		yoon.withdraw(2000);
		park.withdraw(2000);
		yoon.checkMyBalance();
		park.checkMyBalance();
	}
}
