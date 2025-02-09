//TODO 10: make the Employee class implement EmployeeInterface
class Employee extends Person implements EmployeeInterface{
    //TODO 11: declare basicPay as int attribute
    int basicPay;

    Employee(String name, int age, int basic) {
        super(name,age);
        this.basicPay = basic;
    }
    @Override
    public double computeSalary() {
        //TODO 12: salary calculation logic goes here - basicPay+50 percent of basicPay
        double salary = basicPay+50%basicPay;
        return salary;
    }
    @Override
    public double computeTax() {
        double tax;
        //TODO 13: tax is 10 percent of basicPay
        tax = 10%basicPay;
        return tax;
    }
    @Override
    public void getDetails() {
        super.getDetails();
        //TODO 14: add print statements to print basicPay, salary and tax
        System.out.println("BasicPay: "+basicPay);
        System.out.println("Salary: "+computeSalary());
        System.out.println("Tax: "+computeTax());
    }
}