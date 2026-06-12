import java.util.Stack;

public class SortStack {
    // This class is a placeholder for the SortStack functionality.
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(8);
        stack.push(1);
        stack.push(7);
        stack.push(2);

        Stack<Integer> tempStack = new Stack<>();

        System.out.println("Original Stack: " + stack);
        sortStack(stack,tempStack);
        System.out.println("Sorted Stack: " + stack);

    }
    //THis method uses the while loops but i need a recursive solution
    // private static void sortStack(Stack<Integer> stack) {
    //     Stack<Integer> tempStack = new Stack<>();
        
    //     while (!stack.isEmpty()) {
    //         int current = stack.pop();
            
    //         while (!tempStack.isEmpty() && tempStack.peek() > current) { //it means we are aimed to allow only smallest elememnt to be 1st in the stack and then in incresing order
    //             //just a one sign changed then the ascending or descending order will be achieved
    //             stack.push(tempStack.pop());
    //         }
            
    //         tempStack.push(current);// add the poped element in the temp stack :)
    //     }
        
    //     // Transfer sorted elements back to the original stack
    //     while (!tempStack.isEmpty()) {
    //         stack.push(tempStack.pop());
    //     }
    // }

    // This method is now fully recursive

    // 
    private static void sortStack(Stack<Integer> stack, Stack<Integer> tempStack) {
        if (stack.isEmpty()) {
            return;
        }

        int current = stack.pop();

        // Recursively sort the remaining stack
        sortStack(stack, tempStack); // to continuesly got pop the element s untill the stacjk becomes the empty
        //and then go for comparing and putting the bottom element first in the tempStack


        // Insert the current element into the sorted stack
        while (!tempStack.isEmpty() && tempStack.peek() < current) {
            stack.push(tempStack.pop());
        }
        
        tempStack.push(current);

        // Transfer sorted elements back to the original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
}
