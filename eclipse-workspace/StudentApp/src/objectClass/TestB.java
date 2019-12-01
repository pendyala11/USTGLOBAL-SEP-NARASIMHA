package objectClass;

public class TestB {

	public static void main(String[] args) {
		Pen p = new Pen();
		int hc = p.hashCode();
		System.out.println(" hashcode of p "+hc);
		
		Pen q = new Pen();
		int hc1 = q.hashCode();
		System.out.println(" hashcode of q "+hc1);
		String s = q.toString();
		System.out.println(s);
		
2
	}

}
