package com.greyp.carowner;

import org.springframework.data.repository.CrudRepository;

public interface CarOwnerRepository extends CrudRepository<CarOwner, Integer> {

	public CarOwner getCarOwnerById(Integer id);
}
