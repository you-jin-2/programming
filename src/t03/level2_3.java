package t03;

public class level2_3 {

	public static void main(String[] args) {
		 
		 String h1 = "()()()(())";
		  solution(h1); 
	}
	public static  boolean solution(String s) {
        boolean answer = true;
        //1.맨처음 ( 인지 확인
        //2.( 갯수 를 + 세고 나머지는 - 함  0보다 작아지면 false 0보커도  0이면 true
        if(!"(".equals(s.substring(0,1))) return false;
        int cnt =0;
        
        for(int i=1; i<=
        		s.length(); i++) {
			if ("(".equals(s.substring(i - 1, i)))
				cnt++;
			else
				cnt--;
			if (cnt < 0) {
				answer = false;
				break;
			}
			
        }
        return cnt==0?true:false;
    }
	

	public static  boolean solution2(String s) {
        boolean answer = true;
        //1.맨처음 ( 인지 확인
        //2.( 갯수 를 + 세고 나머지는 - 함  0보다 작아지면 false 0보커도  0이면 true
        if(!"(".equals(s.substring(0,1))) return false;
        int cnt =0;
        
        for(int i=1; i<= s.length(); i++) {
			if ("(".equals(s.charAt(i)))
				cnt++;
			else
				cnt--;
			if (cnt < 0) {
				answer = false;
				break;
			}
			
        }
        if (cnt == 0)		answer = true;
        else 	answer = false;
        return answer;
	}
}
