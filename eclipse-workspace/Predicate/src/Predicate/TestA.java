package Predicate;

import java.util.function.Predicate;

public class TestA {

	public static void main(String[] args) {
	
		Predicate<Integer> p =i ->
		{
			if(i%2==0) {
				return true;
			}
			else
			{
				return false;
			}
		};
 boolean res =p.test(9);
 System.out.println(res);
	}

}
