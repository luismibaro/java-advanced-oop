package class_hierarchy_relationships;

public class Sedan extends Car {
	int doors;
	
	public Sedan(String regNo, Engine engine) {
		super(regNo, engine);
		// TODO Auto-generated constructor stub
	}

	@Override
	String getColor() {
		return this.color;
	}
	
	@Override 
	String getMode() {
		return this.model;
	}
	
	String getDetails() {
		 return "NO sé";
	};
	
	@Override
	public void startEngine() {
		System.out.println("Sedan with "+this.getDetails()+"Engine started");
	}
}
