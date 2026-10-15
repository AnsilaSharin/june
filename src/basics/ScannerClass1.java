package basics;

import java.util.Scanner;

public class ScannerClass1 {
	public static void main(String args[]) {
		String name;
		int age;
		String gender;
		String dob;
		String address;
		long phno;
		String emailid;
		String quali;
		float totlmrks;
		String grade;
		String course;
		short installment;
		int totlamnt;
		String institution;
		boolean joining;
		
		Scanner scan = new Scanner(System.in) ;
		System.out.println("Enter your name : ");
		name = scan.next();
		System.out.println(name);
		
		
		System.out.println("Enter your Age : ");
		age = scan.nextInt();
		System.out.println(age);
	
		System.out.println("Enter your Gender : ");
		gender = scan.next();
		System.out.println(gender);
		
		System.out.println("Enter your DOB : ");
		dob = scan.next();
		System.out.println(dob);
		
		System.out.println("Enter your Address : ");
		address = scan.next();
		System.out.println(address);
		
		System.out.println("Enter your Phone Number : ");
		phno = scan.nextLong();
		System.out.println(phno);
	
		System.out.println("Enter your Email ID : ");
		emailid = scan.next();
		System.out.println(emailid);
		
		System.out.println("Enter your Qualification : ");
		quali = scan.next();
		System.out.println(quali);
		
		System.out.println("Enter your Total marks : ");
		totlmrks = scan.nextFloat();
		System.out.println(totlmrks);
		
		System.out.println("Enter your Grade : ");
		grade = scan.next();
		System.out.println(grade);
		
		System.out.println("Enter your Course : ");
		course = scan.next();
		System.out.println(course);
		
		System.out.println("Enter your Installment : ");
		installment = scan.nextShort();
		System.out.println(installment);
		
		System.out.println("Enter your Total Amount : ");
		totlamnt = scan.nextInt();
		System.out.println(totlamnt);
		
		System.out.println("Enter your Institution : ");
		institution = scan.next();
		System.out.println(institution);
		
		System.out.println("Enter your Joining : ");
		joining = scan.nextBoolean();
		System.out.println(joining);
	
	
	}

}
