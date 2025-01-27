package the_interface_solution;

public class TeachingAssistant extends Student implements EmployeeInterface, StudentInterface{
	TeachingAssistant(String name, String subject){
		super(name, subject);
	}
	@Override
	public double computeSalary() {
		return 25000; // fixed stipend
	}
	@Override
	public double computeTax() {
		return 0; // no tax applied
	}
	
}
