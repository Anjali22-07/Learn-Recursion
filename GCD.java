public class GCD {
    
    public static void main(String[] args) {
        int m=16;
        int n=12;
       int hcf= gcd(m,n);
       System.out.println("hcf of numbers is :"+hcf);
    }

    public static int gcd(int a, int b){
    //     int hcf=0;
    //    for(int i=1;i<=Math.min(m, n);i++){
    //     if(m%i==0 && n%i==0){
    //         hcf=i;
    //     }
    //    }
    // System.out.println("HCF is: "+hcf);

     if(b%a==0)  return a;

        return gcd(b%a, a);
   
    }
}
