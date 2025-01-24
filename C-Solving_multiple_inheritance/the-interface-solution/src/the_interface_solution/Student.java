package the_interface_solution;

public class Student extends Person implements StudentInterface{
	String subject;
	
	Student(String name, String subject) {
		this.name = name;
		this.subject = subject;
	}
	
	@Override 
	void getDetails() {
		super.getDetails();
		System.out.println("Subject: "+this.subject);
	}
	
	@Override
	public void computeGrade() {
		//
	}
	
	@Override 
	public void payFee() {
		System.out.println("Student pays the fees");
	}
}
