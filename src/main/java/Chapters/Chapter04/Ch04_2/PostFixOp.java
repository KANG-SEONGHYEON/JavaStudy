package Chapters.Chapter04.Ch04_2;
class PostFixOp {
    public static void main(String[] args) {
        int num = 5;
        System.out.print((num++) + " "); // 출력 후에 값 1 증가
        System.out.print((num++) + " "); // 출력 후에 값 1 증가
        System.out.print(num + "\n");

        System.out.print((num--) + " "); // 출력 후에 값 1 감소
        System.out.print((num--) + " "); // 출력 후에 값 1 감소
        System.out.print(num);
    }
}