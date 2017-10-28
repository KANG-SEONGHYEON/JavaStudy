package Question.Page_129;
class Q05_6_1 {
	
// for문으로 바꾸기
	
	public static void main(String [] args) {
		int count = 0;

		for(int num = 1; num <= 100; num++) {
			if(((num % 5) != 0) || ((num % 7) != 0)) 
				continue; // 5와 7의 배수 아니라면 나머지 건너뛰고 위로 이동
			count++;
			System.out.println(num);
	    }
		System.out.println("count: " + count);
	    }
	}