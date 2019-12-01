package Set;

import java.util.HashMap;

public class TestZ {

	public static void main(String[] args) {
		HashMap hm =new HashMap();
		
		hm.put("kuku", 998014);
		hm.put("mala", 678941);
		hm.put("sheela", 789789);
		
		
		System.out.println("data "+hm);
		hm.put("mala", 789899);
		
		System.out.println("After Modify"+hm);
		hm.put("dimple", 989899);
		System.out.println("after dimple"+hm);
		hm.put(null, 456789);
		
		Object name = hm.get("789789");
		System.out.println("name is "+name);
		
		Object value =hm.remove("kuku");
		System.out.println("value"+value);
		System.out.println("after remove "+hm);
	}

}
