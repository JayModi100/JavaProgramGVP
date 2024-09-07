import java.util.Scanner;

class StackException extends Exception {
    StackException() {
        super("Something went's wrong..");
    }

    StackException(String Er) {
        super(Er);
    }
}

class Stack {
    int MaxLimit;
    int top;
    int[] stack;
    Scanner takeInput = new Scanner(System.in);

    Stack() {
        this.MaxLimit = 5;
        this.top = -1;
        this.stack = new int[this.MaxLimit];
    }

    Stack(int maxLimit) {
        this.MaxLimit = maxLimit;
        this.top = -1;
        this.stack = new int[this.MaxLimit];
    }

    int takeElement() {
        int element;
        System.out.print("Enter the Element to insert : ");
        element = takeInput.nextInt();
        return element;
    }

    void push() {
        try {
            if (!(this.top != MaxLimit - 1)) {
                int element = takeElement();
                top += 1;
                this.stack[top] = element;
            } else {
                throw new StackException("Stack is Overflow");
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}

public class Program12 {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);
        stack s = new stack(5);
        int choice;
        while(true){
            System.out.print("Enter your choice : ");
            choice = takeInput.nextInt();
            switch(choice){
                case 1:
                    s.push();
                    break;
                    
                // case 2:
                //     int deletedElement = s.pop();
                //     if(!(deletedElement == -1)){
                //         System.out.println(deletedElement + " is deleted");
                //     }else{
                //         System.out.println("Stack is empty");
                //     }
                //     break;
                    
                // case 3:
                //     s.traverse();
                //     break;
            }
        }
    }
}