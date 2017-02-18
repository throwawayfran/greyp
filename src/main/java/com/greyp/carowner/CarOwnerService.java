package com.greyp.carowner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greyp.car.Car;

@Service
public class CarOwnerService {

	@Autowired
	private CarOwnerRepository carOwnerRepository;
	
	public void create(CarOwner carOwner) {
		carOwnerRepository.save(carOwner);
	}

	public List<CarOwner> getAll() {
		List<CarOwner> list = new ArrayList<CarOwner>();
		carOwnerRepository.findAll().forEach(list::add);
		
		return list;
	}

	public void addCar(CarOwner carOwner, Car car) {
		carOwner.addCar(car);
		carOwnerRepository.save(carOwner);
	}

	public CarOwner get(Integer id) {
		return carOwnerRepository.getCarOwnerById(id);
	}

}
