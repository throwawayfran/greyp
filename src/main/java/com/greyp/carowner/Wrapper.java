package com.greyp.carowner;

import com.greyp.car.Car;

public class Wrapper {

	private CarOwner carOwner;
	private Car		 car;
	
	public Wrapper(){
		
	}
	
	public Wrapper(CarOwner carOwner, Car car) {
		super();
		this.carOwner = carOwner;
		this.car = car;
	}

	public CarOwner getCarOwner() {
		return carOwner;
	}

	public void setCarOwner(CarOwner carOwner) {
		this.carOwner = carOwner;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	
}
