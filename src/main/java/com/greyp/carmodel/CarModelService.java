package com.greyp.carmodel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarModelService {

	@Autowired
	private CarModelRepository carModelRepository;
	
	public void create(CarModel carModel) {
		carModelRepository.save(carModel);
	}

	public List<CarModel> getAll() {
		List<CarModel> list = new ArrayList<CarModel>();
		carModelRepository.findAll().forEach(list::add);
		
		return list;
	}

}
