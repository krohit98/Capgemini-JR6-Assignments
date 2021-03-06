package ex2.characterCount;

import java.util.*;

public class CharCount {

	public static void main(String[] args) {
		
		CharCount app = new CharCount();
		app.start();
	}
	
	public void start() {
		
		char[] arr = {'a','g','b','a','c','d','c','a','g','g','e','a','d','p','z'};
		System.out.println(countChars(arr));
	}
	
	public Map<Character,Integer> countChars(char[] arr){
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(char i:arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i,1);
			}
		}
		return map;
	}
}
