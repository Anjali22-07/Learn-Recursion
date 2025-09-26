public class reverse {
    
    static int r=0;
    public static void main(String[] args) {
        
        int n=2456;
        System.out.println(reverse(n));
    }

     public static  int reverse(int n){
        //      if(n==0)  return r;
         // return reverse(n/10, r*10+n%10);
        if(n==0)  return r;
          r=r*10+n%10;
          return reverse(n/10);
    }

     
}
