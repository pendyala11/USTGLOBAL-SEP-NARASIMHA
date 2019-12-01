package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestAa {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(20);
		al.add(23);
		al.add(5);
		al.add(12);
		al.add(4);
		System.out.println(al);
		
		List<Integer> L =al.stream().filter(i -> i%2 !=0).collect(Collectors.toList());
		
		for (Integer i : L) {
			System.out.println(L);
		}
	}

}
