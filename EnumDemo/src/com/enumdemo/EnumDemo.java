package com.enumdemo;

public class EnumDemo {

	public static void main(String[] args) {
		
		Months[] months = Months.values();
		System.out.println(months.length);
		
		for(Months month : months){
			System.out.println("Name :"+month.name()+" Value :"+month.ordinal());
			
		}
		
		Gender[] genders = Gender.values();
		for(Gender gender : genders){
			System.out.println("Name :"+gender.name()+" Value :"+gender.ordinal());
			
		}
		
		//if(Months.JAN == Gender.MALE) { }
	}
	
	// If Statement
	public void monthCheck(Months month) {
		if(month == Months.JAN) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
	}
	
	// Switch Statement
	// You can not use any else constant, if not there in enum.
	public void monthLogic(Months month) {
	   switch (month) {
         case JAN:
             System.out.println("January is first month.");
             break;
                 
         case FEB:
             System.out.println("February is second month.");
             break;
                      
         case MARCH:
             System.out.println("March is third month.");
             break;
         //case MAY:
                     
         default:
             System.out.println("Second quarter months.");
             break;
     }
	}

}
