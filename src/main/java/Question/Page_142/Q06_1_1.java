package Question.Page_142;
class Q06_1_1 {
   public static void main(String[] args) {
	   fourFund(1, 2);
	   System.out.println();
	   fourFund(13, 8);
   }

   public static void fourFund(int a, int b) {
	   System.out.println(a + " + " + b + " = " + (a + b));
	   System.out.println(a + " - " + b + " = " + (a - b));
	   System.out.println(a + " * " + b + " = " + (a * b));
	   System.out.println(a + " / " + b + " = " + (a / b));
	   System.out.println(a + " / " + b + "의 나머지는 " + (a % b) + "입니다.");
   }
}


