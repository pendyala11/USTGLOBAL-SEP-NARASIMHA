package Set;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestAA {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();
		
		lh.put("Bangalore", 560068);
		lh.put("hariyana", 134283);
		lh.put("patna",850000);
		
		for (Map.Entry<String, Integer>  m:lh.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println(" key is "+key+"--------"+"value is "+value);
			System.out.println("==========================================");
			
		}

	}

}
