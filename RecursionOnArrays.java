public class RecursionOnArrays {

    public static void main(String[] args) {
        int[] arr ={24,13,23,4,5,6,77,12};
        printArray(arr,0);
        System.out.println();
         printReverseArray(arr,0);
         System.out.println();
         int ele=23;
         System.out.println(arrayExists(arr, 0,ele));
    }

    public static void  printArray(int[] arr, int idx){
             if(idx==arr.length)   return;
        System.out.print(arr[idx]+" ");
        printArray(arr, idx+1);
    }
    
     public static void  printReverseArray(int[] arr, int idx){
             if(idx==arr.length)   return;
     
        printArray(arr, idx+1);
           System.out.print(arr[idx]+" ");
    }

    //Linear search in array using recursion 

     public static boolean  arrayExists(int arr[],int idx,  int ele){

           //base case 
            if(idx==arr.length) return false;
             //self work
          if(arr[idx]==ele) return true;

          //recusrion spell
          return arrayExists(arr, idx+1, ele);

     }
}
