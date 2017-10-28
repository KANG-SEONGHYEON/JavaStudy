package Question.Page_129;
class Q05_6_2 {
    public static void main(String[] args) {
        int sum = 0;
        int num = 1; 
    
        while(true) {
            if(num % 2 != 0)
                sum += num;

            if(sum > 1000) {
                System.out.println(num + " 더할 때 1000을 넘는다.");
                System.out.println("초과된 값: " + sum);
                break;
            }
            num++;
        }
    }
}

