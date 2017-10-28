package Chapters.Chapter05.Ch05_4;
class ContinueBasic {
    public static void main(String [] args) {
        int num = 0;
        int count = 0;

        while((num++) < 100) {
            if(((num % 5) != 0) || ((num % 7) != 0)) 
                continue; // 5와 7의 배수 아니라면 나머지 건너뛰고 위로 이동
            count++;    
            System.out.println(num);
            
        }
            System.out.println("count: " + count);
    }
}