package com.customeValue;

public class EnumDemo {

	public static void main(String[] args) {
		
		Months[] values = Months.values();
		
		for(Months month : values){
			System.out.println("Name :"+month.name());
			System.out.println("Value :"+month.ordinal());
			System.out.println("Custom Value :"+month.getMonthValue());
			System.out.println("***********");
	   }

	}

}
