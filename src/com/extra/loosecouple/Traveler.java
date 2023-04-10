package com.extra.loosecouple;

import com.extra.tightcouple.Bike;

public class Traveler {
	// Car car = null;
		Bike bike = null;

		public Traveler() {
			// this.car = new Car();
			this.bike = new Bike();
		}

		public void startJourney() {
			// this.car.move();
			this.bike.move();
		}
}
