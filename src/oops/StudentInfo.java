package oops;

//public class StudentInfo extends StudentDetails //using inheritance
public class StudentInfo {
	
	

	public static void main(String[] args) {//using object creation
		// TODO Auto-generated method stub
//		StudentInfo ob = new StudentInfo();
		StudentDetails ob = new StudentDetails();
		ob.setValues("abc123@gmaail.com", "abc");
		System.out.println(ob.getEmailid());
		System.out.println(ob.getPassword());
		
	}

}
