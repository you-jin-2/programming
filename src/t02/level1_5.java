package t02;

import java.util.*;

public class level1_5 {

	
	/*방법론	1. 배열은 sort
	      	2. x축 y축 for 문
	      	3. x축 제한 갯수 확인 
	*/       
	public static void main(String[] args) {
		/*
		  지민이는 다양한 크기의 정사각형 모양 돗자리를 가지고 공원에 소풍을 나왔습니다. 공원에는 이미 돗자리를 깔고 여가를 즐기는 사람들이 많아 지민이가 깔 수 있는 가장 큰 돗자리가 어떤 건지 확인하려 합니다. 예를 들어 지민이가 가지고 있는 돗자리의 한 변 길이가 5, 3, 2 세 종류이고, 
		  사람들이 다음과 같이 앉아 있다면 지민이가 깔 수 있는 가장 큰 돗자리는 3x3 크기입니다.
		 * */
		int[] mats = {5,3,2};
		String[][] park = 
				
				{{"A", "A", "-1", "B", "B", "B", "B", "-1"}
			   , {"A", "A", "-1", "B", "B", "B", "B", "-1"}
			   , {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"}
			   , {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"} 
		       , {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"}
			   , {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}
				}
		;
	        System.out.println(solution4(mats,park));
	}
	
	 public static int solution(int[] mats, String[][] park) {
			int answer = 0;
			String[][] mymat = park;
			Arrays.sort(mats);
			int cnt = 0;
			for (int i = 0; i < park.length; i++) {
				cnt = 0;
				for (int j = 0; j < park[i].length; j++) {
					if ("-1".equals(park[i][j].toString())) {
						cnt++;
					} else {
						cnt = 0;
					}
					mymat[i][j] = Integer.toString(cnt);
					System.out.print(mymat[i][j].toString());
				}
				System.out.println();
			}

			// 1.해당숫자있는지 판단.
			// 2.정사각형인지 판단
			// 숫자가 갈러미녀

			for (int mat : mats) {

				int check = 0;

				for (int i = 0; i < park.length; i++) {
					System.out.println();
					for (int j = 0; j < park[i].length; j++) {
						if (!"0".equals(park[i][j].toString())) {

							int k_max = 0;
							int m_max = 0;
							if (i + mat > park.length)
								break;
							else
								k_max = i + mat;
							if (j + mat > park[i].length)
								break;
							else
								m_max = j + mat;
							System.out.print(k_max + " " + m_max + "    ");

							for (int k = i; k < k_max; k++) {
								for (int m = j; m < m_max; m++) {
									if ("0".equals(park[k][m].toString())) {
										check = -1;
										break;
									}
								}
							}
							
							if (check == 0)answer = mat;
							check = 0;
							System.out.print("check:" + check);
						}
					}
				}
			}
			if (answer == 0)
				answer = -1;
			return answer;
	  }
	 
	 public static int solution2(int[] mats, String[][] park) {
	        Arrays.sort(mats);
	        for (int idx = mats.length-1; idx >= 0; idx--) {
	            int m = mats[idx];
	            //y축
	            for (int i = 0; i <= park.length-m; i++) {
	            	// x축
	                for (int j = 0; j <= park[i].length-m; j++) {
	                    if (isAvailable(i, j, m, park)) return m;
	                }
	            }
	        }
	        return -1;
	    }
	    private static boolean isAvailable(int x, int y, int m, String[][] park) {
	        for (int i = x; i < x+m; i++) {
	            for (int j = y; j < y+m; j++) {
	                if (!park[i][j].equals("-1")) return false;
	            }
	        }
	        return true;
	    }
	    
	    public static int solution4(int[] mats, String[][] park) {
	      	   int answer = 0;        
			   String[][] mymat  = park; 
			   Arrays.sort(mats);
	        for(int idx = mats.length-1; idx >= 0; idx--){
	            int m = mats[idx];
	                      
	            for(int y = 0; y <= park.length-m; y++){
	               for(int x = 0; x <= park[y].length-m; x++){
	                   if(ch(x,y,m,park)) {
	                       System.out.println(m);
	                    return m;   
	                   }
	                   
	                }
	            }
	        }
	            
	            
			  	            
		        return answer;
	 
	    }
	    
	    public static boolean ch(int x, int y ,int m ,String[][] park) {
	         for(int i = y; i <= y+m; i++){
	               for(int j = x; j <= x+m; j++){
	                   if(!park[i][j].equals("-1")) return false;
	                }
	            }
	        return true;
	    }
	    
}
