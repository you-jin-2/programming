package etc;

//Thread test
public class Thread_2 extends Thread {

	static int a = 0;

	public static void main(String[] args) {
		Thread_2 runnable = new Thread_2();
		Thread_2 thread = new Thread_2();

		// start() 메서드를 이용하여 Thread를 실행
		try {
			thread.start();
			a++;
			thread.run();
			a++;
			thread.run();
			a++;
			runnable.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public synchronized void run() {
		// 쓰레드가 실행할 작업 정의
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 100; i++) {
			System.out.print(a);
		}
		System.out.println();
	}
}
