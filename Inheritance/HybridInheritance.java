
class Vehicle{
	private String name;

	public Vehicle(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + "]";
	}
	
	
}
class Car extends Vehicle{
	private String carName;

	public Car(String name, String carName) {
		super(name);
		this.carName = carName;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", getCarName()=" + getCarName() + "]";
	}
	
	
}
class Battery extends Car{
	private String batteryName;

	public Battery(String name, String carName, String batteryName) {
		super(name, carName);
		this.batteryName = batteryName;
	}

	public String getBatteryName() {
		return batteryName;
	}

	public void setBatteryName(String batteryName) {
		this.batteryName = batteryName;
	}

	@Override
	public String toString() {
		return "Battery [batteryName=" + batteryName + "]";
	}
	
	
}
class Petrol extends Car{
	public Petrol(String name, String carName) {
		super(name, carName);
	}
}


public class HybridInheritance {

	public static void main(String[] args) {
		Battery petrol= new Battery("nexon", "car", "battery");
		System.out.println(petrol);
		
	}

}
