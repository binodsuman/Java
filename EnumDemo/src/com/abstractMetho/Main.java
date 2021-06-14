package com.abstractMetho;

public class Main {

	public static void main(String[] args) {
		
		for(TrafficLight light : TrafficLight.values()){
			System.out.printf("%s: Plese wait %d seconds, next is %s\n",light, light.getDuration(), light.nextLight());
		}


	}

}
