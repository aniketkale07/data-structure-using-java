package stack;

/**
 * CustomStack
 */
public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int top = -1;

    // If the user gives the size
    public CustomStack(int size) {
        this.data = new int[size];
    }

    // the size of the stack is equal to default_size
    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    // Check if the stack is NULL
    public boolean isNull() {
        return top == -1;
    }

    // Check if the stack is FULL
    public boolean isFull() {
        return top == data.length - 1;
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full, can't insert " + item);
            return false;
        }

        top++;
        data[top] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isNull()) {
            System.out.println("Stack is Empty.");
            throw new Exception("Cannot pop from an Empty stack");
        }
        int removed = data[top];
        top--;
        return removed;
    }

    // Override toString for meaningful representation of the stack
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Stack: ");
        for (int i = 0; i <= top; i++) {
            result.append(data[i]).append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(4);

        stack.push(44);
        System.out.println("After pushing 44: " + stack);

        stack.push(42);
        System.out.println("After pushing 42: " + stack);

        stack.push(14);
        System.out.println("After pushing 14: " + stack);

        stack.push(4);
        System.out.println("After pushing 4: " + stack);

        try {
            // Pop an element
            int poppedValue = stack.pop();
            System.out.println("Popped element: " + poppedValue);
            System.out.println("After popping: " + stack);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
