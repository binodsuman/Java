package com.abstractMetho;

public enum TrafficLight {
	//RED, YELLOW, GREEN
	// Red and Green signal for 30 seconds and Yellow for 10 min.
	//RED(30), YELLOW(10), GREEN (30);
	
	RED(30){

		@Override
		public TrafficLight nextLight() {
			return GREEN;
		}},
	YELLOW(10){

		@Override
		public TrafficLight nextLight() {
			return RED;
		}},
	
	GREEN(30){

		@Override
		public TrafficLight nextLight() {
			return YELLOW;

		}};
	
	private int duration;
	
	TrafficLight(int duration){
	  this.duration = duration;
	}

	public int getDuration() {
	  return duration;
	}

	public abstract TrafficLight nextLight();

	
	


}
