package in.cg.main.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class CarSensor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String modelName,ownerName;
	private double temperature,speed,fuelLevel,tirePressure;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getFuelLevel() {
		return fuelLevel;
	}
	public void setFuelLevel(double fuelLevel) {
		this.fuelLevel = fuelLevel;
	}
	public double getTirePressure() {
		return tirePressure;
	}
	public void setTirePressure(double tirePressure) {
		this.tirePressure = tirePressure;
	}
	@Override
	public String toString() {
		return "CarSensor [id=" + id + ", modelName=" + modelName + ", ownerName=" + ownerName + ", temperature="
				+ temperature + ", speed=" + speed + ", fuelLevel=" + fuelLevel + ", tirePressure=" + tirePressure
				+ "]";
	}
}
