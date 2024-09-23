package ASS8.Q1;

public class GrowableStack implements Stack {
    private Employee[] stack;
    private int top;
    public GrowableStack() {
        stack = new Employee[STACK_SIZE];
        top = -1;
    }

    @Override
    public void push(Employee e) {
        if (top == stack.length - 1) {
            Employee[] newStack = new Employee[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
        stack[++top] = e;
        System.out.println("Employee added to Growable Stack.");
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
