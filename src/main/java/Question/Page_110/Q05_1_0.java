package Question.Page_110;
/*아래의 두 개의 if문을 하나의 if문으로 변경하라
class IfReit {
    public static void main(String[] args) {
        int num = 120;
        if(num > 0) {
            if((num % 2) == 0)
                System.out.println("양수이면서 짝수");
        }
    }
}
*/
class Q05_1_0 {
    public static void main(String[] args) {
        int num = 120;
        
        if (num > 0 && (num % 2) == 0);
                System.out.println("양수이면서 짝수");
    }
}

