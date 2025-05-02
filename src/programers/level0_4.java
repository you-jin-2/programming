package programers;

import java.util.Iterator;

public class level0_4 {

	public static void main(String[] args) {
		//정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
		System.out.println("시작===========");
		int[] num_list = {1, 2, 3, 4, 5};
		num_list = solution(num_list);
		for (int num_list2 : num_list) {
			System.out.println(num_list2);	
		}
		
		
		int[] num_list2 = {1, 2, 3, 4, 5};
		solution(num_list2);
		
	}

	
	 public static int[] solution(int[] num_list) {
		 int one = 0;
		 int two = 0;
			for (int num_list2 : num_list) {
				   if(num_list2 % 2 == 1) one++;  
				   else two++;
			}
			int[] answer = {two,one};	
		 
		 
	        return answer;
	    }
	 
}
