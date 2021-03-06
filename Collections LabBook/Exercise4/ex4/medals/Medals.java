package ex4.medals;

import java.util.*;

public class Medals {

	public static void main(String[] args) {
		Medals app = new Medals();
		app.start();
	}
	
	public void start() {
		
		Map<Integer, Integer> inputMap = new HashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter Registration number:");
			int reg = sc.nextInt();
			System.out.println("Enter marks:");
			int marks = sc.nextInt();
			inputMap.put(reg,marks);
		}
		System.out.println(getStudents(inputMap));
		sc.close();
	}
	
	public Map<Integer, String> getStudents(Map<Integer, Integer> map){
		
		Map<Integer, String> outputMap = new HashMap<Integer, String>();
		
		for(Integer i:map.keySet()) {
			
			if(map.get(i)>=90) {
				outputMap.put(i,"Gold");
			}
			else if(map.get(i)>=80 && map.get(i)<90) {
				outputMap.put(i, "Silver");
			}
			else if(map.get(i)>=70 && map.get(i)<80) {
				outputMap.put(i, "Bronze");
			}
			else {
				continue;
			}
		}
		return outputMap;
	}
}
