package Set;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestAb {

	public static void main(String[] args) {
		TreeMap<String, Integer> lh =new TreeMap<String, Integer>();
		lh.put("Bangalore", 560068);
		lh.put("hariyana", 134283);
		lh.put("patna",850000);
		for (Entry<String, Integer> m:lh.entrySet()){
			String key = m.getKey();
			Integer value =m.getValue();
			System.out.println("key is "+key);
System.out.println("value is "+value);
System.out.println("***************************");
		}
	}

}
