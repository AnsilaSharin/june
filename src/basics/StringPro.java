package basics;

public class StringPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		name1 = name1+"Thomas";
		System.out.println(name1);

		//using concat()
		name2.concat("Das");
		System.out.println(name2);
		
		//StringBuffer and StringBuilder
		StringBuffer st = new StringBuffer("Mohan");
		StringBuilder st1 = new StringBuilder("Mohan");
		
		st.append(st1);
		System.out.println(st);
		st.append("V");
		System.out.println(st);
		

	}

}
