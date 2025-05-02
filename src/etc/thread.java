package etc;

import java.util.Iterator;

public class thread implements Runnable {

	
	static int a = 0; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    thread runnable = new thread();
	    Thread thread = new Thread(runnable);

	    //start() 메서드를 이용하여 Thread를 실행
	    thread.start();
	     try {
	    	 a++;thread.run();	
	    	 a++;thread.run();
	    	 a++;thread.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
	
    @Override
    public synchronized void  run() {
        // 쓰레드가 실행할 작업 정의
    	
    	System.out.println();
    	for (int i = 0; i < 100; i++) {
    		System.out.print(a);
		}
    }
    
}

 