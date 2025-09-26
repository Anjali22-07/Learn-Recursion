
public class DecreasingIncreasing{

    public static void main(String[] args){

        int n=5;
        DecInc(n);
    }

    public  static void DecInc(int n){

         //base case
         if(n==0)  return;
         System.out.print(n+" ");  //work
         DecInc(n-1);  //this prints 5 4 3 2 1 
        System.out.print(n+" ");    //
       
    }
}