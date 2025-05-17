package etc;

	public class CompanyInfo 
	{
	    private static CompanyInfo innstance;
	 
	    private String companyName;
	    private String companyAddr;
	    
	    
	    private CompanyInfo()
	    {
	    }
	    
	    public static CompanyInfo getInstance()
	    {
	        if (innstance == null)
	        {
	            synchronized(CompanyInfo.class)
	            {
	                innstance = new CompanyInfo();
	            }
	        }
	        
	        return innstance;
	    }
	    
	    
	    // getter, setter 
	    public String getCompanyName() {
	        return companyName;
	    }
	 
	    public void setCompanyName(String companyName) {
	        this.companyName = companyName;
	    }
	 
	    public String getCompanyAddr() {
	        return companyAddr;
	    }
	 
	    public void setCompanyAddr(String companyAddr) {
	        this.companyAddr = companyAddr;
	    }    
	}
 