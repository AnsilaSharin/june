package oops;


public class StudentDetails {
	//variables
	private String emailid;
	private String pswrd;
	//
//	public void setEmailid(String emailid) {
//		this.emailid=emailid;
//	}
//	
//	public void setPasword(String pswrd) {
//		this.pswrd=pswrd;
//	}
	
	public void setValues(String emailid,String pswrd) {
		this.emailid = emailid;
		this.pswrd = pswrd;
		
	}
	public String getEmailid() {
		return emailid;
	}
	public String getPassword() {
		return pswrd;
	}

	
}
