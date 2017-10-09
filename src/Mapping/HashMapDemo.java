package Mapping;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class HashMapDemo {
//Map is input or update or add the key and value
	public static void main(String[] args) {
		Map <Integer,String> map=new LinkedHashMap<Integer,String>();
		
		map.put(100, "ABC");
		map.put(10, "ABC");
		map.put(100, "ABCD"); // it mean 100=ABC but 100=ABCD so it will print 100=ABCD
		map.put(200, "ABYC");
		map.put(300, "ABC");
		
		System.out.println(map);
		
		Set<Integer> keys=map.keySet();
		
		System.out.println(keys);
		
		Collection<String> col=map.values();
		//ArrayList l=map.values ArrayList();
		
		System.out.println(col);
	}

}
