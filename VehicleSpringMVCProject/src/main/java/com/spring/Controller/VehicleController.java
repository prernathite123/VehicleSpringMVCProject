package com.spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.Model.Vehicle;
import com.spring.service.VehicleService;

@Controller
public class VehicleController {

	@Autowired
	private VehicleService service;
	@RequestMapping("gotoform")
	public String form() {
		return "add";
	}
	@RequestMapping("/add")
	public String insert(@ModelAttribute Vehicle v1) {
		System.out.println("In insert method");
		System.out.println(v1);
		service.addVehicle(v1);
		return "add";
	}
}
