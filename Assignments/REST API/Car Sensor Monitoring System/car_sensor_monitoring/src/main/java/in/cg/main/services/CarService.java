package in.cg.main.services;

import org.springframework.stereotype.Service;

import in.cg.main.entities.CarSensor;

@Service
public interface CarService {

	public CarSensor getCar(int id);
	public CarSensor addCar(CarSensor cs);
	public CarSensor updateCar(int id, CarSensor css);
	
}
