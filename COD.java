public class COD {

    static int cod(int n ){
        if(n>=0 && n<=9){
            return 1;
        }
        return cod(n/10)+1;
    }
    
    public static void main(String[] args) {
        
        System.out.println("The number of digits in a number"+cod(5683));
    }
}
