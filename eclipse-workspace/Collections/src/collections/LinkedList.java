package collections;

import java.util.ListIterator;

public class LinkedList {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add(12);
		
		li.add(" more ");
		li.add(true);
        li.add(null);
        
        System.out.println(" Using for loop ");
        for(int i=0;i<li.size();i++) {
        	System.out.println(li.get(i));
        }
        
        for(Object obj : li)
        {
        	System.out.println(obj);
        }
        
        System.out.println("======================Using List Iterator Forward");
        
        ListIterator it = li.listIterator();
        while(it.hasNext())
        {
        	Object o = it.next();
        }

	}

	

}
