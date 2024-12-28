package com.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.Model.Vehicle;
import com.spring.service.VehicleService;

import net.bytebuddy.matcher.ModifierMatcher.Mode;

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
	
	
	
	@RequestMapping("/updateForm")
	public String updateVehicle() {
		return "update";
	}
	
	@RequestMapping("/update")
	public String changeVehicleInfo(@ModelAttribute Vehicle v1) {
		System.out.println(v1);
		service.changeInfo(v1);
		return "update";
	}
	

	@RequestMapping("/deleteForm")
	public String removeVehicle() {
		return "delete";
	}
	
	@RequestMapping("/delete")//action of form
	public String removeVehicleInfo(@ModelAttribute Vehicle v1) {
		System.out.println(v1);
		service.deleteInfo(v1);
		return "delete";
	}

	@RequestMapping("/getbyid/{vid}")
	public String getDataByid(@PathVariable("vid") int id,Model model) {
		Vehicle v1=service.getInfoByid(id);
		model.addAttribute("vehicle", v1);
		System.out.println(v1);
		return "showsingledata";
	}
	
	@RequestMapping("/getData")
	public String getAll(Vehicle v1, Model model) {
	    List<Vehicle> v = service.showAllData(v1); 
	    model.addAttribute("vehicleshow", v);
	    System.out.println(v); 
	    return "showAlldata"; 
	}

}
