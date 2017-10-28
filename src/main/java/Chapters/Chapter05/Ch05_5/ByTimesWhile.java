package Chapters.Chapter05.Ch05_5;
class ByTimesWhile {
    public static void main(String[] args) {
        int i = 2;
        int j;
        
        while (i < 10) {
            j = 1;
            while (j < 10) {
                System.out.println(i + " X " + j + " = " + (i * j));
                j++;
            }
            i++;
        }
    }
}