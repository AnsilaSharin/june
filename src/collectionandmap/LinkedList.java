package collectionandmap;

import java.util.ArrayList;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>li = new ArrayList<String>();
		li.add("Neha");
		li.add("29");
		li.add("Ansila");
		li.add("22");
		li.add("Murshidha");
		li.add("30.40");
		
		System.out.println(li);
		
		//display elements
		System.out.println(li);
				
		//elementsize
		System.out.println(li.size());
		
		for(String data : li) {
			System.out.println(data);
		}

	}

}
