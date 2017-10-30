package Chapters.Chapter07.Ch07_1;

class BankAccountP {
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

class PassingRef {
	public static void main(String[] args) {

		BankAccountP ref = new BankAccountP();
		ref.deposit(3000);
		ref.withdraw(300);
		check(ref);
	}

	public static void check(BankAccountP acc) {
			acc.checkMyBalance();

	}
}
