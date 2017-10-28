package Question.Page_110;
/* 다음 예제를 if~else문으로 수정해보자
class CondOp {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 100;
        int big;
        int diff;

        big = (num1 > num2) ? num1 : num2;
        System.out.println("큰 수: " + big);

        diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);
        System.out.println("절대값: " + diff);
    }
}
*/

class Q05_2_0 {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 100;
        int big;
        int diff;
        
        if (num1 > num2)
            big = num1;
        else
            big = num2;
        System.out.println("큰 수: " + (big));

        if (num1 > num2) 
            diff = num1 - num2;
        else
            diff = num2 - num1;
        System.out.println("절대값: " + (diff));
    }
}