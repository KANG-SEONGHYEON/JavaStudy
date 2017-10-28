package Chapters.Chapter05.Ch05_4.Prepare;
class InfinityLoopDoTest {
    public static void main(String [] args) {
        int num = 1;
        
        do {
            if(((num % 6) == 0) && ((num % 14) == 0)) 
                break;
            num++;    
        } while (true);
        System.out.println(num);
    }
}