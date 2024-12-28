package com.spring.service;

import java.util.List;

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
	
	public void changeInfo(Vehicle v1) {
		dao.updateData(v1);
	}
	
	public void deleteInfo(Vehicle v1) {
		dao.removeVehicle(v1);
	}
	
	
	
	public Vehicle getInfoByid(int id) {
		return dao.showById(id);
	}
	
	public List<Vehicle> showAllData(Vehicle v1) {
		return dao.showAll(v1);
		
	}
	
}
