package Predicate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestE {
public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	al.add(20);
	al.add(13);
	al.add(556);
	al.add(267);
	al.add(347);
	al.add(890);
	al.add(908);
	
	List<Integer> l = al.stream().sorted().collect(Collectors.toList());
	
	Iterator<Integer> it = l.iterator();
	
	while(it.hasNext())
	{
		Integer i = it.next();
		System.out.println(i);
	}
}
}
