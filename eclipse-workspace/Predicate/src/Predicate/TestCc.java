package Predicate;

import java.util.function.Function;

public class TestCc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Function<Integer, Integer> f = i ->i*i;
        int res = f.apply(5);
        System.out.println("square of 5 = "+res);
        int result  = f.apply(15);
        System.out.println("square of 5 = "+result);
        int result1  = f.apply(25);
        System.out.println("square of 5 = "+result1);
        int result2  = f.apply(35);
        System.out.println("square of 5 = "+result2);
        int result3  = f.apply(45);
        System.out.println("square of 5 = "+result3);
        int result4  = f.apply(55);
        System.out.println("square of 5 = "+result4);
        int result5 = f.apply(65);
        System.out.println("square of 5 = "+result5);
        int result6  = f.apply(75);
        System.out.println("square of 5 = "+result6);
      
       
	}

}
