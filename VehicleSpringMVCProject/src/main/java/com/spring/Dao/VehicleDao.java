package com.spring.Dao;

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
	
	
}
