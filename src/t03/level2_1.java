package t03;

public class level2_1 {

	public static void main(String[] args) {
		/*
		 문제 설명
		x축과 y축으로 이루어진 2차원 직교 좌표계에 중심이 원점인 서로 다른 크기의 원이 두 개 주어집니다. 
		반지름을 나타내는 두 정수 r1, r2가 매개변수로 주어질 때, 두 원 사이의 공간에 x좌표와 y좌표가 모두 정수인 점의 개수를 
		return하도록 solution 함수를 완성해주세요.
※ 각 원 위의 점도 포함하여 셉니다. 
1 ≤ r1 < r2 ≤ 1,000,000
		 * 
		 * 
		 * */
		  /*
		 int h1 = 0;
		 int m1 = 5;
		 int s1 = 30;
		 int h2 = 0;
		 int m2 = 7;
		 int s2 = 0;
		*/
		 int h1 = 2;
		 int s2 = 3;
			
		 long a = solution( h1,   s2); 
	}
	public static long solution(long r1, long r2) {
        long result = 0;
        for(int x=1; x<=r2; x++){
            int minY = (int)Math.ceil(Math.sqrt((r1*r1-(long)x*x)));
            int maxY = (int)Math.sqrt(r2*r2-(long)x*x);

            result += maxY-minY+1;
            System.out.println(x+"  "+		minY);
            System.out.println(x+"  "+		maxY);
            System.out.println(x+"  "+		result);
        }
        return result*4;
    }
}
