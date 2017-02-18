package com.greyp.car;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

	@Autowired
	private CarRepository carRepository;

	
	public void create(Car car) {
		carRepository.save(car);
	}

	public List<Car> getAll() {
		List<Car> list = new ArrayList<Car>();
		carRepository.findAll().forEach(list::add);
		
		return list;
	}

}
