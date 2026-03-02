package in.cg.main.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.cg.main.entities.CarSensor;
import in.cg.main.repositories.CarRepository;

@Service
public class CarServiceCls implements CarService{

	@Autowired
	CarRepository cr; 
	
	@Override
	public CarSensor getCar(int id) {
		try {
			return cr.findById(id).get();
		}catch(Exception e)
		{
			return null;
		}
	}

	@Override
	public CarSensor addCar(CarSensor cs) {
		try {
			cr.save(cs);
			return cs;
		}catch(Exception e)
		{
			return null;
		}
	}

	@Override
	public CarSensor updateCar(int id, CarSensor css) {
		CarSensor csss = cr.findById(id).get();
		csss = css;
		cr.save(csss);
		return csss;
	}
	
}
