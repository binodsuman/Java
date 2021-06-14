package com.customeValue;

public enum Months {
  JAN(11), FEB(22), MARCH(33);
  
  private int monthValue;
  
  Months(int monthValue){
	  this.monthValue = monthValue;
  }
  
  public int getMonthValue() {
	  return monthValue;
  }
  
}
