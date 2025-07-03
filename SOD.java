public class SOD {

    static int sod(int n){

        if(n>=0 && n<=9){
            return n;
        }

       
        return sod(n/10)+n%10;


    }

    public static void main(String[] args) {
        System.out.println("The sum of the digits of an Integer is:"+sod(512));
    }
    
}
