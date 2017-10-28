package Chapters.Chapter05.Ch05_5.Prepare;
class ByTimes {
    public static void main(String[] args) {
        for(int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                for(int k = 1; k < 10; k++) {
                    System.out.println(i + " X " + j + " X " + k + " = " + (i * j * k));
                }
            }
        }
    }
}