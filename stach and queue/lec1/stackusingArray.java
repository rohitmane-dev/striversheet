public class stackusingArray {
    public static void main(String[]args){
        MyStack stack = new MyStack();

        // Test empty() on new stack
        System.out.println("Is stack empty? " + stack.empty()); // true

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Check top
        System.out.println("Top element: " + stack.top()); // 30

        // Pop an element
        System.out.println("Popped: " + stack.pop()); // 30

        // Check top after pop
        System.out.println("Top element after pop: " + stack.top()); // 20

        // Check empty
        System.out.println("Is stack empty? " + stack.empty()); // false

        // Pop remaining elements
        System.out.println("Popped: " + stack.pop()); // 20
        System.out.println("Popped: " + stack.pop()); // 10

        // Pop on empty stack
        System.out.println("Popped on empty: " + stack.pop()); // -1

        // Top on empty stack
        System.out.println("Top on empty: " + stack.top()); // -1

        // Check empty again
        System.out.println("Is stack empty now? " + stack.empty()); // true
    }
    
    
}

class MyStack {

    static int[] arr = new int[1000];
    static int i = -1;

    public MyStack() {

    }

    public void push(int x) {
        if (i >= arr.length-1) {
            System.out.println("Stack overflow");
            return;
        }
       
        i++;
        arr[i] = x;
        
    }

    public int pop() {
        if (i == -1)
            return -1;
        int pop = arr[i];
        // arr[i-1]=-1; no neeed becuase whenevr we want to 
        i--;
        return pop;
    }

    public int top() {
        if (i==-1)
            return -1;
        int top = arr[i];

        return top;
    }

    public boolean empty() {
        // if (i == -1)
        //     return true;
        // return false;

        return i==-1;

    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */