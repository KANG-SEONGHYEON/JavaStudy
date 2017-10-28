package Chapters.Chapter05.Ch05_1;
class IEIE {
    public static void main(String[] args) {
        int num = 120;

        if(num < 0)    // 먼저 심사
            System.out.println("0 미만");
        else if(num < 100)  // 위 조건이 만족되지 않으면 여기서 다시 검사
            System.out.println("0 이상 100미만");
        else // 아무것도 만족되지 않으면 else에 속한 문장 실행
            System.out.println("100 이상"); 
    }
}