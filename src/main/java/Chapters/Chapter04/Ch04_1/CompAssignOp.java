package Chapters.Chapter04.Ch04_1;
class CompAssignOp {
    public static void main(String[] args) {
        short num = 10;
        num = (short)(num + 77L);
        int rate = 3;
        rate = (int)(rate * 3.5);
        System.out.println(num);
        System.out.println(rate);

        num = 10;
        num += 77L; // 자동형 변환되어 계산됨
        rate = 3;
        rate *= 3.5; // 자동형 변환되어 계산됨
        System.out.println(num);
        System.out.println(rate);
    }
}