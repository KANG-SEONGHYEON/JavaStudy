package Chapters.Chapter05.Ch05_5;
class ByTimes {
    public static void main(String[] args) {
        for(int i = 2; i < 10; i++) { // 2단부터 9단까지 진행 바깥쪽 for문
            for(int j = 1; j < 10; j++) { //1부터 9까지의 곱 진행 안쪽 for문
                System.out.println(i + " X " + j + " = " + (i * j));
                // 굳이 곱셈의 괄호는 필요없으나 연산의 순서를 알기 쉽도록
            }
        }
    }
}