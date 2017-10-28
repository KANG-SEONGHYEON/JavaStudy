package Chapters.Chapter03.Ch03_1;
class IntegerLiterals {
	public static void main(String[] args) {
		int num1 = 123;   // 10진수
		int num2 = 0123;  // 8진수
		int num3 = 0x123; // 16진수

		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);

		System.out.println("11 + 22 + 33 = " + (11 + 22 + 33));
		System.out.println("011 + 022 + 033 = " + (011 + 022 + 033));
		System.out.println("0x11 + 0x22 + 0x33 = " + (0x11 + 0x22 + 0x33));
	}
}