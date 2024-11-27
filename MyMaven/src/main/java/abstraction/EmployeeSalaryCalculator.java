package abstraction;

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
    
        Contractor contractor = new Contractor("Annie", 50, 40); 
        System.out.println("Contractor " + contractor.name + "'s salary: $" + contractor.calculateSalary());

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John", 60); 
        System.out.println("Full-time Employee " + fullTimeEmployee.name + "'s salary: $" + fullTimeEmployee.calculateSalary());
    }
}
