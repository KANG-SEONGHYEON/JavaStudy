package Chapters.Chapter05.Ch05_1;
class IEBasic {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 7;

        // if문
        if(n1 < n2) {
            System.out.println("n1 > n2 is true");
        }

        // if ~ else문
        if(n1 == n2) {
            System.out.println("n1 = n2 is true");
        }
        else {
            System.out.println("n1 == n2 is false");
        }
    }     
}