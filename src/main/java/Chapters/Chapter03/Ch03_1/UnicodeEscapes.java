package Chapters.Chapter03.Ch03_1;
class UnicodeEscapes {
	public static void main(String[] args) {
		System.out.println("오늘의 환율은 1$에 0.88" + '\u20ac' + "입니다.");
		// = System.out.println("오늘의 환율은 1$에 0.88\u20ac입니다.");
	}
}