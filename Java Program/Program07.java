import java.util.Stack;

class customStack{
    private Stack<Integer> stack = new Stack();
    private int MaxLimit = 5;

    void push(int x){
        if(!isFull()){
            stack.push(x);
        }else{
            System.out.println("Stack is Full");
        }
    }

    int pop(){
        if(!isEmpty()){
            return  stack.pop();
        }else{
            System.out.println("Stack is empty");
            return -1;
        }
    }
    boolean isFull(){
        return stack.size() == MaxLimit;
    }

    boolean isEmpty(){
        return stack.isEmpty();
    }
}

public class Program07 {
    public static void main(String[] args) {
        customStack c1 = new customStack();
        c1.push(0);
        c1.push(1);
        c1.push(2);
        c1.push(3);
        c1.push(4);
        c1.push(5);
    }
}
