public class Teacher extends Employee {
    String Name;
    String qualification;

    Teacher(String name, Date date, Date dateOfAppointment,String qualification, String subject){
        this.name = name;
        this.dob = date;
        this.dateOfAppointment = dateOfAppointment;
        this.qualification = qualification;
        this.subject = subject;
    }


    @Override
    void getDetails() {
        System.out.println("Name of Teacher: " + this.name);
        System.out.println("Date of Birth: " + this.dob.getDate());
        System.out.println("Date of Appointment: " + this.dateOfAppointment.getDate());
        System.out.println("Subject: " + this.subject);
        System.out.println("Qualifications: " + this.qualification);
        System.out.println("Salary: " + this.getSalary());
    }

    @Override
    void setSalary(int sal) {
        this.salary = sal;

    }

    @Override
    int getSalary() {
        return salary;
    }


}