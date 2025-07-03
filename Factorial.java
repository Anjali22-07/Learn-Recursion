import java.util.*;

public class Factorial {
    

    static int factorial(int n){
        
     if(n==0){
        return 1;
     }
     return n*factorial(n-1);
        
    }
        public static void main(String[] args) {

        int n;
        System.out.println("Enter the number you want to find facorial of:");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
       int x= factorial(n);
        System.out.println("The factorial of the number is:"+x);
    }
}
