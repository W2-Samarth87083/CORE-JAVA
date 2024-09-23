

/* **************
Author:Samarth Zadbuke
Question:3. A company pays its employees on a weekly basis. The 
employees are of four types: 
Salaried employees are paid a fixed weekly salary regardless of 
the number of hours worked, hourly employees are paid by the hour and 
receive overtime pay (i.e., 1.5 times their hourly salary rate) for all hours 
worked in excess of 40 hours, commission employees are paid a 
percentage of their sales and base-salaried commission employees 
receive a base salary plus a percentage of their sales. For the 
current pay period, the company has decided to reward salaried- 
commission employees by adding 10% to their base salaries. 
The company wants to write an application that performs its 
payroll calculations polymorphically. 
/* */
package ASS6.Q2;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double grossSales,
            double commissionRate, double baseSalary) {
        super(firstName, lastName, ssn, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("Base-Salaried Commission Employee: %s\nBase Salary: %.2f", super.toString(),
                getBaseSalary());
    }
}
