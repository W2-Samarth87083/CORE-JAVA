package ASS8.Q1;

public class FixedStack implements Stack {
    private Employee[] stack;
    private int top;

    public FixedStack() {
        stack = new Employee[STACK_SIZE];
        top = -1;
    }

    @Override
    public void push(Employee e) {
        if (top == STACK_SIZE - 1) {
            System.out.println("Stack Overflow! Cannot add more employees.");
        } else {
            stack[++top] = e;
            System.out.println("Employee added to Fixed Stack.");
        }
    }
    @Override
    public Employee pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! No employees to pop.");
            return null;
        } else {
            return stack[top--];
        }
    }
}
