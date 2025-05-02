package programers;

public class level0_3 {

	public static void main(String[] args) {
		//정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
		System.out.println("시작===========");
		int num1 = 3;
		int num2 = 2;
		System.out.println(solution(num1,num2));
		num1 = 11;
		num2 = 11;
		System.out.println(solution(num1,num2));
		num1 = 7;
		num2 = 99;
		System.out.println(solution(num1,num2));
		
		
	}

	
	 public static int solution(int num1, int num2) {
 	        return num1 - num2;
	    }
	 
}
