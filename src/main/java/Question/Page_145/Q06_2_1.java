package Question.Page_145;
class Q06_2_1 {
   public static void main(String[] args) {
       System.out.println("원의 둘레(10): " + calCircleRound(10.0));
       System.out.println("원의 넓이(5): " + calCircleArea(5));
   }

   public static double calCircleArea(double rad) {
	   final double PI = 3.14;
	   return rad*rad*PI;
			   
   }
   
   public static double calCircleRound(double rad) {
	   final double PI = 3.14;
	   return 2*PI*rad;
   }
}


