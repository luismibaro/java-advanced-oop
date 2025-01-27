package class_hierarchy_relationships;

public abstract class Car extends Vehicle {
	String make;
	String model;
	String color;
	int year;
	
	
	
	Car(String regNo, Engine engine){
		super(regNo, engine);
	}
	
	abstract String getColor();
	abstract String getMode();
	public String getYear(int year) {
		return "Car with "+this.registrationNo+"model :"+this.model+"year of Mfg: "+this.year;
	}
}
