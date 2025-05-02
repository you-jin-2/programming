package programers;



public class level0_8 {

	public static void main(String[] args) {
		/*
		영소문자로 이루어진 문자열 my_string과 영소문자 1글자로 이루어진 
		문자열 alp가 매개변수로 주어질 때, my_string에서 
		alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
		*/
		String fir = "programmers";
		String fir_alp = "p";
		
		String sec = "lowercase";
		String sec_alp = "x";
		
		System.out.println("시작===========");
		System.out.println(solution(fir,fir_alp));
		System.out.println(solution(sec,sec_alp));
	}

	
	 public static String solution(String str, String cg) {
			return str.replace(cg, cg.toUpperCase());
	    }
	 
	 
	 public static String solution2(String str, String cg) {
		 return str.replaceAll(cg, cg.toUpperCase());
	 }
	 
	 
}
