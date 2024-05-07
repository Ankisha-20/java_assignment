interface StackOperations {
    void push(int element);
    int pop();
    int peek();
    boolean isEmpty();
    boolean isFull();
}

class MyStack implements StackOperations {
    private int[] stackArray;
    private int top;
    private int maxSize;

    public MyStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int element) {
        if (!isFull()) {
            stackArray[++top] = element;
            System.out.println("Pushed element: " + element);
        } else {
            System.out.println("Stack Overflow! Cannot push element " + element);
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int poppedElement = stackArray[top--];
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        } else {
            System.out.println("Stack Underflow! Cannot pop element.");
            return -1; // You can return any sentinel value or throw an exception here
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // You can return any sentinel value or throw an exception here
        }
    }

   
    public boolean isEmpty() {
        return (top == -1);
    }

    
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

public class Assign13_4 {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5); // Creating a stack with size 5
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    int peekedElement = stack.peek();
                    if (peekedElement != -1) {
                        System.out.println("Peeked element: " + peekedElement);
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 4);
        scanner.close();
    }
}
