package in.cg.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.cg.main.entities.CarSensor;

public interface CarRepository extends JpaRepository<CarSensor, Integer>{

}
