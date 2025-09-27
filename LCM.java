public class LCM {
    
    public static void main(String[] args) {
        int m=24;
        int n=12;
         
       int lcm= findingLcm(m,n);
       System.out.println("the lcm of two numbers is :"+lcm);
    }

    public static int findingLcm(int m, int n){
         
          int hcf= gcd(m,n);

          return m*n/hcf;

    }

    public static int gcd(int a, int b){
        if(b%a==0)  return b;

        return gcd(b%a, a);
    }
}
