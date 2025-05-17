package t03;

import java.util.*;

public class level2_5 {

	public static void main(String[] args) {
		 /*
		  * 
		  * 다음 규칙을 지키는 문자열을 올바른 괄호 문자열이라고 정의합니다.
		(), [], {} 는 모두 올바른 괄호 문자열입니다.
		만약 A가 올바른 괄호 문자열이라면, (A), [A], {A} 도 올바른 괄호 문자열입니다. 
		예를 들어, [] 가 올바른 괄호 문자열이므로, ([]) 도 올바른 괄호 문자열입니다.
		만약 A, B가 올바른 괄호 문자열이라면, AB 도 올바른 괄호 문자열입니다. 
		예를 들어, {} 와 ([]) 가 올바른 괄호 문자열이므로, {}([]) 도 올바른 괄호 문자열입니다.
		  */
		 String h1 = "}]()[{";
		 
		int a=   solution2(h1); 
		char[] b = h1.toString().toCharArray();
		
		if(!(true&&true&&true)) System.out.println("  11");
		
        System.out.println("  "+		h1.charAt(1));
	}
	
	
	
	public int sol(String a) {
		char[] ch = null;
		
		
		
		
		
		
		return 0;
	}
	
	

	public static  int solution3(String s) {
		  int answer = 0;
		  
		  StringBuffer a = new StringBuffer(s);
		  
		  for (int i = 0; i < s.length(); i++) {
			  a.append(a.charAt(0));
			  a.deleteCharAt(0);
			 if(asd(a.toString().toCharArray())) answer++;
		}
		  
		  
		  
		  
		  return answer; 
	}
	

	 public static boolean asd(char[] s) {
		 
		 for(char c : s) {
			 if( (aaa(c,'(',')')&&aaa(c,'{','}')&&aaa(c,'[',']'))
				) return false; 
		 }
		 
		 
		 return true;
	 }
	 public static boolean aaa(char q,char w,char e) {
		 if(q==w) stack.push(q);
		 else if(q==e)
			   if(!stack.empty()&& stack.peek()==w) stack.pop();
			   else return false;
			 
		 return true; 
	 }
	 
	 private static final Stack<Character> stack = new Stack<>();
	 
	 
	 public static int solution2(String s) {
         int answer = 0;
         StringBuilder stringBuilder = new StringBuilder(s);

         for (int i = 0; i < s.length(); i++) {
             stringBuilder.append(stringBuilder.charAt(0));
             stringBuilder.deleteCharAt(0);
             if (correctParenthesis(stringBuilder.toString().toCharArray()))
                 answer++;
         }
         return answer;
     }

     private static boolean correctParenthesis(char[] s) {
         for (char c : s) {
             if (!(check(c, '(', ')') && check(c, '[', ']') && check(c, '{', '}')))
                 return false;
         }
         return stack.isEmpty();
     }

     private static boolean check(char c, char a, char b) {
         if (c == a)
             stack.push(a);
         else if (c == b)
             if (!stack.isEmpty() && stack.peek() == a) stack.pop(); 
             else return false;
         
         return true;
     }




	public static  int solution(String s) {
		 int answer = 0;
		 String a = s;
		 int cnt=0;
		 
		 for (int i = 0; i < s.length(); i++) {
			 if(i!=0) a = s.substring(i,s.length()) + s.substring(0,i) ;
			 
			 if(   "}".equals(a.substring(0,1))
				|| ")".equals(a.substring(0,1))	 
				|| "]".equals(a.substring(0,1))	 
			   ) continue;

		        System.out.println("  "+		a);
			 int[] g = {0,0,0}; // [ { ( 
			 boolean type = false; 
			 for(int k=1; k<= a.length(); k++) {
					if ("[".equals(a.substring(k - 1, k))) g[0] +=1;
					if ("{".equals(a.substring(k - 1, k))) g[1] +=1;
					if ("(".equals(a.substring(k - 1, k))) g[2] +=1;
					
					if ("]".equals(a.substring(k - 1, k))) g[0] -=1;
					if ("}".equals(a.substring(k - 1, k))) g[1] -=1;
					if (")".equals(a.substring(k - 1, k))) g[2] -=1;
					
					for (int j = 0; j < g.length; j++) {
				        System.out.print("  "+		g[j]);
						if(g[j] < 0) { type = false; break;}  
						else type = true;
					}
					if(type == false) break;
		        }
			 
				if(type == true) cnt++;
				else continue;
		}
		 
		  
	        return cnt;
	         
   }
	
 
}