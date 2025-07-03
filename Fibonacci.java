public class Fibonacci {
    
static int fibonacci(int n){


    //There are two base cases in this logic-- because we are referring two previous values;
    if(n==0){
        return 0;
    }
    if(n==1){
        return 1;
    }

    return fibonacci(n-1)+fibonacci(n-2);
}

public static void main(String[] args) {
    
    for(int i=0;i<8;i++){
    System.out.print(fibonacci(i)+" ");
    }
}




}
