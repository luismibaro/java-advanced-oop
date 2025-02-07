abstract class Employee extends Person{
    Date dateOfAppointment;
    int salary;
    String subject;

    abstract void setSalary(int sal);
    abstract int getSalary();


}
