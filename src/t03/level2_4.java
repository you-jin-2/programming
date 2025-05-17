package t03;

import java.util.*;

public class level2_4 {

	public static void main(String[] args) {
		 /*
		  * 
		  * 어느 날 철호는 어떤 자연수로 이루어진 원형 수열의 연속하는 부분 수열의 합으로 만들 수 있는 수가 모두 몇 가지인지 알아보고 싶어졌습니다. 원형 수열이란 일반적인 수열에서 처음과 끝이 연결된 형태의 수열을 말합니다. 
		  * 예를 들어 수열 [7, 9, 1, 1, 4] 로 원형 수열을 만들면 다음과 같습니다.
		  */
		 int[] elements = {7, 9, 1, 1, 4};
		 int a= solution(elements); 
	}
	 public static int solution2(int[] elements) {
		 
		 Set<Integer> hash_set = new HashSet<>();
		 
		 int[] a = new int[elements.length];
		 
		 for (int i = 1; i <= a.length; i++) {
		   for (int j = 0; j < a.length; j++) {
			   a[j] += elements[(i+j-1)%elements.length];
			   hash_set.add(a[j]);
 		 }
		}
         return hash_set.size();
	 }
	
	
	
	
	 public static int solution(int[] elements) {
		    Set<Integer> set = new HashSet<>();
            int[] dp = new int[elements.length];
            
            for(int len = 1; len <= elements.length; len++){
                for(int i = 0;i<elements.length;i++){
                    dp[i] += elements[(len+i-1)%elements.length];
                    set.add(dp[i]);
                }
            }
            
            for (int i = 0 ; i < dp.length; i++) {
                System.out.println(dp[i]);
			}
            
            return set.size();
        }
}
