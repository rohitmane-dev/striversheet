import java.util.Stack;

public class sspractice {
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

    private static void sortStack(Stack<Integer>stack , Stack<Integer>temStack){
        if(stack.isEmpty()){

            return; //base case
        }

        int top= stack.pop();
        //s1: pop first

        sortStack(stack, temStack);

        //s2: sort while returning
        

        insertSatck(stack,top);


    }
    private static void insertSatck(Stack<Integer>stack,int top){
        if(stack.isEmpty()|| stack.peek()<=top){
            stack.push(top); // when stack is not empty or stack contains all small elements compared to stack elements put the top into the stack 
            return;
        } 
            

        //
        // while(stack.isEmpty()&& stack.peek()>top){
            
        //     stack.pop();
        //     stack.push(top);

        // }// replace this logic with recus=rsion and more accurate 
        //if we have a stack in which the peek is smaller than the top then just add the top element becuase it will be the largest no. amoung the stack no need to sort further
        //if this is not the case 
        //i.e. top< peek();
        //then pop the peek and store it a variable called peek and then recursively call the insetStack Function : )

        //now its for the pentration into the stack

        //
        int peek = stack.pop();
        insertSatck(stack, top);// it means 
        stack.push(peek);

    }

}