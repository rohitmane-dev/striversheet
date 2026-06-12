// Fixed size queue..

public class QueueUsingArray {
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


class MyQueue {

    static int[] arr = new int[1000];
    static int front= -1, rare=-1;

    public MyQueue() {

    }

    public void enqueue(int x) {
        if (rare >= arr.length-1) {
            System.out.println("Stack overflow");
            return;
        }
       if(front==-1)front++;
        rare++;
        arr[rare] = x;
        
    }

    public int dequeue() {
        if (rare == -1)
            return -1;

        int pop = arr[front];
        front++; //front ++ it means we are removing from front
         
        if (front > rare) { // Queue became empty
            front = -1;
            rare = -1;
        }
        
        return pop;
    }

    public int peek() {
        if (rare==-1)
            return -1;
        int top = arr[front];

        return top;
    }

    public boolean empty() {
        // if (i == -1)
        //     return true;
        // return false;

        return front== -1 || rare<front;

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

//  command to compile: javac QueueUsingArray.java
// To Run : java QueueUsingArray
