package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Dao.VehicleDao;
import com.spring.Model.Vehicle;

@Service
public class VehicleService {

	@Autowired
	VehicleDao dao;
	
	public void addVehicle(Vehicle v1) {
		dao.add(v1);
	}
}
