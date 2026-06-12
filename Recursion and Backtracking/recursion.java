import java.util.*;
import java.util.Scanner;


public class recursion {
    // function to find the factorial of a number
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return n * factorial(n - 1); // Recursive case
    }

    // function to find the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case: Fibonacci of 0 is 0
        } else if (n == 1) {
            return 1; // Base case: Fibonacci of 1 is 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
    }
    // function to calculate the power of a number
    public static int power(int base, int exponent) {
        if(base==0)return 1;
        else if (exponent==1) return base;
        
        return base*(power(base,exponent - 1));
    }

    //function to repeatedly print the name
    public static void namerep(String name, int n){
        if(n==0)return;
        else{
            System.out.println(name);
        }
        
        namerep(name, n-1);
        return ;
    }

    public static int oneton(int n){
        if(n==0)return 0;
        else{
            System.out.println(n);

        }
        return oneton(n-1);
    }
    public static int ntoone(int n,int cnt){
        if(n==cnt)return 0;
        else{
            cnt++;
            System.out.println(cnt);

        }
        return ntoone(n,cnt);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.printf("You Have the following chioces: \n 1) Print a name recursively. \n 2) Do the exponent and base calculation of the no.s \n 3) Find factorial \n 4) print n to 1 \n 5) print 1 to n  ");
        System.out.println("Enter your chioce: ");
        int chioce= sc.nextInt();

        int result;
        int n;

        switch (chioce) {
            case 1:
                System.out.println("Enter the name: ");
                String name= sc.next();
                
                System.out.println("How much iterations you want to perform? ");
                int iterations = sc.nextInt();

                namerep(name,iterations);
                
                break;

            case 2:
                System.out.println("Enter the value of Exponent : ");
                int exponent= sc.nextInt();

                System.out.println("Enter the value of Exponent : ");
                int base= sc.nextInt();

                result= power(base, exponent);
                System.out.printf("The Expected result will be: %d ", result);
            
                break;

            case 3:
                System.out.println("Enter the value to find the factorial : ");
                int number= sc.nextInt();

                

                result= factorial(number);
                System.out.printf("The factorial of no %d  is  %d ", number, result);
            
                break;
            case 4:
                System.out.println("Enter the value: ");
                n= sc.nextInt();

                

                result= ntoone(n,0);
                
            
                break;

            case 5:
                System.out.println("Enter the value : ");
                n= sc.nextInt();

                

                result= oneton(n);
               
            
                break;
        
            default:
                break;
        }




        
    }
    
}
