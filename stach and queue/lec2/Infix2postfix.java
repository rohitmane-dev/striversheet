import java.util.*;

class Infix2postfix {
    public static String infixToPostfix(String s) {

        StringBuilder exp = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) { ///to over the string characters


            if (Character.isLetterOrDigit(c)) { //if the character is a letter that is it is an operant which we direactly add to  our expression

                exp.append(c);
            } 

            else if (c == '(') { //if (  means we are entering into a another bracket that need to be direacly pushed into the stack to keep track of new opening
                stack.push(c);
            } 

            else if (c == ')') { //now the ) means we are now aikmed to pop the elements from the stack by purpose to make a expression and 
                
                while (!stack.isEmpty() && stack.peek() != '(') { ///if stack is not empty and the bracket is not going to end then just pop the stack and add it to the expression
                    exp.append(stack.pop());
                }
                if (!stack.isEmpty()) stack.pop(); // remove '(' so that whole bracket is solved and get poped by stack
            } 
            
            else { // Operator like + ,-,*,/,^

                while (!stack.isEmpty() && stack.peek() != '(' &&
                       (precedence(stack.peek()) > precedence(c) ||
                        (precedence(stack.peek()) == precedence(c) ))) {// when the current operator have a low precedence than peek operator stored in stack then it needs to be add direacty in the expression
                            //e.g.: + * ok 
                            //but *+ is not ok * will be added to the espresssion as it(* i.e. peek ) have the hiher precedence 
                    exp.append(stack.pop());
                }
                stack.push(c);//if the c have less or high precedence what to do is handeled in above code snippit this is to add c in satyck 
            }
        }

        while (!stack.isEmpty()) {//add remaining in stack to the exp
            exp.append(stack.pop());
        }

        return exp.toString();
    }

    private static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '^') return 3;
        return -1;
    }

    

    public static void main(String[] args) {
        String input = "h^m^q^(7-4)";
        System.out.println(infixToPostfix(input)); // Expected: hm^q^74-^
    }
}
