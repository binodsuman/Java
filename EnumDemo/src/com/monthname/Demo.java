package com.monthname;

public class Demo{
	public static void main(String[] args) {
		Months[] months = Months.values();
		for(Months month : months) {
			System.out.println(month.name());
			System.out.println(month.ordinal() +", "+ month.getMonthValue() +", "+month.getMonthName());
			}
	}
}