//Stack Program. inset, delete, traverse.

import java.util.Scanner;

class stack{
    private int maxLimit;
    private int top;
    private int[] stackArr;
    Scanner takeInput = new Scanner(System.in);
    
    stack(int maxLimit){
        this.maxLimit = maxLimit;
        this.stackArr = new int[this.maxLimit];
        this.top = -1;
    }
    
    int takeElement(){
        int element;
        System.out.print("Enter the Element to insert : ");
        element = takeInput.nextInt();
        return element;
    }
    
    void push(){
        if(!(top == this.maxLimit-1)){
            int element = takeElement();
            top+=1;
            this.stackArr[top] = element;
        }else{
            System.out.println("Stack is Full.");
        }
    }
    
    int pop(){
        if(!(this.top == -1)){
            int element = this.stackArr[this.top];
            this.stackArr[this.top] = 0;
            this.top -= 1;
            return element;
        }else{
            
            return -1;
        }
        
    }
    
    void traverse(){
        if(!(this.top == -1)){
            System.out.print("Element of Stack Array - ");
            for(int i = 0;i <= this.top;i++){
                System.out.print(this.stackArr[i] + "  ");
            }
            System.out.println();
        }else{
            System.out.println("Stack is empty");
        }
    }
}

public class Program07 {
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
                    
                case 2:
                    int deletedElement = s.pop();
                    if(!(deletedElement == -1)){
                        System.out.println(deletedElement + " is deleted");
                    }else{
                        System.out.println("Stack is empty");
                    }
                    break;
                    
                case 3:
                    s.traverse();
                    break;
            }
        }
    }
}
