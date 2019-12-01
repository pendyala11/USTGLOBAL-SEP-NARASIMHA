package Predicate;

import java.util.function.Predicate;

import com.ustglobal.javafeatures.predicate.Employee;

public class TestC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   	
	   	Predicate<Employee> e = (s)->{
	   		if(s.id==1)
	   		{
	   			return true;
	   		}
	   		else
	   		{
	   			return false;
	   		}
	   	};
	   	Employee s = new Employee(1,"anup","tester");
	   	boolean b=p.test(s);
	   	System.out.println(b);
		}
	};

}
