package etc;

public class Singleton_test2 {


	public static void main(String[] args) {
	        main3();
	}
    public  void main2() {
    	Singleton.geti();
    }
    
    
    public static void main3() {
        CompanyInfo companyInfo2 = CompanyInfo.getInstance();
        
        // getter로 접근 
        System.out.println( "companyName : " + companyInfo2.getCompanyName() );
        System.out.println( "companyAddr : " + companyInfo2.getCompanyAddr() );
    }
    
}
