package com.greyp.carowner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.greyp.car.Car;

@Entity
public class CarOwner {

	
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	@ElementCollection
	private Collection<Car> carsOwned;
	
	

	public CarOwner(){
		carsOwned = new ArrayList<Car>();
	}
	
	public CarOwner(Integer id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		carsOwned = new ArrayList<Car>();
	}
	
	public void addCar(Car car){
		carsOwned.add(car);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Collection<Car> getCarsOwned() {
		return carsOwned;
	}

	public void setCarsOwned(Collection<Car> carsOwned) {
		this.carsOwned = carsOwned;
	}
	
}
