package programers;

import java.util.Arrays;

public class level0_6 {

	public static void main(String[] args) {
		/*
		선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
		가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
		삼각형의 세 변의 길이가 담긴 배열 numbers이 매개변수로 주어집니다. 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.
		*/
		System.out.println("시작===========");
		int[] num_list = {1, 2, 3};
		System.out.println(solution(num_list));	
		
		int[] num_list2 = {3, 6, 2};
		System.out.println(solution(num_list2));
		
		int[] num_list3 = {199, 72, 222};
		System.out.println(solution(num_list3));
		
	}

	
	 public static int solution(int[] num_list) {
		 int answer = 0;
		 int val = 0;
		 int sum = 0;
		 
			for (int num : num_list) {
				sum += num;
				if(val < num) val = num;
			}
			answer = (sum-val) > val ? 1 : 2 ;
			
			return answer;
			
	    }
	 
	 public static double solution2(int[] numbers) {
	        Arrays.sort(numbers);
	        return numbers[2] >= numbers[0]+numbers[1] ? 2 : 1;
	 }
	 
}
