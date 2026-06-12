// Implement queue using Linkedlist

import java.util.LinkedList;

public class QueueUsingLL{
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        System.out.println("Is queue empty? " + queue.empty()); // true

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.peek()); // 10
        System.out.println("Dequeue: " + queue.dequeue()); // 10
        System.out.println("Front element: " + queue.peek()); // 20

        System.out.println("Is queue empty? " + queue.empty()); // false

        System.out.println("Dequeue: " + queue.dequeue()); // 20
        System.out.println("Dequeue: " + queue.dequeue()); // 30
        System.out.println("Dequeue on empty: " + queue.dequeue()); // -1
        System.out.println("Front on empty: " + queue.peek()); // -1
        System.out.println("Is queue empty now? " + queue.empty()); // true
    }

    
}

class MyQueue{
    private LinkedList<Integer> li = new LinkedList<>();
    public void enqueue(int x){
        li.add(x);
        
    }
    public int dequeue(){
        if (li.isEmpty()) return -1; // Safe check
        return li.removeFirst();
    }
    public int peek(){
        if (li.isEmpty()) return -1; // Safe check
        return li.peekFirst();

    }
    public boolean empty(){
        return li.isEmpty();
    }
}