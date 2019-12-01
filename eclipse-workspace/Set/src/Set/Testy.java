package Set;

import java.util.HashMap;

public class Testy {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("kuku", 998014);
		hm.put("mala", 678941);
		hm.put("sheela", 789789);
		
		HashMap hm1 = new HashMap();
		
		hm1.put("deepu", 789899);
		hm1.put("riya", 678905);
		hm1.put("kriti", 467787);
		hm.putAll(hm1);
		
	System.out.println(hm.size());
	System.out.println(hm);

	}
}
