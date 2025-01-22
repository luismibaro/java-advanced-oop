package first_class_hierarchy_relationships;

abstract class Employee extends Person {
	Date dateOfAppointment;
	int salary;
	abstract void setSalary();
	abstract int getSalary();
}