

public class CircularQueueUsingArray {
    
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5); // Queue of size 5

        System.out.println("Is queue empty? " + queue.isEmpty()); // true

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50); // Queue full after this
        queue.enqueue(60); // Should print "Queue is full"

        System.out.println("Front element: " + queue.peek()); // 10

        System.out.println("Dequeue: " + queue.dequeue()); // 10
        System.out.println("Dequeue: " + queue.dequeue()); // 20

        queue.enqueue(60);
        queue.enqueue(70); // Wrap-around insertion

        System.out.println("Front element after wrap-around: " + queue.peek()); // 30

        while (!queue.isEmpty()) {
            System.out.println("Dequeue: " + queue.dequeue());
        }

        System.out.println("Dequeue on empty: " + queue.dequeue()); // -1
    }
}

class CircularQueue {
    private int[] arr;
    private int front, rear, size;

    public CircularQueue(int size) {
        arr = new int[size];
        this.size = size;
        front = -1;
        rear = -1;
    }

    public void enqueue(int x) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) {
            front = 0; // First insertion
        }
        rear = (rear + 1) % size; //circular increment
        arr[rear] = x;
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int val = arr[front];
        if (front == rear) {
            // Queue has only one element
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size; //circular increment
        }
        return val;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return front == -1;
    }
}


