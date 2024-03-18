package Collections;

import java.util.Map;
import java.util.Set;

public class MapCollections {
	public static void main (String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(10, "sai");
		map.put(20, "siddhu");
		map.put(30, "sarath");
		
		map.put(10, "sai");
		map.put(20, "siddhu");
		map.put(30, "sarath");
		
		System.out.println(map);
		System.out.println();
		Set<Integer>keys=map.keySet();
		for(Integer k:keys)
		{
			System.out.println();
		}
		System.out.println();
		
		
		
	}

}
