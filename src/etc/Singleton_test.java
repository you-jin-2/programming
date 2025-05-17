package etc;


//싱글톤 테스트
public class Singleton_test {

public static Singleton_test2 Singleton_test2;

	public static void main(String[] args) {
	       CompanyInfo companyInfo1 = CompanyInfo.getInstance();
	       
	        // setter로 접근 
	        companyInfo1.setCompanyName("회사명");
	        companyInfo1.setCompanyAddr("회사주소");
	        
	        try {
				Singleton_test2.main3();
				main2();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	

    public static  Singleton_test main23() {
    	return null;
    }
    
    public static  void main2() {
    	
    	Singleton a = Singleton.geti();
    	Singleton a2 = Singleton.geti();
    	System.out.println( " "+  a);
    	System.out.println( " "+  a);
    	
    }
    
    
    public static void main3() {
        CompanyInfo companyInfo2 = CompanyInfo.getInstance();
        
        // getter로 접근 
        System.out.println( "companyName : " + companyInfo2.getCompanyName() );
        System.out.println( "companyAddr : " + companyInfo2.getCompanyAddr() );
    }
    
}
