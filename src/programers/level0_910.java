package programers;

import java.util.Arrays;
import java.util.Scanner;

public class level0_910 {

	public static void main(String[] args) {
		/*
		1부터 6까지 숫자가 적힌 주사위가 네 개 있습니다. 네 주사위를 굴렸을 때 나온 숫자에 따라 다음과 같은 점수를 얻습니다.
		네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
		세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
		주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
		어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
		네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.
		네 주사위를 굴렸을 때 나온 숫자가 정수 매개변수 a, b, c, d로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
		*/
		int a = 3;
		int b = 3;
		int c = 6; 
		int d = 6;
		int aa = solution2(a,b,c,d);
	System.out.println(aa);
	}

	public static int solution(int a, int b, int c, int d) {
		int answer = 0;
		int cnta = -1;
		int cntb = -1;
		int cntc = -1;
		int cntd = -1;

		int[] intlist = { a, b, c, d };
		Arrays.sort(intlist);

		for (int num : intlist) {
			if (a == num)
				cnta++;
			if (b == num)
				cntb++;
			if (c == num)
				cntc++;
			if (d == num)
				cntd++;
		}
		int[] intlist2 = { cnta, cntb, cntc, cntd };
		// 4개 다 같을경우 3 3 3 3 12
		// 3개 같을경우 2 2 2 0 6
		// 2개 같을경우 1 1 0 0 2
		// 2개 같을경우 1 1 1 1 4
		// 없을경우 0 0 0 0 0
		int cnt = 0;
		int sum_cnt = 0;
		for (int num2 : intlist2) {
			if (num2 == 1)
				cnt++;
			sum_cnt += num2;
		}
		// 12 6 2 4 0
		int val = 0;
		if (intlist[2] == intlist[3])
			val = intlist[0];
		else
			val = intlist[3];

		if (sum_cnt == 12)
			answer = 1111 * intlist[3];
		if (sum_cnt == 6) {
			answer = 10 * intlist[1] + val;
			answer = answer * answer;
		}
		if (cnt == 2) {
			answer = intlist[0] * intlist[3];
			if (intlist[0] == intlist[1])
				answer = intlist[2] * intlist[3];
			else if (intlist[1] == intlist[2])
				answer = intlist[0] * intlist[3];
			else
				answer = intlist[0] * intlist[1];
		}
		if (cnt == 4) {

			int val2 = intlist[0] - intlist[3];
			if (val2 < 0)
				val2 = val2 * -1;

			answer = (intlist[0] + intlist[3]) * val2;
		}
		if (sum_cnt == 0)
			answer = intlist[0];
        
         return answer;
    }
	  
	public static int solution2(int a, int b, int c, int d) {

        int[] dice = { a, b, c, d };
        Arrays.sort(dice);

        int ans = 0;

        if (dice[0] == dice[3]) {
            ans = 1111 * dice[3];
        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            ans = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            ans = (dice[0] + dice[3]) * (dice[3] - dice[0]);
        } else if (dice[0] == dice[1]) {
            ans = dice[2] * dice[3];
        } else if (dice[1] == dice[2]) {
            ans = dice[0] * dice[3];
        } else if (dice[2] == dice[3]) {
            ans = dice[0] * dice[1];
        } else {
            ans = dice[0];
        }

        return ans;
    }

}
