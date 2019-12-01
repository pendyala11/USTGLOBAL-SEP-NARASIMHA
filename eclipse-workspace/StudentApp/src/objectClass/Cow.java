package objectClass;

public class Cow {
     
	int id;
	String name;
	double cost;
	public Cow(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		else
		{
			return false;
		}
		Cow a = (Cow) obj;
		
		
		if(this.id==a.id) {
			if(this.name==a.name)
			{
				if(this.cost==a.cost)
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
