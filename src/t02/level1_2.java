package t02;

public class level1_2 {

	public static void main(String[] args) {
		//자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
		// N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
				//제한사항
				//N의 범위 : 100,000,000 이하의 자연수
		  int n =51; 
	        System.out.println(solution2(n));
	}

	public static int solution(int num) {

		String str = Integer.toString(num);
		int anw = 0;
		for (int i = 0; i < str.length(); i++) {
			anw += Integer.parseInt(str.substring(i, i + 1));
		}

		return anw;
	}

	public static int solution2(int n) {
		int answer = 0;

		while (n != 0) {
			answer += n % 10;
			n /= 10;
		}

		return answer;

	}
}
