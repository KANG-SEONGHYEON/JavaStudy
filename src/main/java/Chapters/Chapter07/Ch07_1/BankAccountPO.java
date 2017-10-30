package Chapters.Chapter07.Ch07_1;

class BankAccount {
	int balance = 0; // 예금 잔액

	public int deposit(int amount) { // 입금을 담당하는 메소드
		balance += amount;
		return balance;
	}

	public int withdraw(int amount) {// 출금을 담당하는 메소드
		balance -= amount;
		return balance;
	}

	public int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
}

class BankAccountPO {
	public static void main(String[] args) {
		// 두 개의 인스턴스 생성
		BankAccount yoon = new BankAccount();
		BankAccount park = new BankAccount();
		
		// 각 인스턴스를 대상으로 예금 입금
		yoon.deposit(5000);
		park.deposit(3000);
		
		// 각 인스턴스를 대상으로 예금 출금
		yoon.withdraw(2000);
		park.deposit(2000);
		
		// 각 인스턴스를 대상으로 잔액을 조회
		yoon.checkMyBalance();
		park.checkMyBalance();
	}
}
