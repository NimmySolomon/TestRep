package abstraction;

public class FullTimeEmployee extends Employee {
    double paymentPerHour;

    public FullTimeEmployee(String name, double paymentPerHour) {
        super(name);
        this.paymentPerHour = paymentPerHour;
    }

    public double calculateSalary() {
        return paymentPerHour * 8; 
    }
}
