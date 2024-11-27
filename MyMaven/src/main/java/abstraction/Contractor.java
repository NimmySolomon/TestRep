package abstraction;

public class Contractor extends Employee {
     double paymentPerHour;
     int workingHours;

    public Contractor(String name, double paymentPerHour, int workingHours) {
        super(name);
        this.paymentPerHour = paymentPerHour;
        this.workingHours = workingHours;
    }

    public double calculateSalary() {
        return paymentPerHour * workingHours;
    }
}
