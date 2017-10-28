package Question.Page_142;
class Q06_1_2 {
   public static void main(String[] args) {
	   absVal(-5,10);
	   System.out.println();
	   absVal(10, -5);
	   System.out.println();
	   absVal(100, 800);
   }

   public static void absVal(int n1, int n2) {
	   if (n1 > n2)
		   System.out.println(n1 - n2);
	   else
		   System.out.println(n2 - n1);
   }
}


