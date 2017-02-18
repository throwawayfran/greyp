package com.greyp.carmodel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarModel {

	
	@Id
	private Integer id;
	private String manufacturer;
	private String model;
	private Integer horsePower;
	private Integer modelYear;
	private String transmissionType;
	private String fuelType;
	
	public CarModel(){
		
	}

	public CarModel(Integer id, String manufacturer, String model, Integer horsePower, Integer modelYear,
			String transmissionType, String fuelType) {
		super();
		this.id = id;
		this.manufacturer = manufacturer;
		this.model = model;
		this.horsePower = horsePower;
		this.modelYear = modelYear;
		this.transmissionType = transmissionType;
		this.fuelType = fuelType;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(Integer horsePower) {
		this.horsePower = horsePower;
	}

	public Integer getModelYear() {
		return modelYear;
	}

	public void setModelYear(Integer modelYear) {
		this.modelYear = modelYear;
	}

	public String getTransmissionType() {
		return transmissionType;
	}

	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	
}
