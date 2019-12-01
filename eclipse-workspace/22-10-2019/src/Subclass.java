
public class Subclass  extends SuperClass
{
	String s = "sub class variable ";

	Subclass(){
		
System.out.println(" super  class constructor");
}
	
	
	void getData() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		super.superClassMethod();
	}
}
