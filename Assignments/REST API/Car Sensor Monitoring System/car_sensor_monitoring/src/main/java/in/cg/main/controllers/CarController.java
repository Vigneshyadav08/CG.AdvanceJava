package in.cg.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.cg.main.entities.CarSensor;
import in.cg.main.services.CarService;

@RestController
public class CarController {
	
	@Autowired
	CarService cs;
	
	@GetMapping("/car/{id}")
	public CarSensor getCar(@PathVariable int id)
	{
		return cs.getCar(id);
	}
	
	@PostMapping("/car")
	public CarSensor addCar(@RequestBody CarSensor css)
	{
		return cs.addCar(css);
	}
	
	@PutMapping("/car/{id}")
	public CarSensor addCar(@PathVariable int id,@RequestBody CarSensor css)
	{
		return cs.updateCar(id,css);
	}
}
