package Chapters.Chapter07.Ch07_1;

class BankAccountD {
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

class DupRef {
	public static void main(String[] args) {
		
		BankAccountD ref1 = new BankAccountD();
		BankAccountD ref2 = ref1; // ref1의 주소를 ref2에도 넣는다.
		
		ref1.deposit(3000);
		ref2.deposit(2000);
		ref1.withdraw(400);
		ref2.withdraw(300);

		ref1.checkMyBalance();
		ref2.checkMyBalance();
	}
}
