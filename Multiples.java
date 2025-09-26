public class Multiples {
    
    public static void main(String[] args) {
        int n=12;
        int k=5;
       multiple(n,k);
      // System.out.print(ans+" ");
    }
    public static void multiple(int n, int k){

         if(k==0)  return;
             
           multiple(n,k-1);
           System.out.println(n*k);
      


    }
}
