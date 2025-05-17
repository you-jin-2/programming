package etc;

public class Singleton {
	private static Singleton i; // ->인스턴스화
	
	private Singleton() {} // -> 생성자
	
	public static synchronized Singleton geti() {
		if (i == null) {
			i = new Singleton();
		}
		return i;
	}

}