package objectClass;

public class TestG {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
Person1 p = new Person1(12, "ravi");
System.out.println(" id and name "+p.id);
System.out.println(" id and name "+p.name);


Object o = p.clone();
Person1 p2 = (Person1)o;
p2.id=3;
p2.name="royal";
System.out.println("id"+p2.id);
System.out.println(" name "+p2.name);


	}

}
