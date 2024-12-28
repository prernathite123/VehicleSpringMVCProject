package com.spring.Dao;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.spring.Model.Vehicle;



@Component
public class VehicleDao {

	
	private HibernateTemplate temp;
	
	
	public HibernateTemplate getTemp() {
		return temp;
	}


	public void setTemp(HibernateTemplate temp) {
		this.temp = temp;
	}


	public VehicleDao() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Transactional
	public void add(Vehicle v1) {
		temp.save(v1);
	}
	
	@Transactional
	public Vehicle updateData(Vehicle v1) {
//		Vehicle v=temp.get(Vehicle.class,v1.getVid());
//		v.setVname(v1.getVname());
//		v.setPrice(v1.getPrice());
//		v.setMilage(v1.getMilage());
		
		temp.update(v1);
		return v1;
	}
	
	@Transactional
	public Vehicle removeVehicle( Vehicle v1) {
		temp.delete(v1);
		return v1;
	}
	
	public Vehicle showById(int id) {
		Vehicle v1=temp.get(Vehicle.class,id);
		
		return v1;
		
	}
	
	public List<Vehicle> showAll(Vehicle v1) {
		List<Vehicle> list=temp.loadAll(Vehicle.class);
		return list;
		
	}
	
}
