package Set;

import java.util.TreeSet;

public class TestE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet ts = new TreeSet();
ts.add(34);
ts.add(45);
ts.add(67);
ts.add(90);
System.out.println("***************Using For Each Loop ************");
for (Object s : ts) {
	System.out.println(s);
}
	}

}
