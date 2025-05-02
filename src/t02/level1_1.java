package t02;

public class level1_1 {

	public static void main(String[] args) {
		//정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
		  int answer = 0;
		  int n =5; 
	        for (int i = 1;  i<=n/2; i++){
        	// / 몫 % 나머지 
	        if(n  % i == 0 ) answer += i;       
	        System.out.println(answer);
	        }

	        System.out.println(answer+n);
		
	}

	
	 public static int solution(int num1, int num2) {
	        return num1%num2;
	    }
	 
}
