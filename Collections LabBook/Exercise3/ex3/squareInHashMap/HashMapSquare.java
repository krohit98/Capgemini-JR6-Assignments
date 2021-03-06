package ex3.squareInHashMap;

import java.util.*;

public class HashMapSquare {

	public static void main(String[] args) {
		
		HashMapSquare app =new HashMapSquare();
		app.start();
	}
	
	public void start() {
		
		int[] arr = {7,8,4,6,3,6,9,5,4,7,4,5,2,8};
		System.out.println(getSquares(arr)); 
	}
	
	public Map<Integer,Integer> getSquares(int[] arr){
		
		Map<Integer, Integer> map =new HashMap<Integer, Integer>();
		for(int i:arr) {
			map.put(i,i*i);
		}
		return map;
	}

}
