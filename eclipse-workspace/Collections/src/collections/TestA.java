package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TestA {

	public static void main(String[] args) {
ArrayList al = new ArrayList();
al.add(12);
al.add(22.5);
al.add("chinna");
al.add(true);
al.add(null);
al.add(null);
al.add('A');
Iterator it = al.iterator();
Object ob = it.next();
System.out.println(ob);

for(Object o :al) {
	System.out.println(o);
}

ArrayList al1 = new ArrayList();
al1.add(12);
al1.add(233.3);
al1.add("momo");
al1.add(false);
System.out.println(" ==========Using Iterator ");
Iterator It1 = al1.iterator();
while(It1.hasNext())
{
	Object obj= It1.next();
	System.out.println(obj);
}
}
}
