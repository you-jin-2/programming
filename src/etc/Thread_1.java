package etc;
 
//Runnable test
public class Thread_1 implements Runnable {
	
	static int a = 0;
	
	public static void main(String[] args) {
	    Thread_1 runnable = new Thread_1();
	    Thread thread = new Thread(runnable);

		// start() 갯수에 따른 메서드를 이용하여 Thread를 실행
		try {
			thread.start();  
			//thread.start();
			a++;
			thread.run();
			a++;
			thread.run();
			a++;
			thread.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
	//synchronized Version
    @Override
    public synchronized void  run() {
        // 쓰레드가 실행할 작업 정의
    	System.out.println(Thread.currentThread().getName());
    	for (int i = 0; i < 100; i++) {
    		System.out.print(a);
		}
		System.out.println();
    }
    
    /* 	//basic Version
    @Override
    public void  run() {
        // 쓰레드가 실행할 작업 정의
    	System.out.println(Thread.currentThread().getName());
    	for (int i = 0; i < 100; i++) {
    		System.out.print(a);
		}
    }
    */
}

 