package Chapters.Chapter07.Ch07_1;

class BankAccountOO {
	static int balance = 0; // 예금 잔액

	public static void main(String[] args) {
		deposit(10000);
		checkMyBalance();
		withdraw(3000);
		checkMyBalance();
	}

	public static int deposit(int amount) { // 입금을 담당하는 메소드
		balance += amount;
		return balance;
	}

	public static int withdraw(int amount) {// 출금을 담당하는 메소드
		balance -= amount;
		return balance;
	}

	public static int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
}
