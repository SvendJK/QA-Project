package com.svend.planes;

public class Vehicle {

	// Encapsulation - garage task

	private int id;
	private String model;
	private int mileage;
	private String vehicleType;
	private int doors;

	public Vehicle() {
		super();
	}

	public Vehicle(int id, String model, int mileage, String vehicleType, int doors) {
		super();
		this.id = id;
		this.model = model;
		this.mileage = mileage;
		this.vehicleType = vehicleType;
		this.doors = doors;
	}

	public Vehicle(String model, int mileage, String vehicleType, int doors) {
		super();
		this.model = model;
		this.mileage = mileage;
		this.vehicleType = vehicleType;
		this.doors = doors;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", model=" + model + ", mileage=" + mileage + ", vehicleType=" + vehicleType
				+ ", doors=" + doors + "]";
	}

}
