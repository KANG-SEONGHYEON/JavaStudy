package Question.Page_122;
class Q05_4_3 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while(num <= 1000) {
            if((num % 2) == 0 && (num % 7) ==0) {
                System.out.println(num);
                sum += num;
            }
            num++;
        }
        System.out.println("합: " + sum);
    }
}