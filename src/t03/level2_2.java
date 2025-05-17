package t03;

public class level2_2 {

	public static void main(String[] args) {
		/*
		 문제 설명
				시침, 분침, 초침이 있는 아날로그시계가 있습니다. 시계의 시침은 12시간마다, 분침은 60분마다, 
				초침은 60초마다 시계를 한 바퀴 돕니다. 따라서 시침, 분침, 초침이 움직이는 속도는 일정하며 각각 다릅니다. 
				이 시계에는 초침이 시침/분침과 겹칠 때마다 알람이 울리는 기능이 있습니다. 당신은 특정 시간 동안 알람이 울린 횟수를 알고 싶습니다. 
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
		 int h1 = 11;
		 int m1 = 59;
		 int s1 = 30;
		 int h2 = 12;
		 int m2 = 0;
		 int s2 = 0;
			
		solution( h1,  m1,  s1,  h2,  m2,  s2); 
		int a = solution2( h1,  m1,  s1,  h2,  m2,  s2);

		System.out.println("  "+		a);
		
		int ㅠ =solution3(h1,  m1,  s1);

		System.out.println("  "+		a);
	}


    public static  int solution(int h1, int m1, int s1, int h2, int m2, int s2) {
    	int  answer = -1;
    	int total_h = 0;
    	int total_m = 0;
    	int total_s = 0;
    	
    	if(s1==0) {total_s = s2;}else { total_s = 60-s1 + s2; }
    	if(m1==0) {total_m = m2;}else { total_m = m2 - m1; }
    	if(h1==0) {total_h = h2;}else { total_h = 12-h1 + h2; }

		System.out.println("이동시간 total_h " + total_h + " total_m " + total_m + " total_s " + total_s);
		
    	
    	
    	double sDegree= s1*60;
    	double mDegree= (m1*6 + 0.1*s1)%360;
    	double hDegree= (h1*30+ m1/2 + s1/720)%360;
    	
    	

    	
        int cnt = 0;

        if(sDegree >= mDegree)
            cnt++;

        if(sDegree >= hDegree)
            cnt++;

        // 분당 2회 만남
        cnt += 2*(60*h1 + m1);
        // 59 -> 0일 때는 만나지 않음
        cnt -= h1;

        // 11.59.59 -> 12 제외
        if(h1 >= 12)
            cnt -= 2;
        // 0.0.0은 범위에 포함 X (시작 시간)
        return --cnt;
    	
//    	문제점1 들어오는시간은 24시   시계는 12시체계
    	
    	//시  1/6도    
    	//분  1도
    	//초  6도// 
        //return answer;
    }
	 
    

    public static int solution3(int h, int m, int s) {
        double sDegree =  (6*s); //1초에 6도
        double mDegree = ((6*m + 0.1*s)%360);  //1초에 6도
        double hDegree = ((30*h + 0.5*m + 0.5*s/60)%360);

    	System.out.println("현재각도 total_h " + hDegree + " total_m " + mDegree + " total_s " + sDegree);
    	
        int cnt = 0;

        if(sDegree >= mDegree)
            cnt++;

        if(sDegree >= hDegree)
            cnt++;

        // 분당 2회 만남
        cnt += 2*(60*h + m);
        // 59 -> 0일 때는 만나지 않음
        cnt -= h;

        // 11.59.59 -> 12 제외
        if(h >= 12)
            cnt -= 2;

        // 0.0.0은 범위에 포함 X (시작 시간)
        return --cnt;
    }

    

    public static int solution2 (int h1, int m1, int s1, int h2, int m2, int s2) {
        int answer = 0;

        if(h1==0 && m1==0 && s1==0){
            return getAlarm(h2,m2,s2);
        }

        answer = getAlarm(h2,m2,s2) - getAlarm(h1, m1, s1);

        // 시작시간 정각인 경우 정각 알림까지 -되므로 +1
        if(m1==0 && s1==0){
            answer++;
        }

        return answer;
    }

    // 0시 0분 0초 ~ h시m분s초 까지 알람 횟수
   public static int getAlarm(int h, int m , int s){        
        if(h>=12){
            return getAlarm(11,59,59) + getAlarm(h-12, m ,s);
        }

        // 0-58 까지 + 2
        // 59-0까지는 초침이 분침을 정각 전에 따라잡지 못함 +1
            // 11~12시의 경우 시침도 따라잡지 못함
        // 0시 0분 0초 시침/분침 동시 겹침 1회 차감
        // 따라서 1시간 당 알람 횟수 = 시간*2 + 시간 + 분*2 - 1 
        int count = h * 2 * 59 + h + m * 2 -1;

        // 시/분/초침 속도 비교
            // 시침 1 : 분침 12 : 초침 720

        int secondPosition = s*720;
        int minutePosition = (h*3600+m*60+s) * 12;
        int hourPosition = h*3600+m*60+s;
        // 초침이 분침을 지나쳤다면
        if( s*720 >= minutePosition%43200 ){
            count++;
        }

        // 초침이 시침을 지나쳤다면
        if( s*720 >= hourPosition%43200 ){
            count++;
        }

        return count;
    }


}
