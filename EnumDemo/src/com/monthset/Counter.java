package com.monthset;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;

enum Count {
	
	ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5);

	private int value;
	
	Count(int value){
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}


}

public class Counter{
	public static void main(String[] args) {
		
		for(Count count : Count.values()) {
			//System.out.println(count.name());
		}
		
		for(Count temp : EnumSet.range(Count.TWO, Count.THREE)){
			System.out.println("Name and Value :"+temp+" , "+temp.getValue());
		}
		
		System.out.println("**************************");

		HashMap<Count,String> map = new HashMap<>();
		
		map.put(Count.ONE, "For Frist Position");
		map.put(Count.TWO, "For Second Position");
		
		System.out.println("From Map :"+map.get(Count.TWO));
		
		System.out.println("**************************");
		
		// But EnumMap is much efficient and having better performance.
		
		EnumMap<Count, String> enumMap = new EnumMap<Count, String>(Count.class);
		enumMap.put(Count.ONE, "For Frist Position");
		enumMap.put(Count.TWO, "For Second Position");
		
		System.out.println("From Enum Map :"+enumMap.get(Count.TWO));

		
		
		
	}
}
