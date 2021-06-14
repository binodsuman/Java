package com.singleton;

enum Count {
	
    INSTANCE;
	
    private int value;
    
    public void setValue(int value) {
        this.value = value;
    }
    public void process() {
        System.out.println(value);
    }
}


public class Counter {
	
 public static void main(String[] args) {
	 Count firstInstance = Count.INSTANCE;
	 firstInstance.setValue(1);
	 firstInstance.process();
	 
	 Count secondInstance = Count.INSTANCE;
	 secondInstance.setValue(2);
	 secondInstance.process();
	 firstInstance.process();
 }
 
}
