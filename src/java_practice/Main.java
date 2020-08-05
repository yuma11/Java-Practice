package java_practice;

import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new TreeMap<>((k1, k2) -> k2.compareTo(k1));
		map.put(2, "りんご");
		map.put(7, "ばなな");
		map.put(3, "ぶどう");
		
		for(String value : map.values()) {
			System.out.println(value);
		}
	}
}