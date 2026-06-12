//HERE WE ARE GOING TO IMPLEMENT THE STACK POP USING THE RECURSION 

import java.util.Stack;

public class popstack {
    public static void main(String [] args){
        System.out.println("Good morning your prgram output will be printed soon..");

        Stack<Integer>stack=new Stack<>();
        stack.push(14);
        stack.push(4);
        stack.push(12);
        stack.push(8);
        stack.push(6);
        stack.push(2);
        stack.push(19);
        stack.push(10);

        stackPop(stack);

    }

    private static void stackPop( Stack<Integer>stack){
        if(stack.isEmpty())return;
        System.out.println(stack.pop());// calling phase
        stackPop(stack);// tail recursion
        //System.out.println("Poped !! it is an returing phase msg"); // returning phase. : )
    }
}
