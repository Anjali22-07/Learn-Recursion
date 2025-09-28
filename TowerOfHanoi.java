public class TowerOfHanoi {
    
    public static void main(String[] args) {
         
//Using characters as towers -- where we move the disks
         hanoi(3,'S','H','D');
    }
 
    public static void hanoi(int n, char src, char helper, char dest){
       
         if(n==0)  return;

        //taing n-1 disks A to B via C
        hanoi(n-1, src, dest, helper );    //using dest as helper and helper as dest for n-1 disks

        //largest Dist from src-->dest

         System.out.println(src+"-->"+dest);

        //moving disks from B to C via A

        hanoi(n-1, helper, src , dest);
    }

}
