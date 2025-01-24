package the_interface_solution;

public class Employee extends Person implements EmployeeInterface{
	int basicPay;
	Employee(String name, int basic){
		this.name = name;
		this.basicPay = basic;
	}
	@Override
	public double computeSalary() {
		double salary;
		salary = this.basicPay+this.basicPay*0.50;
		// Salary computation logic
		return salary;
	}
	@Override
	public double computeTax() {
		return this.basicPay*0.10;
	}
}
