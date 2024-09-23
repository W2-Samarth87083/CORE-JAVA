/* **************
Author:Samarth Zadbuke

Question:1. Create a class called Employee that includes three instance variables—a 
first name (type String), a last name (type String) and a monthly salary 
(double). Provide a constructor that initializes the three instance variables. 
Provide a set and a get method for each instance variable. If the monthly 
salary is not positive, do not set its value. Write a test application named 
EmployeeTest that demonstrates class Employee’s capabilities. Create two 
Employee objects and display each object’s yearly salary. Then give each 
Employee a 10% raise and display each Employee’s yearly salary again. 

**********************
 */
public class EmployeeTest {
    public static void main(String[] args) {

        // Create two Employee objects
        Employee employee1 = new Employee("John", "Doe", 5000.00);
        Employee employee2 = new Employee("Jane", "Smith", 4500.00);

        // Display each employee's yearly salary before raise
        System.out.println("Employee 1: " + employee1.getFirstName() + " " + employee1.getLastName());
        System.out.println("Yearly Salary: $" + employee1.getYearlySalary());

        System.out.println("\nEmployee 2: " + employee2.getFirstName() + " " + employee2.getLastName());
        System.out.println("Yearly Salary: $" + employee2.getYearlySalary());

        // Give each employee a 10% raise
        employee1.giveRaise(10);
        employee2.giveRaise(10);

        // Display each employee's yearly salary after the raise
        System.out.println("\nAfter 10% raise:");

        System.out.println("Employee 1: " + employee1.getFirstName() + " " + employee1.getLastName());
        System.out.println("Yearly Salary: $" + employee1.getYearlySalary());

        System.out.println("\nEmployee 2: " + employee2.getFirstName() + " " + employee2.getLastName());
        System.out.println("Yearly Salary: $" + employee2.getYearlySalary());
    }
}
