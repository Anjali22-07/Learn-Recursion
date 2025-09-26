public class GCD {
    
    public static void main(String[] args) {
        int m=16;
        int n=12;
        gcd(m,n);
    }

    public static void gcd(int m, int n){
        int hcf=0;
       for(int i=1;i<=Math.min(m, n);i++){
        if(m%i==0 && n%i==0){
            hcf=i;
        }
       }
    System.out.println("HCF is: "+hcf);
   
    }
}
