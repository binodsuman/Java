package com.monthname;

public enum Months {
  JAN("January", 11), FEB("Febuary",22), MARCH("March",33);
  
  private int monthValue;
  private String monthName;
  
  Months(String monthName, int monthValue){
	  this.monthName = monthName;
	  this.monthValue = monthValue;
  }
  
  public int getMonthValue() {
	  return monthValue;
  }
  
  public String getMonthName() {
	  return monthName;
  }
  
  
  
}
