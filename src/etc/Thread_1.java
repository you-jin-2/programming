package etc;
 

public class Thread_1 implements Runnable {
	
	static int a = 0;
	
	public static void main(String[] args) {
	    Thread_1 runnable = new Thread_1();
	    Thread_1 thread = new Thread_1();

	    //start() 메서드를 이용하여 Thread를 실행
	     try {
	    	 thread.run();
	    	 thread.run();
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
    
    public void run2() {
        // 쓰레드가 실행할 작업 정의
    	System.out.println();
    	for (int i = 0; i < 100; i++) {
    		System.out.print(a);
		}
    }
}

 