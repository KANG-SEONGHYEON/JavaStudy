package Chapters.Chapter05.Ch05_2;
class SwitchBasic {
    public static void main(String[] args) {
        int n = 3;

        switch(n) {
        case 1 :
            System.out.println("Simple Java");
        case 2 :
            System.out.println("Fynny Java");
        case 3 :
            System.out.println("Fantastic Java");
        default :
            System.out.println("The best programming language");            
        }
        System.out.println("Do you like Java?");
    }
}

