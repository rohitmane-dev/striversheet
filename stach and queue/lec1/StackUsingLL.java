import java.util.LinkedList;

public class StackUsingLL {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        System.out.println("Is stack empty? " + stack.empty()); // true

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // 30
        System.out.println("Pop: " + stack.pop()); // 30
        System.out.println("Top element after pop: " + stack.peek()); // 20

        System.out.println("Is stack empty? " + stack.empty()); // false

        System.out.println("Pop: " + stack.pop()); // 20
        System.out.println("Pop: " + stack.pop()); // 10
        System.out.println("Pop on empty stack: " + stack.pop()); // -1
        System.out.println("Peek on empty stack: " + stack.peek()); // -1
        System.out.println("Is stack empty now? " + stack.empty()); // true
    }
}


class MyStack {
    private LinkedList<Integer> list = new LinkedList<>();

    public void push(int x) {
        list.addLast(x); // Adds to tail
    }

    public int pop() {
        if (list.isEmpty()) return -1;
        return list.removeLast(); // Removes from tail
    }

    public int peek() {
        if (list.isEmpty()) return -1;
        return list.getLast(); // Peek at tail
    }

    public boolean empty() {
        return list.isEmpty();
        
    }
}
