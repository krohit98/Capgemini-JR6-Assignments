package sortedHashMap;

import java.util.*;

public class SortHashMap {

	public static void main(String[] args) {
		SortHashMap app = new SortHashMap();
		app.start();
	}
	
	public void start() {

		Map<Integer,Integer> map = new HashMap<>();
		map.put(1,10);
		map.put(2, 40);
		map.put(3, 70);
		map.put(4, 30);
		map.put(5, 20);
		map.put(6, 90);
		map.put(7, 80);
		map.put(8, 50);
		
		System.out.println(getValues(map)); 
	}
	
	public List<Integer> getValues(Map<Integer,Integer> map) {
		
		List<Integer> list = new ArrayList<>(map.values());
		list.sort((a,b)->a-b);
		return list;
	}

}
