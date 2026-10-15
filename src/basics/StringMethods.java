package basics;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string length()
		String s1 = "India";
		String s2 = "Country";
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		//sting compareTo
		String s3 = "hello";
		String s4 = "hello";
		String s5 = "meklo";
		String s6 = "hemlo";
		String s7 = "flag";
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.compareTo(s5));
		System.out.println(s3.compareTo(s6));
		System.out.println(s3.compareTo(s7));
		
		//String concat	
		String s8 ="Mohan";
		String s9 = "Lal";
		System.out.println(s8.concat(s9));
		
		//string contains
		String s = "Java is a high level programming language";
		System.out.println(s.contains("high level"));
		System.out.println(s.contains("programming"));
		System.out.println(s.contains("low level"));
		
		String b = "ABCDEFG";
		byte c[]= b.getBytes();
		for(int i =0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
		//substring
		String c1 = "programming";
		System.out.println(c1.substring(3));
		System.out.println(c1.substring(3,9));
		
		//start String startsWith
		String c2 = "india is good country";
		System.out.println(c2.startsWith("In"));
		System.out.println(c2.startsWith("India is good"));
		System.out.println(c2.startsWith("In"));
		
		String c3 = "india is good country";
		System.out.println(c3.endsWith("In"));
		System.out.println(c3.endsWith("India is good"));
		System.out.println(c3.endsWith("In"));
		
		String f = "java was programming language";
		System.out.println(s.replace("was", "is"));
		
		//java String trim
		
		String g = "hello java ";
		System.out.println(g+ "javaprogramming");
		System.out.println(g.trim()+"javaprogramming");
		
		//java String indexOf
		


	}

}
