public class Factors {

   static int i=1;

    public static void main(String[] args) {
        int n=12;
       // result=n;
        factor(n,i);
    }

    public static void factor(int m, int r){
        
        // for(int i=1;i<=m;i++){
        //     if(m%i==0){
        //         int n=m/i;
        //         System.out.print(n+" ");
          //  }
          if(r>m)  return;

           if(m%r==0)        
            System.out.println(r);
            factor(m,r+1);
           }
        }
        
             
             
              
          
    
    

