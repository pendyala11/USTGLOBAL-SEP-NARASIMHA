package objectClass;

public class Person1 implements Cloneable {
int id;
String name;
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
public Person1(int id,String name)
{
	super();
	this.id=id;
	this.name=name;
}
}
