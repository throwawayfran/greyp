package com.greyp.car;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.greyp.carmodel.CarModel;

@Entity
public class Car {

	
	@Id
	private Integer id;
	private String vehicleIdentificationNumber;
	private String color;
	private Double price;
	@ManyToOne
	private CarModel carModel;

	public Car(){
		
	}

	public Car(Integer id, String vehicleIdentificationNumber, String color, Double price, CarModel carModel) {
		super();
		this.id = id;
		this.vehicleIdentificationNumber = vehicleIdentificationNumber;
		this.color = color;
		this.price = price;
		this.carModel = carModel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVehicleIdentificationNumber() {
		return vehicleIdentificationNumber;
	}

	public void setVehicleIdentificationNumber(String vehicleIdentificationNumber) {
		this.vehicleIdentificationNumber = vehicleIdentificationNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public CarModel getCarModel() {
		return carModel;
	}

	public void setCarModel(CarModel carModel) {
		this.carModel = carModel;
	}
	
	

}
