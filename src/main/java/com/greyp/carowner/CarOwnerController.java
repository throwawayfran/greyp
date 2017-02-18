package com.greyp.carowner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarOwnerController {

	@Autowired
	private CarOwnerService carOwnerService;
	
	@RequestMapping(method=RequestMethod.POST, value="/carowner/create")
	public void create(@RequestBody CarOwner carOwner){
		carOwnerService.create(carOwner);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/carowner/addCar")
	public void addCar(@RequestBody Wrapper wrapper){
		carOwnerService.addCar(wrapper.getCarOwner(), wrapper.getCar());
	}
	
	@RequestMapping("/carowner/{id}")
	public CarOwner get(@PathVariable Integer id){
		return carOwnerService.get(id);
	}
}
