package com.greyp.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

	@Autowired
	private CarService carService;
	
	@RequestMapping(method=RequestMethod.POST, value="/car/create")
	public void create(@RequestBody Car car){
		carService.create(car);
	}
	
	@RequestMapping("/car")
	public List<Car> get(){
		return carService.getAll();
	}
}
