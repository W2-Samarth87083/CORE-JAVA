

/* **************
Author:Samarth Zadbuke
Question:1.   Create Java application for fixed stack & growable stack based on Stack 
interface, for storing emp details.  
1.1  Create Employee class -- id,name,salary, constructor,toString 
1.2 Stack interface -- push & pop functionality for Emp refs. & declare 
STACK_SIZE as a constant.  
1.3 Create implementation class of Stack i/f -- FixedStack (array based) 
1.4 Create another implementation class of Stack i/f-- GrowableStack (array 
based) 
1.5 Create Tester class (Hint :  use dynamic method dispatch using 
interfaces) 
Display Menu 
Note : Must use 1 switch-case only. You won't need any complex nested 
control structure 
Once user selects either fixed or growable stack , user shouldn't be allowed 
to change the selection of the stack. 
(Hint : null checking) 
1 -- Choose Fixed Stack 
2 -- Choose Growable Stack 
Accept following options only after initial selection.(Hint : null checking) 
3 -- Push data  
I/P : Accept emp details & store these details in the earlier chosen stack or 
give error mesg : NO stack chosen !!! 
4 --- Pop data & display the same (from the earlier chosen stack or give error 
mesg : NO stack chosen !!!) 
No inputs are required : pop emp details from the top of the stack 
5 -- Exit 
/* */
package ASS8.Q1;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack chosenStack = null; 
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Choose Fixed Stack");
            System.out.println("2. Choose Growable Stack");
            System.out.println("3. Push Employee Data");
            System.out.println("4. Pop Employee Data");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (chosenStack == null) {
                        chosenStack = new FixedStack();
                        System.out.println("Fixed Stack selected.");
                    } else {
                        System.out.println("Stack already chosen! Cannot change.");
                    }
                    break;

                case 2:
                    if (chosenStack == null) {
                        chosenStack = new GrowableStack();
                        System.out.println("Growable Stack selected.");
                    } else {
                        System.out.println("Stack already chosen! Cannot change.");
                    }
                    break;

                case 3:
                    if (chosenStack == null) {
                        System.out.println("No stack chosen! Please select a stack first.");
                    } else {
                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Employee Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Employee Salary: ");
                        double salary = sc.nextDouble();
                        Employee emp = new Employee(id, name, salary);
                        chosenStack.push(emp);
                    }
                    break;

                case 4:
                    if (chosenStack == null) {
                        System.out.println("No stack chosen! Please select a stack first.");
                    } else {
                        Employee poppedEmp = chosenStack.pop();
                        if (poppedEmp != null) {
                            System.out.println("Popped Employee: " + poppedEmp);
                        }
                    }
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting the application.");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        sc.close();
    }
}
