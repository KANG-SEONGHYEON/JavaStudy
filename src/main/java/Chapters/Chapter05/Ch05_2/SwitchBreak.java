package Chapters.Chapter05.Ch05_2;
class SwitchBreak {
/* 기본 Switch문
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
*/ 

// switch문 + break문
    public static void main(String[] args) {
        int n = 3;

        switch(n) {
        case 1 :
            System.out.println("Simple Java");
            break;
        case 2 :
            System.out.println("Fynny Java");
            break;
        case 3 :
            System.out.println("Fantastic Java");
            break;
        default :
            System.out.println("The best programming language");            
        }
        System.out.println("Do you like Java?");
    }
}

/* 둘 이상의 레이블을 묶어서 둘 수도 있다.
    public static void main(String[] args) {
        int n = 3;

        switch(n) {
        case 1 :
        case 2 :
        case 3 :
            System.out.println("case 1, 2, 3");
            break;
        default :
            System.out.println("The best programming language");            
        }
        System.out.println("Do you like Java?");
    }
}
*/