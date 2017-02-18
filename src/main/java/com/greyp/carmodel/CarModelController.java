package com.greyp.carmodel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarModelController {

	@Autowired
	private CarModelService carModelService;
	
	@RequestMapping(method=RequestMethod.POST, value="/carmodel/create")
	public void create(@RequestBody CarModel carModel){
		carModelService.create(carModel);
	}
	
	@RequestMapping("/carmodel")
	public List<CarModel> get(){
		return carModelService.getAll();
	}
}
