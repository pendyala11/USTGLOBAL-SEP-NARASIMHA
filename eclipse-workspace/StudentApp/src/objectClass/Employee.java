package objectClass;

public class Employee {
 int id;
 String name;
 double salary;
public Employee(int id, String name, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
 

public boolean equals(Object obj) {
	if(this==obj) {
		return true;
	}
	else
	{
		return false;
	}
	Employee a = (Employee) obj;
	
	
	if(this.id==a.id) {
		if(this.name==a.name)
		{
			if(this.salary==a.salary)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}
		else
		{
			return false;
		}
	}else
	{
		return false;
	}
}
}
}
