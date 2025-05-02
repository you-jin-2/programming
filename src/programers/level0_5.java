package programers;

import java.util.Arrays;

public class level0_5 {

	public static void main(String[] args) {
		//정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
		System.out.println("시작===========");
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(solution2(num_list));	
		
		
		int[] num_list3 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		System.out.println(solution2(num_list3));
		
	}

	
	 public static double solution(int[] num_list) {
		 double answer = 0;
			for (int num : num_list) {
				answer += num;   
			}
			// 55.0 10개  1034.0 11
			double answer2 =  Math.round(answer / num_list.length  * 1000) /1000.0;
	        return answer2;
	    }
	 
	 public static double solution2(int[] numbers) {
		 return Arrays.stream(numbers).average().orElse(0);
	 }
	 
}
