package t02;

public class level1_4 {

	public static void main(String[] args) {
		/*
		  제곱근계산
		 * */
		  String s = "-1234"; 
		  
	        System.out.println(solution(121));
	        
	}
	
	 public static long solution(long n) {
	      if (Math.pow((int)Math.sqrt(n), 2) == n) {
	            return (long) Math.pow(Math.sqrt(n) + 1, 2);
	        }

	        return -1;
	  }
	 
	 public static long solution2(long n) {
	      if (Math.pow((int)Math.sqrt(n), 2) == n) {
	            return (long) Math.pow(Math.sqrt(n) + 1, 2);
	        }

	        return -1;
	  }
 
}
