package programers;

import java.util.Arrays;

public class level0_7 {

	public static void main(String[] args) {
		/*
		정수 배열 numbers가 매개변수로 주어집니다. 
		numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 
		return하도록 solution 함수를 완성해주세요.
		*/
		System.out.println("시작===========");
		int[] num_list = {1, 2, -3, 4, -5};
		System.out.println(solution(num_list));	
		
		int[] num_list2 = {0, -31, 24, 10, 1, 9};
		System.out.println(solution(num_list2));
		
		int[] num_list3 = {10, 20, 30, 5, 5, 20, 5};
		System.out.println(solution(num_list3));
		
	}

	
	 public static int solution(int[] num_list) {
		 //양수 음수 구분
		 //각 파트 끼리의 곱 계산
		 //양수 2게 음수 2개
		 int answer = 0;
		 int plus_ch = 0;
		 int minus_ch = 0;
		 
		 int i, j, temp;

		  for(i=num_list.length-1; i>0; i--){
		    // 0 ~ (i-1)까지 반복
		    for(j=0; j<i; j++){
		      // j번째와 j+1번째의 요소가 크기 순이 아니면 교환
		      if(num_list[j]<num_list[j+1]){
		        temp = num_list[j];
		        num_list[j] = num_list[j+1];
		        num_list[j+1] = temp;
		      }
		    }
		  }
		  
		  int a = num_list[0] * num_list[1];
		  int b = num_list[num_list.length-1] * num_list[num_list.length-2];
		  answer =  a > b ? a: b;
			return answer;
		
			
	    }
	 
	 public static double solution2(int[] numbers) {
		 int len = numbers.length;
	        Arrays.sort(numbers);
	        return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);
	 }
	 
}
