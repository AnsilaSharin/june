package collectionandmap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionPro {
	public static void main(String args[]) {
		List li = new ArrayList();
		//ArrayList<String>li = new ArrayList<String>();
		
		li.add("Neha");
		li.add(29);
		li.add("Ansila");
		li.add(22);
		li.add("Murshidha");
		li.add(30.40);
		
		//display elements
		System.out.println(li);
		
		//elementsize
		System.out.println(li.size());
		
		//for loop - display elements sequentially
		for(int i =0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		
		//Random Accesss
		System.out.println(li.get(2));
		
				//to remove randomly through index
		li.remove(3);
		System.out.println(li);
		
		//using iterator
		Iterator itr = li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			
			List li1 = new ArrayList();
			li1.add("Jasna");
			li1.add(20);
			li1.addAll(li);
			System.out.println(li1);


	}
	
}
