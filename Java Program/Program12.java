import java.util.Scanner;

class StackExceptionGenerate extends Exception {
    StackExceptionGenerate() {
        super("Something wen't wrong.");
    }

    StackExceptionGenerate(String msg) {
        super(msg);
    }

}

class Stack {
    private int maxLimit;
    private int top;
    private int[] stackArr;
    Scanner takeInput = new Scanner(System.in);

    Stack(int maxLimit) {
        this.maxLimit = maxLimit;
        this.stackArr = new int[this.maxLimit];
        this.top = -1;
    }

    int takeElement() {
        int element;
        System.out.print("Enter the Element to insert : ");
        element = takeInput.nextInt();
        return element;
    }

    void push() {
        try {

            if (!(top == this.maxLimit - 1)) {
                int element = takeElement();
                top += 1;
                this.stackArr[top] = element;
            } else {
                throw new StackExceptionGenerate("Stack is Overflow");
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    int pop() {
        if (!(this.top == -1)) {
            int element = this.stackArr[this.top];
            this.stackArr[this.top] = 0;
            this.top -= 1;
            return element;
        } else {

            return -1;
        }

    }

    void peek() {
        try {

            if (this.top == -1) {
                throw new StackExceptionGenerate("Stack is empty");
            } else {
                System.out.println("Top element is : " + (stackArr[top]));
            }
        } catch(Exception e){
            System.out.println("Error : "+e.getMessage());
        }
    }

    void traverse() {
        try {

            if (!(this.top == -1)) {
                System.out.print("Element of Stack Array - ");
                for (int i = 0; i <= this.top; i++) {
                    System.out.print(this.stackArr[i] + "  ");
                }
                System.out.println();
            } else {
                throw new StackExceptionGenerate("No element is available");
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}

public class Program12 {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);
        Stack s = new Stack(5);
        int choice;
        try {
            while (true) {
                System.out.print("Enter your choice : ");
                choice = takeInput.nextInt();
                switch (choice) {
                    case 1:
                        s.push();
                        break;

                    case 2:

                        int deletedElement = s.pop();
                        if (!(deletedElement == -1)) {
                            System.out.println(deletedElement + " is deleted");
                        } else {
                            throw new StackExceptionGenerate("Stack is underflow");
                        }

                        break;

                    case 3:
                        s.peek();

                        break;

                    case 4:
                        s.traverse();
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }

    }

}