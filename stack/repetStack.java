package stack;

import java.util.Arrays;

public class repetStack {
    protected int data[];
    private static final int DEFAULT_SIZE = 10;
    int top = -1;

    public repetStack(int size) {
        this.data = new int[size];
    }

    public boolean isNull() {
        return top == -1;
    }

    public boolean isFull() {
        return top == data.length - 1; // data is the array where stack is stored
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full, can't insert element into it");
            return false;
        }

        top++;
        data[top] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isNull()) {
            System.out.println("Stack is Null, can't Pop element");
            throw new Exception("Can't pop element");
        }
        int removed = data[top];
        top--;
        return removed;
    }

    @Override
    public String toString() {
        int[] elements = Arrays.copyOfRange(data, 0, top + 1);
        return "Stack{" +
                "data=" + Arrays.toString(elements) +
                ", top=" + top +
                '}';
    }

    public static void main(String[] args) {
        repetStack stack = new repetStack(4);

        stack.push(4);
        stack.push(5);
        stack.push(34);
        stack.push(22);

        try {
            int popped = stack.pop();
            System.out.println("Popped element: " + popped);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(stack);
    }
}
